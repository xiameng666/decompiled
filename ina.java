final class ina extends ibsl implements ibtw {
    int a;
    Object b;
    final inb c;

    public ina(inb inb0, ibrl ibrl0) {
        this.c = inb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ina)this.c(((ipt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ina(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            ipt ipt0 = (ipt)this.b;
            this.b = ipt0;
            this.a = 1;
            icbk icbk0 = new icbk(ibsc.c(this), 1);
            icbk0.z();
            this.c.b.a.c();
            jhz jhz0 = new jhz(this.c.b, this.c.b.a);
            this.c.b.b.set(jhz0);
            icbk0.d(new imz(ipt0, this.c));
            Object object2 = icbk0.k();
            if(object2 == object1) {
                ibsi.b(this);
            }
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            ipt ipt1 = (ipt)this.b;
            ibnx.b(object0);
        }
        throw new ibnm();
    }
}

