public final class bmbd {
    public static final byte[] a;
    public static final byte[] b;
    public final int c;
    public final int d;

    static {
        bmbd.a = new byte[]{(byte)0xA0, 0, 0, 6, 71, 0x2F, 0, 1};
        bmbd.b = new byte[]{(byte)0xA0, 0, 0, 5, 39, 16, 2, 1};
    }

    public bmbd(int v) {
        this.d = v;
        this.c = bmbb.b(v);
    }

    public final bmbb a(byte[] arr_b, byte[] arr_b1, boolean z) {
        bmbb bmbb0 = new bmbb(0, 1, this.d);
        bmbb0.e(((byte)(z ? 0xFFFFFF83 : 3)));
        bmbb0.c(arr_b1);
        bmbb0.c(arr_b);
        bmbb0.d(this.c);
        return bmbb0;
    }

    public final bmbb b() {
        bmbb bmbb0 = new bmbb(0, 3, this.d);
        bmbb0.d(this.c);
        return bmbb0;
    }
}

