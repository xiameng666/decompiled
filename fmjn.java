public final class fmjn {
    public fmjm a;
    public String b;
    public gfsx c;
    private int d;
    private int e;
    private int f;
    private int g;
    private byte h;

    public fmjn() {
        throw null;
    }

    public fmjn(fmjo fmjo0) {
        this.c = gfqx.a;
        this.a = fmjo0.a;
        this.b = fmjo0.b;
        this.c = fmjo0.c;
        this.d = fmjo0.d;
        this.e = fmjo0.e;
        this.f = fmjo0.f;
        this.g = fmjo0.g;
        this.h = 15;
    }

    public fmjn(byte[] arr_b) {
        this.c = gfqx.a;
    }

    public final fmjo a() {
        if(this.h != 15) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.h & 1) == 0) {
                stringBuilder0.append(" width");
            }
            if((this.h & 2) == 0) {
                stringBuilder0.append(" height");
            }
            if((this.h & 4) == 0) {
                stringBuilder0.append(" size");
            }
            if((this.h & 8) == 0) {
                stringBuilder0.append(" downloadStatus");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new fmjo(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(int v) {
        this.g = v;
        this.h = (byte)(this.h | 8);
    }

    public final void c(int v) {
        this.e = v;
        this.h = (byte)(this.h | 2);
    }

    public final void d(int v) {
        this.f = v;
        this.h = (byte)(this.h | 4);
    }

    public final void e(byte[] arr_b) {
        this.c = gfsx.m(arr_b);
    }

    public final void f(int v) {
        this.d = v;
        this.h = (byte)(this.h | 1);
    }
}

