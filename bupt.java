final class bupt extends ibsl implements ibtw {
    int a;
    final bupw b;
    private Object c;

    public bupt(bupw bupw0, ibrl ibrl0) {
        this.b = bupw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bupt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bupt(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck icck0 = (icck)this.c;
            try {
                hivu hivu0 = hivt.a(((ProtoLiteMessage)hivs.a).v_newBuilder());
                hivu0.b();
                hivs hivs0 = hivu0.a();
                this.a = 1;
                object0 = this.b.i.a(hivs0, this);
                return object0 == object1 ? object1 : new ibnw(((hivx)object0));
            }
            catch(Throwable throwable0) {
                return new ibnw(ibnx.a(throwable0));
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                return new ibnw(ibnx.a(throwable0));
            }
        }
        return new ibnw(((hivx)object0));
    }
}

