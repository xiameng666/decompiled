public final class fmhv {
    public final String a;
    public final gged_interceptors b;

    public fmhv() {
        throw null;
    }

    public fmhv(String s, gged_interceptors gged0) {
        this.a = s;
        this.b = gged0;
    }

    public final String a() {
        String s = this.a;
        int v = 0;
        while(true) {
            gged_interceptors gged0 = this.b;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            fmhu fmhu0 = (fmhu)gged0.get(v);
            String s1 = fmhu0.a;
            String s2 = flbc.a().b(fmhu0.b);
            if(fmhu0.b != 0) {
                s = gfta.c(s2) ? "" : s.replace(s1, s2);
            }
            ++v;
            if(gfta.c(s)) {
                return "";
            }
        }
        return s;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmhv) && this.a.equals(((fmhv)object0).a) && ggia.i(this.b, ((fmhv)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "UrlAction{url=" + this.a + ", replacements=" + this.b + "}";
    }
}

