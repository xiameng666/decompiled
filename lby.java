final class lby extends ibsl implements ibtw {
    int a;
    final lcc b;
    final ibtw c;
    private Object d;

    public lby(lcc lcc0, ibtw ibtw0, ibrl ibrl0) {
        this.b = lcc0;
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lby)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lby(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.d;
        icbr icbr0 = new icbr();
        lec lec0 = this.b.d.a();
        ibrt ibrt0 = icck0.c();
        lcu lcu0 = new lcu(this.c, icbr0, lec0, ibrt0);
        ldx ldx0 = this.b.f;
        Object object2 = ldx0.c.b(lcu0);
        if((object2 instanceof icgy)) {
            Throwable throwable0 = icha.b(object2);
            if(throwable0 == null) {
                throw new ichg("Channel was closed normally");
            }
            throw throwable0;
        }
        if(!icha.c(object2)) {
            throw new IllegalStateException("Check failed.");
        }
        if(ldx0.d.a.getAndIncrement() == 0) {
            ldw ldw0 = new ldw(ldx0, null);
            icbb.b(ldx0.a, null, null, ldw0, 3);
        }
        this.a = 1;
        Object object3 = icbr0.F(this);
        return object3 == object1 ? object1 : object3;
    }
}

