final class iha extends ibur implements ibth {
    final ihc a;

    public iha(ihc ihc0) {
        this.a = ihc0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        ibp ibp1;
        ihc ihc0 = this.a;
        ihy ihy0 = ihc0.p().x;
        if(ihy0 == null) {
            ibp1 = new ibl(igc.a(ihc0.o()));
        }
        else {
            ibp ibp0 = ihy0.m;
            ibp1 = ibp0 == null ? new ibl(igc.a(ihc0.o())) : ibp0;
        }
        ibts ibts0 = ihc0.C;
        hpn hpn0 = ihc0.D;
        if(hpn0 != null) {
            ibp1.w(ihc0.p(), ihc0.E, hpn0, ihc0.F);
            return ibom.a;
        }
        if(ibts0 == null) {
            ibp1.t(ihc0.p(), ihc0.E, ihc0.F);
            return ibom.a;
        }
        ibp1.v(ihc0.p(), ihc0.E, ihc0.F, ibts0);
        return ibom.a;
    }
}

