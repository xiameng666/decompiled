final class dgls extends ibsl implements ibtw {
    int a;
    final dglu b;
    private Object c;

    public dgls(dglu dglu0, ibrl ibrl0) {
        this.b = dglu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgls)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgls(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            dglr dglr0 = new dglr(ichm0, null);
            iced iced0 = icir.d(new iclv(this.b.b, dglr0), ichm0);
            this.b.d = ichm0;
            dglq dglq0 = new dglq(iced0, this.b);
            this.a = 1;
            if(ichl.b(ichm0, dglq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

