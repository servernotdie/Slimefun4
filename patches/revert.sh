#!/usr/bin/env bash
set -euo pipefail

FIX_COMMIT="${1:-a19f1e823f1891434ccf83b138f8b77f8927a3a6}"

echo "==> Reverting mytai20100 fix commit ${FIX_COMMIT} (source only, patches/ kept)"
git revert --no-commit "$FIX_COMMIT"
git restore --staged --source=HEAD -- patches/ 2>/dev/null || true
git restore --source=HEAD -- patches/ 2>/dev/null || true
git commit -m "revert: undo mytai20100 fix ${FIX_COMMIT}"
echo "==> Done. Source restored to pre-fix state; patches/*.patch untouched."
