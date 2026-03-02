public final class erwj extends ibsl implements ibtx {
    int a;
    Object b;
    final erwq c;
    private Object d;

    public erwj(ibrl ibrl0, erwq erwq0) {
        this.c = erwq0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        erwj erwj0 = new erwj(((ibrl)object2), this.c);
        erwj0.d = (icih)object0;
        erwj0.b = object1;
        return erwj0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.d;
            icht icht0 = new icht(new erwe(this.c, ((String)this.b), null));
            this.a = 1;
            if(icir.c(((icih)object2), icht0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

