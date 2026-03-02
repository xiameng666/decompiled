public final class fmgs {
    public fmbi a;
    private String b;
    private gfsx c;
    private gfsx d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private byte i;

    public fmgs() {
        throw null;
    }

    public fmgs(byte[] arr_b) {
        this.c = gfqx.a;
        this.d = gfqx.a;
    }

    public final fmgt a() {
        if(this.i == 15) {
            String s = this.b;
            if(s != null) {
                fmbi fmbi0 = this.a;
                if(fmbi0 != null) {
                    return new fmgt(s, this.c, this.d, fmbi0, this.e, this.f, this.g, this.h);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" text");
        }
        if(this.a == null) {
            stringBuilder0.append(" action");
        }
        if((this.i & 1) == 0) {
            stringBuilder0.append(" textColor");
        }
        if((this.i & 2) == 0) {
            stringBuilder0.append(" backgroundColor");
        }
        if((this.i & 4) == 0) {
            stringBuilder0.append(" borderColor");
        }
        if((this.i & 8) == 0) {
            stringBuilder0.append(" enabled");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        this.c = gfsx.m(s);
    }

    public final void c(int v) {
        this.f = v;
        this.i = (byte)(this.i | 2);
    }

    public final void d(int v) {
        this.g = v;
        this.i = (byte)(this.i | 4);
    }

    public final void e(boolean z) {
        this.h = z;
        this.i = (byte)(this.i | 8);
    }

    public final void f(fmfh fmfh0) {
        this.d = gfsx.m(fmfh0);
    }

    public final void g(String s) {
        if(s == null) {
            throw new NullPointerException("Null text");
        }
        this.b = s;
    }

    public final void h(int v) {
        this.e = v;
        this.i = (byte)(this.i | 1);
    }
}

