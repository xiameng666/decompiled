final class bvhx extends ibsl implements ibtx {
    Object a;
    Object b;

    public bvhx(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bvhx bvhx0 = new bvhx(((ibrl)object2));
        bvhx0.a = (bvia)object0;
        bvhx0.b = (String)object1;
        return bvhx0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        Object object2 = this.b;
        if(object1 == null) {
            String s = (String)object2;
            return new bvia(s, s);
        }
        return new bvia(((bvia)object1).a, ((String)object2));
    }
}

