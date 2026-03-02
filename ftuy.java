public final class ftuy {
    private ftts a;
    private ftts b;
    private boolean c;
    private ftvd d;
    private ftuz e;
    private ftvb f;
    private frxs g;
    private boolean h;
    private byte i;

    public ftuy() {
    }

    public ftuy(ftuw ftuw0) {
        this.a = ftuw0.a;
        this.b = ftuw0.b;
        this.c = ftuw0.c;
        this.d = ftuw0.d;
        this.e = ftuw0.e;
        this.f = ftuw0.f;
        this.g = ftuw0.g;
        this.h = ftuw0.h;
        this.i = -1;
    }

    public final ftuw a() {
        return new ftuw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ~this.i & 0xFF);
    }

    public final void b(ftuz ftuz0) {
        if(ftuz0 == null) {
            throw new NullPointerException("Null buttonArrangement");
        }
        this.e = ftuz0;
        this.i = (byte)(this.i | 16);
    }

    public final void c(boolean z) {
        this.h = z;
        this.i = (byte)(this.i | 0xFFFFFF80);
    }

    public final void d(frxs frxs0) {
        this.g = frxs0;
        this.i = (byte)(this.i | 0x40);
    }

    public final void e(ftvb ftvb0) {
        if(ftvb0 == null) {
            throw new NullPointerException("Null buttonPlacement");
        }
        this.f = ftvb0;
        this.i = (byte)(this.i | 0x20);
    }

    public final void f(ftvd ftvd0) {
        if(ftvd0 == null) {
            throw new NullPointerException("Null buttonWidth");
        }
        this.d = ftvd0;
        this.i = (byte)(this.i | 8);
    }

    public final void g(boolean z) {
        this.c = z;
        this.i = (byte)(this.i | 4);
    }

    public final void h(ftts ftts0) {
        this.a = ftts0;
        this.i = (byte)(this.i | 1);
    }

    public final void i(ftts ftts0) {
        this.b = ftts0;
        this.i = (byte)(this.i | 2);
    }
}

