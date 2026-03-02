package com.google.android.libraries.bluetooth.fastpair;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class BroadcastConstants.Result extends Enum {
    private static final BroadcastConstants.Result[] $VALUES;
    public static final enum BroadcastConstants.Result FAILURE;
    public static final enum BroadcastConstants.Result SUCCESS;

    private static BroadcastConstants.Result[] $values() {
        return new BroadcastConstants.Result[]{BroadcastConstants.Result.SUCCESS, BroadcastConstants.Result.FAILURE};
    }

    static {
        BroadcastConstants.Result.SUCCESS = new BroadcastConstants.Result("SUCCESS", 0);
        BroadcastConstants.Result.FAILURE = new BroadcastConstants.Result("FAILURE", 1);
        BroadcastConstants.Result.$VALUES = BroadcastConstants.Result.$values();
    }

    private BroadcastConstants.Result(String s, int v) {
        super(s, v);
    }

    public static BroadcastConstants.Result valueOf(String s) {
        return (BroadcastConstants.Result)Enum.valueOf(BroadcastConstants.Result.class, s);
    }

    public static BroadcastConstants.Result[] values() {
        return (BroadcastConstants.Result[])BroadcastConstants.Result.$VALUES.clone();
    }
}

