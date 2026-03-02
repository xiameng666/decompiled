public final class fmfe {
    public static final String a = "fmfe";
    public final gged_interceptors b;
    public final gged_interceptors c;

    static {
    }

    public fmfe() {
        throw null;
    }

    public fmfe(gged_interceptors gged0, gged_interceptors gged1) {
        this.b = gged0;
        this.c = gged1;
    }

    public static fmfd a() {
        fmfd fmfd0 = new fmfd();
        fmfd0.b(ggna.a);
        fmfd0.c(ggna.a);
        return fmfd0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmfe) && ggia.i(this.b, ((fmfe)object0).b) && ggia.i(this.c, ((fmfe)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "DecorationTransitionAction{decorationIdsToAdd=" + this.b + ", decorationIdsToRemove=" + this.c + "}";
    }
}

