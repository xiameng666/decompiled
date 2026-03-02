public final class fmhp {
    public static final String a = "fmhp";
    public final int b;
    public final String c;
    public final gfsx d;
    public final fmbi e;
    public final String f;

    static {
    }

    public fmhp() {
        throw null;
    }

    public fmhp(int v, String s, gfsx gfsx0, fmbi fmbi0, String s1) {
        this.b = v;
        this.c = s;
        this.d = gfsx0;
        this.e = fmbi0;
        this.f = s1;
    }

    public static fmho a() {
        fmho fmho0 = new fmho(null);
        fmho0.e("");
        return fmho0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmhp) && this.b == ((fmhp)object0).b && this.c.equals(((fmhp)object0).c) && this.d.equals(((fmhp)object0).d) && this.e.equals(((fmhp)object0).e) && this.f.equals(((fmhp)object0).f);
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() ^ ((((this.b ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Suggestion{id=" + this.b + ", text=" + this.c + ", lighterIcon=" + this.d + ", action=" + this.e + ", secondaryText=" + this.f + "}";
    }
}

