package com.google.android.gms.cast.mirroring.protocol;

import gqah;
import ibsm;
import ibsn;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class Codec extends Enum {
    private static final ibsm $ENTRIES;
    private static final Codec[] $VALUES;
    @gqah(a = "aac")
    public static final enum Codec AAC;
    @gqah(a = "av1")
    public static final enum Codec AV1;
    @gqah(a = "h264")
    public static final enum Codec H264;
    @gqah(a = "h265")
    public static final enum Codec H265;
    @gqah(a = "opus")
    public static final enum Codec OPUS;
    @gqah(a = "vp8")
    public static final enum Codec VP8;
    @gqah(a = "vp9")
    public static final enum Codec VP9;

    private static final Codec[] $values() {
        return new Codec[]{Codec.AAC, Codec.OPUS, Codec.H264, Codec.H265, Codec.VP8, Codec.VP9, Codec.AV1};
    }

    static {
        Codec.AAC = new Codec("AAC", 0);
        Codec.OPUS = new Codec("OPUS", 1);
        Codec.H264 = new Codec("H264", 2);
        Codec.H265 = new Codec("H265", 3);
        Codec.VP8 = new Codec("VP8", 4);
        Codec.VP9 = new Codec("VP9", 5);
        Codec.AV1 = new Codec("AV1", 6);
        Codec[] arr_codec = Codec.$values();
        Codec.$VALUES = arr_codec;
        Codec.$ENTRIES = ibsn.a(arr_codec);
    }

    private Codec(String s, int v) {
        super(s, v);
    }

    public static ibsm getEntries() {
        return Codec.$ENTRIES;
    }

    public static Codec valueOf(String s) {
        return (Codec)Enum.valueOf(Codec.class, s);
    }

    public static Codec[] values() {
        return (Codec[])Codec.$VALUES.clone();
    }
}

