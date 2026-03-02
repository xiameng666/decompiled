final class cqg extends ibsl implements ibtw {
    Object a;
    int b;
    final cqq c;
    final long d;
    final dgg e;

    public cqg(cqq cqq0, long v, dgg dgg0, ibrl ibrl0) {
        this.c = cqq0;
        this.d = v;
        this.e = dgg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqg(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                iced iced0 = this.c.i;
                if(iced0 == null) {
                    goto label_11;
                }
                else {
                    this.b = 1;
                    if(icei.a(iced0, this) != object1) {
                        goto label_11;
                    }
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_11:
                dgj dgj0 = new dgj(this.d);
                object2 = new dgk(dgj0);
                this.a = object2;
                this.b = 2;
                if(this.e.b(dgj0, this) != object1) {
                    goto label_19;
                }
                break;
            }
            case 2: {
                object2 = this.a;
                ibnx.b(object0);
            label_19:
                this.a = null;
                this.b = 3;
                if(this.e.b(((dge)object2), this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

