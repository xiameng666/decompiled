final class cqe extends ibsl implements ibtw {
    boolean a;
    int b;
    final long c;
    final dgg d;
    final cqq e;
    final dbz f;
    private Object g;

    public cqe(dbz dbz0, long v, dgg dgg0, cqq cqq0, ibrl ibrl0) {
        this.f = dbz0;
        this.c = v;
        this.d = dgg0;
        this.e = cqq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cqe(this.f, this.c, this.d, this.e, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dgk dgk1;
        boolean z1;
        iced iced0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                iced0 = icbb.b(((icck)this.g), null, null, new cqd(this.e, this.c, this.d, null), 3);
                this.g = iced0;
                this.b = 1;
                object0 = this.f.o(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_13;
            }
            case 1: {
                iced0 = (iced)this.g;
                ibnx.b(object0);
            label_13:
                boolean z = ((Boolean)object0).booleanValue();
                if(iced0.y()) {
                    this.g = null;
                    this.a = z;
                    this.b = 2;
                    if(icei.a(iced0, this) == object1) {
                        return object1;
                    }
                    z1 = z;
                    goto label_34;
                }
                else {
                    dgj dgj0 = this.e.f;
                    if(dgj0 != null) {
                        dgg dgg0 = this.d;
                        dgk dgk0 = z ? new dgk(dgj0) : new dgi(dgj0);
                        this.g = null;
                        this.b = 5;
                        if(dgg0.b(dgk0, this) == object1) {
                            return object1;
                        }
                    }
                }
                break;
            }
            case 2: {
                z1 = this.a;
                ibnx.b(object0);
            label_34:
                if(z1) {
                    dgj dgj1 = new dgj(this.c);
                    dgk1 = new dgk(dgj1);
                    this.g = dgk1;
                    this.b = 3;
                    if(this.d.b(dgj1, this) == object1) {
                        return object1;
                    }
                    goto label_43;
                }
                break;
            }
            case 3: {
                dgk1 = (dgk)this.g;
                ibnx.b(object0);
            label_43:
                this.g = null;
                this.b = 4;
                if(this.d.b(dgk1, this) == object1) {
                    return object1;
                }
                break;
            }
            default: {
                ibnx.b(object0);
            }
        }
        this.e.f = null;
        return ibom.a;
    }
}

