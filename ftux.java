public final class ftux {
    public fryv a;
    public ibth b;
    public short c;
    private frxs d;
    private boolean e;
    private ftvc f;
    private fryk g;
    private ftva h;
    private int i;
    private gged_interceptors j;
    private ibth k;

    public ftux() {
    }

    public ftux(ftts ftts0) {
        this.a = ftts0.a;
        this.d = ftts0.b;
        this.e = ftts0.c;
        this.f = ftts0.d;
        this.g = ftts0.e;
        this.h = ftts0.f;
        this.i = ftts0.g;
        this.j = ftts0.h;
        this.k = ftts0.i;
        this.b = ftts0.j;
        this.c = 0x3FF;
    }

    public final ftts a() {
        int v = ~this.c;
        if((v & 0x201) != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.c & 1) == 0) {
                stringBuilder0.append(" text");
            }
            if((this.c & 0x200) == 0) {
                stringBuilder0.append(" onClick");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new ftts(this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.b, v & 510);
    }

    public final void b(ftva ftva0) {
        if(ftva0 == null) {
            throw new NullPointerException("Null buttonContent");
        }
        this.h = ftva0;
        this.c = (short)(this.c | 0x20);
    }

    public final void c(ftvc ftvc0) {
        if(ftvc0 == null) {
            throw new NullPointerException("Null buttonStyle");
        }
        this.f = ftvc0;
        this.c = (short)(this.c | 8);
    }

    public final void d(fryk fryk0) {
        this.g = fryk0;
        this.c = (short)(this.c | 16);
    }

    public final void e(frxs frxs0) {
        this.d = frxs0;
        this.c = (short)(this.c | 2);
    }

    public final void f(int v) {
        this.i = v;
        this.c = (short)(this.c | 0x40);
    }

    public final void g(fhvp[] arr_fhvp) {
        this.j = gged_interceptors.k(arr_fhvp);
        this.c = (short)(this.c | 0x80);
    }

    public final void h(boolean z) {
        this.e = z;
        this.c = (short)(this.c | 4);
    }
}

