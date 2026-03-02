public final class caec extends ibsl implements ibtw {
    final caed a;
    final String b;

    public caec(caed caed0, String s, ibrl ibrl0) {
        this.a = caed0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caec)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new caec(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        caeq caeq0 = this.a.a.v();
        caer caer0 = new caer();
        oqj.b(caeq0.a, false, true, caer0);
        caes caes0 = new caes(caeq0, new caep(0L, this.b));
        oqj.b(caeq0.a, false, true, caes0);
        return ibom.a;
    }
}

