final class epoz extends ibsl implements ibtx {
    final eppe a;

    public epoz(eppe eppe0, ibrl ibrl0) {
        this.a = eppe0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new epoz(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.j();
        return ibom.a;
    }
}

