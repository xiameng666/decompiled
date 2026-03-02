final class dlzz extends ibsl implements ibtw {
    int a;
    final hjwe b;
    final dmaa c;

    public dlzz(hjwe hjwe0, dmaa dmaa0, ibrl ibrl0) {
        this.b = hjwe0;
        this.c = dmaa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlzz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlzz(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(this.b.b != 59) {
                throw new IllegalStateException("No seCardTapFilter is to be evaluated");
            }
            ibuq.e(this.c.a.a, "protoDataStore");
            this.a = 1;
            object0 = ftqa.a(this.c.a.a, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(((dylt)object0).c);
    }
}

