final class begf extends ibsl implements ibts {
    int a;
    final begh b;

    public begf(begh begh0, ibrl ibrl0) {
        this.b = begh0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new begf(this.b, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.b(this);
        return object2 == object1 ? object1 : object2;
    }
}

