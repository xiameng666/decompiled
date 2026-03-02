public final class fmfg {
    private byte[] a;
    private int b;
    private int c;
    private gfsx d;
    private String e;
    private byte f;

    public fmfg() {
        throw null;
    }

    public fmfg(byte[] arr_b) {
        this.d = gfqx.a;
    }

    public final fmfh a() {
        if(this.f == 3 && this.a != null && this.e != null) {
            return new fmfh(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" icon");
        }
        if((this.f & 1) == 0) {
            stringBuilder0.append(" width");
        }
        if((this.f & 2) == 0) {
            stringBuilder0.append(" height");
        }
        if(this.e == null) {
            stringBuilder0.append(" talkBackDescription");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.d = gfsx.m(Integer.valueOf(v));
    }

    public final void c(int v) {
        this.c = v;
        this.f = (byte)(this.f | 2);
    }

    public final void d(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("Null icon");
        }
        this.a = arr_b;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null talkBackDescription");
        }
        this.e = s;
    }

    public final void f(int v) {
        this.b = v;
        this.f = (byte)(this.f | 1);
    }
}

