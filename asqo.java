final class asqo extends ibsl implements ibtw {
    Object a;
    int b;
    final asqp c;

    public asqo(asqp asqp0, ibrl ibrl0) {
        this.c = asqp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asqo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asqo(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            asqp asqp0 = this.c;
            if(asqp0.f == null) {
                this.a = asqp0;
                this.b = 1;
                Object object3 = asqp0.b(this);
                if(object3 != object1) {
                    asqp0.f = (ghzu)object3;
                    goto label_16;
                }
                return object1;
            }
        }
        else {
            Object object2 = this.a;
            ibnx.b(object0);
            ((asqp)object2).f = (ghzu)object0;
        }
    label_16:
        Object object4 = this.c.f;
        ibuq.c(object4);
        return object4;
    }
}

