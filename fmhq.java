public final class fmhq {
    private String a;
    private String b;
    private gged_interceptors c;
    private int d;
    private String e;
    private byte f;

    public fmhq() {
    }

    public fmhq(fmhr fmhr0) {
        this.a = fmhr0.b;
        this.b = fmhr0.c;
        this.c = fmhr0.d;
        this.d = fmhr0.e;
        this.e = fmhr0.f;
        this.f = 1;
    }

    public final fmhr a() {
        if(this.f == 1 && this.a != null && this.b != null && this.c != null && this.e != null) {
            return new fmhr(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" id");
        }
        if(this.b == null) {
            stringBuilder0.append(" messageId");
        }
        if(this.c == null) {
            stringBuilder0.append(" suggestions");
        }
        if(this.f == 0) {
            stringBuilder0.append(" renderStyle");
        }
        if(this.e == null) {
            stringBuilder0.append(" hintText");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null hintText");
        }
        this.e = s;
    }

    public final void c(String s) {
        if(s == null) {
            throw new NullPointerException("Null id");
        }
        this.a = s;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageId");
        }
        this.b = s;
    }

    public final void e(int v) {
        this.d = v;
        this.f = 1;
    }

    public final void f(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null suggestions");
        }
        this.c = gged0;
    }
}

