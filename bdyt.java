final class bdyt extends ibsl implements ibtx {
    boolean a;
    boolean b;

    public bdyt(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bdyt bdyt0 = new bdyt(((ibrl)object2));
        bdyt0.a = ((Boolean)object0).booleanValue();
        bdyt0.b = ((Boolean)object1).booleanValue();
        return bdyt0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(this.a && !this.b);
    }
}

