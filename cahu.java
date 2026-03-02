final class cahu extends ibsl implements ibtw {
    final caie a;
    final gra b;

    public cahu(caie caie0, gra gra0, ibrl ibrl0) {
        this.a = caie0;
        this.b = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cahu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cahu(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        gra gra0 = this.b;
        Boolean boolean0 = caib.a(gra0);
        if(ibuq.m(boolean0, Boolean.valueOf(true))) {
            this.a.e.a();
            caib.e(gra0);
            return ibom.a;
        }
        if(ibuq.m(boolean0, Boolean.valueOf(false))) {
            caib.e(gra0);
            return ibom.a;
        }
        if(boolean0 == null) {
            return ibom.a;
        }
        throw new ibnq();
    }
}

