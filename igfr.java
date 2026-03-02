final class igfr extends igff implements igfh, igfn {
    static final igfr a;

    static {
        igfr.a = new igfr();
    }

    @Override  // igff, igfn
    public final long a(Object object0, igcm igcm0) {
        return ((igdd)object0).b;
    }

    @Override  // igff, igfn
    public final igcm b(Object object0, igcw igcw0) {
        igcm igcm0 = igev.F;
        if(igcm0 == null) {
            return igev.R(igcw0);
        }
        return igcm0.B() == igcw0 ? igcm0 : igcm0.d(igcw0);
    }

    @Override  // igfh
    public final Class c() {
        return igdk.class;
    }
}

