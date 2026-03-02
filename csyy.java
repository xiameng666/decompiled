final class csyy extends ibsl implements ibtw {
    int a;
    Object b;
    final cszf c;

    public csyy(cszf cszf0, ibrl ibrl0) {
        this.c = cszf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((csyy)this.c(((alfw)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new csyy(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            alfw alfw0 = (alfw)this.b;
            ibnx.b(object0);
            return object0;
        }
        ibnx.b(object0);
        alfw alfw1 = (alfw)this.b;
        this.b = alfw1;
        this.a = 1;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        alfw1.c(new csyw(null, icbk0));
        alfw1.a("multidevice");
        Object object2 = icbk0.k();
        if(object2 == object1) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

