public final class fmhr {
    public static final String a = "fmhr";
    public final String b;
    public final String c;
    public final gged_interceptors d;
    public final int e;
    public final String f;

    static {
    }

    public fmhr() {
        throw null;
    }

    public fmhr(String s, String s1, gged_interceptors gged0, int v, String s2) {
        this.b = s;
        this.c = s1;
        this.d = gged0;
        this.e = v;
        this.f = s2;
    }

    public static fmhq a() {
        fmhq fmhq0 = new fmhq();
        fmhq0.b("");
        return fmhq0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmhr) && this.b.equals(((fmhr)object0).b) && this.c.equals(((fmhr)object0).c) && ggia.i(this.d, ((fmhr)object0).d) && this.e == ((fmhr)object0).e && this.f.equals(((fmhr)object0).f);
    }

    @Override
    public final int hashCode() {
        return (this.e ^ (((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "SuggestionList{id=" + this.b + ", messageId=" + this.c + ", suggestions=" + this.d + ", renderStyle=" + this.e + ", hintText=" + this.f + "}";
    }
}

