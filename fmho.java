public final class fmho {
    private int a;
    private String b;
    private gfsx c;
    private fmbi d;
    private String e;
    private byte f;

    public fmho() {
        throw null;
    }

    public fmho(byte[] arr_b) {
        this.c = gfqx.a;
    }

    public final fmhp a() {
        if(this.f == 1 && this.b != null && this.d != null && this.e != null) {
            return new fmhp(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.f == 0) {
            stringBuilder0.append(" id");
        }
        if(this.b == null) {
            stringBuilder0.append(" text");
        }
        if(this.d == null) {
            stringBuilder0.append(" action");
        }
        if(this.e == null) {
            stringBuilder0.append(" secondaryText");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(fmbi fmbi0) {
        if(fmbi0 == null) {
            throw new NullPointerException("Null action");
        }
        this.d = fmbi0;
    }

    public final void c(int v) {
        this.a = v;
        this.f = 1;
    }

    public final void d(fmfh fmfh0) {
        this.c = gfsx.m(fmfh0);
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.e = s;
    }

    public final void f(String s) {
        if(s == null) {
            throw new NullPointerException("Null text");
        }
        this.b = s;
    }
}

