public final class bvji extends ibsl implements ibtx {
    int a;
    Object b;
    final bvkk c;
    private Object d;

    public bvji(ibrl ibrl0, bvkk bvkk0) {
        this.c = bvkk0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bvji bvji0 = new bvji(((ibrl)object2), this.c);
        bvji0.d = (icih)object0;
        bvji0.b = object1;
        return bvji0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.d;
            bvfx bvfx0 = (bvfx)this.b;
            icig icig0 = this.c.e.b();
            this.a = 1;
            if(icir.c(((icih)object2), icig0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

