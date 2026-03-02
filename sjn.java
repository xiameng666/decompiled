public enum sjn {
    HIGH(0, 0x7F0600C1, 0x7F0600BD, 0x7F060FE8, 0x7F060FEC),  // color:banner_background_attention_high
    MEDIUM(1, 0x7F0600C3, 0x7F0600BF, 0x7F060FEA, 0x7F060FEE),  // color:banner_background_attention_medium
    LOW(2, 0x7F0600C2, 0x7F0600BE, 0x7F060FE9, 0x7F060FED),  // color:banner_background_attention_low
    NORMAL(3, 0x7F0600C4, 0x7F0600C0, 0x7F060FEB, 0x7F060FEF);  // color:banner_background_attention_normal

    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    private sjn(int v1, int v2, int v3, int v4, int v5) {
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = v4;
        this.i = v5;
    }
}

