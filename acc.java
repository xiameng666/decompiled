final class acc extends ibsl implements ibtw {
    Object a;
    int b;
    final aaw c;
    final ibtw d;
    final acd e;

    public acc(aaw aaw0, ibtw ibtw0, acd acd0, ibrl ibrl0) {
        this.c = aaw0;
        this.d = ibtw0;
        this.e = acd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((acc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new acc(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            if(this.c.b) {
                ibuz ibuz0 = new ibuz();
                icjm icjm0 = new icjm(new icia(this.e.b, true), new acb(ibuz0, null));
                this.a = ibuz0;
                this.b = 1;
                if(this.d.a(icjm0, this) == object1) {
                    return object1;
                }
                object2 = ibuz0;
            label_13:
                if(!((ibuz)object2).a) {
                    throw new IllegalStateException("You must collect the progress flow");
                }
            }
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
            goto label_13;
        }
        return ibom.a;
    }
}

