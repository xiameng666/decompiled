public enum aaku {
    INSTANT(0, 0),
    PUSH(0x7F01000E, 0x7F010013, true),  // anim:as_slide_in_from_end
    POP(0, 0x7F010010),  // anim:as_slide_out_to_end
    PAN_START(0x7F01000F, 0x7F010010),  // anim:as_slide_in_from_start
    PAN_END(0x7F01000E, 0x7F010011),  // anim:as_slide_in_from_end
    FADE_IN(0x7F01000C, 0x7F010013),  // anim:as_fade_in
    CROSS_FADE(0x7F01000C, 0x7F01000D);  // anim:as_fade_in

    public final int h;
    public final int i;
    public final boolean j;

    private aaku(int v1, int v2) {
        this(v1, v2, false);
    }

    private aaku(int v1, int v2, boolean z) {
        this.h = v1;
        this.i = v2;
        this.j = z;
    }
}

