public final class hmlm {
    public int a;
    public int b;
    public int c;
    public int d;

    public hmlm() {
        this.a = 0;
        this.b = 0;
        this.d = 0x7FFFFFFF;
        this.c = 0;
    }

    public hmlm(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static hmlm a(hmlm hmlm0) {
        return hmlm0 == null ? null : new hmlm(hmlm0.a, hmlm0.b, hmlm0.c, hmlm0.d);
    }

    public final void b(hmlm hmlm0) {
        this.a = hmlm0.a;
        this.b = hmlm0.b;
        this.c = hmlm0.c;
        this.d = hmlm0.d;
    }

    public final void c(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final String toString() {
        return "Range{startByteIdx=" + this.a + ", startBitIdx=" + this.b + ", endBitIdx=" + this.c + ", endByteIdx=" + this.d + "}";
    }
}

