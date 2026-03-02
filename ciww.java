public final class ciww {
    public final gged_interceptors a;

    public ciww() {
        throw null;
    }

    public ciww(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null nccs");
        }
        this.a = gged0;
    }

    public final gmcd a() {
        gged_interceptors gged0 = this.a;
        ggdy ggdy0 = gged_interceptors.e(gged0.size());
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ciyp ciyp0 = (ciyp)gged0.get(v1);
            ggdy0.i(glzd.f(ciyp0.a(), new ciwu(ciyp0), gmap.a));
        }
        return glzd.f(gmbu.e(ggdy0.h()), new ciwt(), gmap.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ciww) ? ggia.i(this.a, ((ciww)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "NccChecker{nccs=" + this.a.toString() + "}";
    }
}

