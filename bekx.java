public final class bekx extends ibsl implements ibtw {
    Object a;
    int b;
    final bedc c;
    final lqi d;
    final bekz e;
    final heqb f;

    public bekx(bedc bedc0, lqi lqi0, bekz bekz0, heqb heqb0, ibrl ibrl0) {
        this.c = bedc0;
        this.d = lqi0;
        this.e = bekz0;
        this.f = heqb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bekx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bekx(this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object4;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                bedc bedc0 = this.c;
                if(bedc0 == null) {
                    lqi lqi0 = this.d;
                    gged_interceptors gged0 = gged_interceptors.l(this.f);
                    ibuq.e(gged0, "of(...)");
                    this.a = lqi0;
                    this.b = 1;
                    Object object3 = beih.k(this.e.c, gged0, this);
                    if(object3 == object1) {
                        return object1;
                    }
                    object0 = object3;
                    object4 = lqi0;
                    ((lqd)object4).l(object0);
                    return ibom.a;
                }
                this.b = 2;
                object0 = beih.j(this.e.c, bedc0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                object4 = this.a;
                ibnx.b(object0);
                ((lqd)object4).l(object0);
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                ((lqd)object2).l(object0);
                return ibom.a;
            }
        }
        if(((bedv)object0).a == bedu.a) {
            lqi lqi1 = this.d;
            gged_interceptors gged1 = gged_interceptors.l(this.f);
            ibuq.e(gged1, "of(...)");
            this.a = lqi1;
            this.b = 3;
            Object object5 = beih.k(this.e.c, gged1, this);
            if(object5 != object1) {
                object0 = object5;
                object2 = lqi1;
                ((lqd)object2).l(object0);
                return ibom.a;
            }
            return object1;
        }
        this.e.c(((bedv)object0));
        return ibom.a;
    }
}

