final class aslq extends ibsl implements ibtx {
    int a;
    Object b;
    Object c;
    final aslt d;

    public aslq(aslt aslt0, ibrl ibrl0) {
        this.d = aslt0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        aslq aslq0 = new aslq(this.d, ((ibrl)object2));
        aslq0.b = (aqqh)object0;
        aslq0.c = (aqqh)object1;
        return aslq0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(!(((aqqh)this.b).b() instanceof asmk) || !ibuq.m(((aqqh)this.c).b(), Boolean.valueOf(false))) {
                return aqqe.a;
            }
            this.b = null;
            this.a = 1;
            object0 = this.d.a(this);
            if(object0 == object1) {
                return object1;
            }
        }
        return (aqqh)object0;
    }
}

