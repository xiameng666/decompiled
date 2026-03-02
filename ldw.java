final class ldw extends ibsl implements ibtw {
    Object a;
    int b;
    final ldx c;

    public ldw(ldx ldx0, ibrl ibrl0) {
        this.c = ldx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ldw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ldw(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                if(this.c.d.a() > 0) {
                    goto label_14;
                }
                throw new IllegalStateException("Check failed.");
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                goto label_12;
            }
        }
        do {
            this.a = null;
            this.b = 2;
            if(((ibtw)object2).a(object0, this) == object1) {
                break;
            }
        label_12:
            if(this.c.d.a.decrementAndGet() == 0) {
                return ibom.a;
            }
        label_14:
            iccl.f(this.c.a);
            object2 = this.c.b;
            this.a = object2;
            this.b = 1;
            object0 = this.c.c.i(this);
        }
        while(object0 != object1);
        return object1;
    }
}

