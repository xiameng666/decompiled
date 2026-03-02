final class epou extends ibsl implements ibtw {
    int a;
    final epow b;
    final cjdi c;

    public epou(epow epow0, cjdi cjdi0, ibrl ibrl0) {
        this.b = epow0;
        this.c = cjdi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epou)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epou(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.a(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

