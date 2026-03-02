final class chf extends ibsl implements ibtw {
    Object a;
    int b;
    final icgv c;
    final chb d;
    final gui e;
    final gui f;
    private Object g;

    public chf(icgv icgv0, chb chb0, gui gui0, gui gui1, ibrl ibrl0) {
        this.c = icgv0;
        this.d = chb0;
        this.e = gui0;
        this.f = gui1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((chf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new chf(this.c, this.d, this.e, this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            icck icck1 = (icck)this.g;
            object2 = this.c.A();
            icck0 = icck1;
        }
        else {
            object2 = this.a;
            icck0 = (icck)this.g;
            ibnx.b(object0);
            goto label_16;
        }
        while(true) {
            this.g = icck0;
            this.a = object2;
            this.b = 1;
            object0 = ((icgh)object2).a(this);
            if(object0 == object1) {
                return object1;
            }
        label_16:
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object3 = ((icgh)object2).b();
            Object object4 = icha.a(this.c.m());
            icbb.b(icck0, null, null, new che((object4 == null ? object3 : object4), this.d, this.e, this.f, null), 3);
        }
        return ibom.a;
    }
}

