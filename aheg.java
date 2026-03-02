import j..util.Collection.-EL;

public final class aheg implements bxto {
    public final aheo a;

    public aheg(aheo aheo0) {
        this.a = aheo0;
    }

    @Override  // bxto
    public final Object a(Object object0) {
        this.a.k = (gged_interceptors)object0;
        ggfp ggfp0 = (ggfp)Collection.-EL.stream(this.a.k).map(new aheh()).collect(ggaf.b);
        this.a.n = (gged_interceptors)Collection.-EL.stream(this.a.g).filter(new ahen(ggfp0)).collect(ggaf.a);
        return gfsx.m(bxre.e);
    }
}

