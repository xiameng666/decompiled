public final class eabg implements ibts {
    public final eabn a;

    public eabg(eabn eabn0) {
        this.a = eabn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hkjm)object0), "card");
        eagu eagu0 = this.a.ak;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        eagt eagt0 = eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d);
        ibuq.e(eagt0, "getPurpose(...)");
        return dzau.g(((hkjm)object0), eagt0);
    }
}

