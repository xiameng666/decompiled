final class lee extends ibsl implements ibtx {
    int a;
    private Object b;

    public lee(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        Boolean boolean0 = (Boolean)object1;
        lee lee0 = new lee(((ibrl)object2));
        lee0.b = (lci)object0;
        return lee0.jI(ibom.a);
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
        lci lci0 = (lci)this.b;
        lci0.b();
        lch lch0 = new lch(lci0, null);
        Object object2 = lcq.a(lci0.a, lch0, this);
        return object2 == object1 ? object1 : object2;
    }
}

