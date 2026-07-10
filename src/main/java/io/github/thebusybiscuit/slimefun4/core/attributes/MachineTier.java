package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {
    BASIC("&eCơ bản"),
    AVERAGE("&6Thường"),
    MEDIUM("&aTrung bình"),
    GOOD("&2Tốt"),
    ADVANCED("&6Cao cấp"),
    END_GAME("&4Cuối game");

    private final String prefix;

    MachineTier(@Nonnull String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
