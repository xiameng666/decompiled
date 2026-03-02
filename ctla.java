final class ctla extends ibsl implements ibtx {
    final ichm a;

    public ctla(ichm ichm0, ibrl ibrl0) {
        this.a = ichm0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new ctla(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ichp.a(this.a);
        return ibom.a;
    }
}

