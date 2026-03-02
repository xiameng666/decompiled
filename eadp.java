public final class eadp implements ibth {
    public final eaee a;

    public eadp(eaee eaee0) {
        this.a = eaee0;
    }

    @Override  // ibth
    public final Object a() {
        eaee eaee0 = this.a;
        eaca eaca0 = eaee0.aj;
        eagu eagu0 = null;
        if(eaca0 == null) {
            ibuq.j("provisionFlowHelper");
            eaca0 = null;
        }
        eabr eabr0 = new eabr();
        eagu eagu1 = eaee0.al;
        if(eagu1 == null) {
            ibuq.j("provisionData");
        }
        else {
            eagu0 = eagu1;
        }
        eaca0.f(eabr0, eagu0);
        return ibom.a;
    }
}

