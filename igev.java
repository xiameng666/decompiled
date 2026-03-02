import j..util.concurrent.ConcurrentHashMap;

public final class igev extends igdv {
    public static final igev F = null;
    private static final ConcurrentHashMap G = null;
    private static final long serialVersionUID = 0xA9C8116671375027L;

    static {
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        igev.G = concurrentHashMap0;
        igev igev0 = new igev(iget.I);
        igev.F = igev0;
        concurrentHashMap0.put(igcw.b, igev0);
    }

    private igev(igcm igcm0) {
        super(igcm0, null);
    }

    @Override  // igdv
    protected final void P(igdu igdu0) {
        if(this.a.B() == igcw.b) {
            igdu0.H = new iggc(igew.a, igcr.d);
            igdu0.k = igdu0.H.w();
            igdu0.G = new iggl(((iggc)igdu0.H), igcr.e);
            igdu0.C = new iggl(((iggc)igdu0.H), igdu0.h, igcr.j);
        }
    }

    public static igev Q() {
        return igev.R(igcw.o());
    }

    public static igev R(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        ConcurrentHashMap concurrentHashMap0 = igev.G;
        igev igev0 = (igev)concurrentHashMap0.get(igcw0);
        if(igev0 == null) {
            igev igev1 = new igev(igfe.Q(igev.F, igcw0));
            igev igev2 = (igev)concurrentHashMap0.putIfAbsent(igcw0, igev1);
            return igev2 == null ? igev1 : igev2;
        }
        return igev0;
    }

    @Override  // igcm
    public final igcm c() {
        return igev.F;
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        return igcw0 == this.B() ? this : igev.R(igcw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igev) ? this.B().equals(((igev)object0).B()) : false;
    }

    @Override
    public final int hashCode() {
        return this.B().hashCode() + 800855;
    }

    @Override  // igcm
    public final String toString() {
        igcw igcw0 = this.B();
        return igcw0 == null ? "ISOChronology" : "ISOChronology[" + igcw0.d + "]";
    }

    private Object writeReplace() {
        return new igeu(this.B());
    }
}

