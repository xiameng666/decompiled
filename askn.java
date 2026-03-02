final class askn extends ibsl implements ibtw {
    Object a;
    final askr b;

    public askn(askr askr0, ibrl ibrl0) {
        this.b = askr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askn)this.c(((aqqh)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new askn(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        aqqh aqqh0 = (aqqh)this.a;
        do {
            Object object1 = this.b.j.b();
            Boolean boolean0 = (Boolean)object1;
        }
        while(!this.b.j.h(object1, Boolean.valueOf((aqqh0 instanceof aqqf) && ((asmv)((aqqf)aqqh0).a).a)));
        return ibom.a;
    }
}

