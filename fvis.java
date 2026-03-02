public final class fvis {
    public final double a;
    public final fvdq b;
    public fviq c;
    public fvit d;
    public final fvbf e;

    public fvis(fvbf fvbf0, double f, fvdq fvdq0) {
        this.e = fvbf0;
        this.a = f;
        this.b = fvdq0;
    }

    static byte a(float f) {
        return (byte)(((int)(glws.a(f, 0.0f, 1.0f) * 254.0f - 128.0f)));
    }

    static float b(byte b) {
        gftb.checkTrue(b != 0x7F);
        return (((float)b) + 128.0f) / 254.0f;
    }
}

