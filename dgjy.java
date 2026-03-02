final class dgjy extends ibsl implements ibtx {
    final dgkd a;

    public dgjy(dgkd dgkd0, ibrl ibrl0) {
        this.a = dgkd0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new dgjy(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        synchronized(this.a) {
            this.a.b.clear();
        }
        return ibom.a;
    }
}

