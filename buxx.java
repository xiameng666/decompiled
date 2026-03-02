final class buxx extends ibsl implements ibtw {
    Object a;
    int b;
    final fntm c;
    final buyb d;

    public buxx(fntm fntm0, buyb buyb0, ibrl ibrl0) {
        this.c = fntm0;
        this.d = buyb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buxx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buxx(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object1 = ibrx.a;
        buxc buxc0 = null;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                String s = this.c == null ? null : this.c.c;
                this.a = s;
                this.b = 1;
                Object object2 = buvd.a(this.d.b, this);
                if(object2 == object1) {
                    return object1;
                }
                object3 = s;
                object0 = object2;
                goto label_16;
            }
            case 1: {
                object3 = this.a;
                ibnx.b(object0);
            label_16:
                if(!ibuq.m(((String)object0), object3)) {
                    this.a = object3;
                    this.b = 2;
                    if(this.d.b.a(((String)object3), this) == object1) {
                        return object1;
                    }
                    goto label_23;
                }
                break;
            }
            case 2: {
                object3 = this.a;
                ibnx.b(object0);
            label_23:
                ibts ibts0 = this.d.f;
                if(ibts0 != null) {
                    ibts0.a(object3);
                }
                break;
            }
            default: {
                ibnx.b(object0);
                goto label_32;
            }
        }
        fntm fntm0 = this.c;
        if(fntm0 == null) {
            this.a = null;
            this.b = 3;
            if(this.d.a(this) == object1) {
                return object1;
            }
        label_32:
            buyb buyb0 = this.d;
            fntm fntm1 = (fntm)buyb0.e.a();
            if(fntm1 != null) {
                buxc0 = buyc.a(fntm1);
            }
            buyb0.j.g(buxc0);
            return ibom.a;
        }
        buxc buxc1 = buyc.a(fntm0);
        this.d.j.g(buxc1);
        return ibom.a;
    }
}

