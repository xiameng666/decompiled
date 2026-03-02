package com.google.android.gms.container.cellophane.annotation;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ModifiedMethodMarker extends Enum {
    private static final ModifiedMethodMarker[] $VALUES;
    public static final enum ModifiedMethodMarker MARK;

    static {
        ModifiedMethodMarker.MARK = new ModifiedMethodMarker();
        ModifiedMethodMarker.$VALUES = new ModifiedMethodMarker[]{ModifiedMethodMarker.MARK};
    }

    private ModifiedMethodMarker() {
        super("MARK", 0);
    }

    public static ModifiedMethodMarker[] values() {
        return (ModifiedMethodMarker[])ModifiedMethodMarker.$VALUES.clone();
    }
}

