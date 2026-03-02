final class fnef extends ibsl implements ibtw {
    int a;
    final fnem b;

    public fnef(fnem fnem0, ibrl ibrl0) {
        this.b = fnem0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fnef)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fnef(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        Object object2 = this.b.e.get();
        ibuq.e(object2, "get(...)");
        this.a = 1;
        Object object3 = fnem.b(this.b, ((String)object2), this);
        return object3 == object1 ? object1 : object3;
    }
}

