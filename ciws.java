import j..util.Collection.-EL;

public final class ciws {
    public final gged_interceptors a;
    public final boolean b;

    public ciws() {
        throw null;
    }

    public ciws(gged_interceptors gged0, boolean z) {
        if(gged0 == null) {
            throw new NullPointerException("Null rejectedBases");
        }
        this.a = gged0;
        this.b = z;
    }

    public static ciws a(gged_interceptors gged0) {
        gged_interceptors gged1 = ((ggfp)Collection.-EL.stream(gged0).flatMap(new ciwr()).collect(ggaf.b)).v();
        return new ciws(gged1, gged1.isEmpty());
    }

    public static ciws b(hfke hfke0) {
        return new ciws(gged_interceptors.l(hfke0), false);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ciws) && ggia.i(this.a, ((ciws)object0).a) && this.b == ((ciws)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "CheckResults{rejectedBases=" + this.a.toString() + ", canLog=" + this.b + "}";
    }
}

