package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineType {
    CAPACITOR("Tụ điện"),
    GENERATOR("Máy phát điện"),
    MACHINE("Máy móc");

    private final String suffix;

    MachineType(@Nonnull String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return suffix;
    }
}
