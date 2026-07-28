#!/usr/bin/env bash
set -euo pipefail

MYDIR="$(cd "$(dirname "$0")" && pwd)"
WORKTREE="$(git rev-parse --show-toplevel)"

echo "==> Applying mytai patches (ordered)..."
for p in "$MYDIR"/000[0-9]*.patch; do
    echo "    Applying $(basename "$p")"
    git am -3 --committer-date-is-author-date "$p"
done

echo ""
if [ -f "$MYDIR/additional-translations.patch" ]; then
    echo "==> Applying additional-translations.patch..."
    git apply "$MYDIR/additional-translations.patch"
    echo "    Staging changes..."
    git add -A
    git commit -m "feat: additional translation fixes" \
        --author "mytai20100 <142713298+Mytai20100@users.noreply.github.com>" \
        --date "$(date -R)"
fi

echo ""
echo "==> Building project..."
cd "$WORKTREE"
./gradlew build --no-daemon

echo ""
echo "All patches applied and build complete."
