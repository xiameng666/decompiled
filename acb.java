final class acb extends ibsl implements ibtx {
    final ibuz a;

    public acb(ibuz ibuz0, ibrl ibrl0) {
        this.a = ibuz0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new acb(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.a = true;
        return ibom.a;
    }
}

