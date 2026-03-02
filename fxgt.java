final class fxgt {
    public final int a;
    public final long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final int h;
    private final long i;

    public fxgt(int v, long v1, int v2, long v3) {
        this.a = v;
        this.b = v1;
        this.h = v2;
        this.i = v3;
    }

    final fxgt a(int v, long v1) {
        fxgt fxgt0 = new fxgt(this.a, this.b, this.h, this.i);
        fxgt0.c = v1 - this.i;
        fxgt0.d = v;
        fxgt0.e = v - this.h;
        fxgt0.f = this.f;
        fxgt0.g = this.g;
        return fxgt0;
    }
}

