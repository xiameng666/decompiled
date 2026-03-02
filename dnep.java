public final class dnep implements icih {
    final dnfc a;

    public dnep(dnfc dnfc0) {
        this.a = dnfc0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((frxf)object0) instanceof dnfd)) {
            dnfc dnfc0 = this.a;
            dmsn dmsn0 = dnfc0.ag;
            if(dmsn0 == null) {
                ibuq.j("paymentMethodActionHelper");
                dmsn0 = null;
            }
            evql evql0 = dmsn0.g(((dnfd)(((frxf)object0))).a, dnpx.d((((dnfd)(((frxf)object0))).a.c == null ? hkhr.b : ((dnfd)(((frxf)object0))).a.c)), 22);
            evql0.b(new dnec(dnfb.a));
            evql0.A(new dned(dnfc0));
        }
        return ibom.a;
    }
}

