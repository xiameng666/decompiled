final class che extends ibsl implements ibtw {
    int a;
    final Object b;
    final chb c;
    final gui d;
    final gui e;

    public che(Object object0, chb chb0, gui gui0, gui gui1, ibrl ibrl0) {
        this.b = object0;
        this.c = chb0;
        this.d = gui0;
        this.e = gui1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((che)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new che(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        che che0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.b;
            chb chb0 = this.c;
            if(!ibuq.m(object2, chb0.c())) {
                chl chl0 = (chl)this.d.a();
                this.a = 1;
                che0 = this;
                if(chb.k(chb0, object2, chl0, null, che0, 12) == object1) {
                    return object1;
                }
            label_14:
                ibts ibts0 = (ibts)che0.e.a();
                if(ibts0 != null) {
                    ibts0.a(che0.c.d());
                }
            }
        }
        else {
            che0 = this;
            goto label_14;
        }
        return ibom.a;
    }
}

