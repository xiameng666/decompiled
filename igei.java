import j..util.concurrent.ConcurrentHashMap;

public final class igei extends igdv {
    private static final igcp F = null;
    private static final ConcurrentHashMap G = null;
    private static final igei H = null;
    private static final long serialVersionUID = 0xCFC7C21CFADD45F2L;

    static {
        igei.F = new igee();
        igei.G = new ConcurrentHashMap();
        igei.H = igei.Q(igcw.b);
    }

    private igei(igcm igcm0, Object object0) {
        super(igcm0, object0);
    }

    @Override  // igdv
    protected final void P(igdu igdu0) {
        if(this.b == null) {
            igdu0.l = iggq.i(igda.a);
            igdu0.E = new iggh(new iggo(this, igdu0.E), 0x21F);
            igdu0.F = new iggb(igdu0.E, igdu0.l, igcr.c);
            igdu0.B = new iggh(new iggo(this, igdu0.B), 0x21F);
            igdu0.H = new iggc(new iggh(igdu0.F, 99), igdu0.l, igcr.d);
            igdu0.k = igdu0.H.w();
            igdu0.G = new iggh(new iggl(((iggc)igdu0.H)), igcr.e);
            igdu0.C = new iggh(new iggl(igdu0.B, igdu0.k, igcr.j), igcr.j);
            igdu0.I = igei.F;
        }
    }

    public static igei Q(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        ConcurrentHashMap concurrentHashMap0 = igei.G;
        igei igei0 = (igei)concurrentHashMap0.get(igcw0);
        if(igei0 == null) {
            igei igei1 = new igei(igen.U(igcw0, null, 4), null);
            igei igei2 = new igei(igfb.Q(igei1, new igco(1, 1, 1, 0, 0, 0, 0, igei1), null), "");
            igei igei3 = (igei)concurrentHashMap0.putIfAbsent(igcw0, igei2);
            return igei3 == null ? igei2 : igei3;
        }
        return igei0;
    }

    @Override  // igcm
    public final igcm c() {
        return igei.H;
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        return igcw0 == this.B() ? this : igei.Q(igcw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igei) ? this.B().equals(((igei)object0).B()) : false;
    }

    @Override
    public final int hashCode() {
        return this.B().hashCode() + 499287079;
    }

    private Object readResolve() {
        return this.a == null ? igei.H : igei.Q(this.a.B());
    }

    @Override  // igcm
    public final String toString() {
        igcw igcw0 = this.B();
        return igcw0 == null ? "BuddhistChronology" : "BuddhistChronology[" + igcw0.d + "]";
    }
}

