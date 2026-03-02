final class cbsv extends ibsl implements ibtx {
    boolean a;
    Object b;

    public cbsv(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cbsv cbsv0 = new cbsv(((ibrl)object2));
        cbsv0.a = ((Boolean)object0).booleanValue();
        cbsv0.b = (cbuy)object1;
        return cbsv0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return new cbuz(this.a, ((cbuy)this.b));
    }
}

