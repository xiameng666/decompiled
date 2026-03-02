final class ertt extends ibsl implements ibtw {
    int a;
    final String b;
    final ertu c;
    final erto d;
    final ibvd e;
    private Object f;

    public ertt(String s, ertu ertu0, erto erto0, ibvd ibvd0, ibrl ibrl0) {
        this.b = s;
        this.c = ertu0;
        this.d = erto0;
        this.e = ibvd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ertt)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ertt(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ertx ertx0;
        ertw ertw0;
        icih icih1;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.f;
                ertn ertn0 = (this.d instanceof ertn) ? ((ertn)this.d) : null;
                erty erty0 = new erty(this.b, (ertn0 == null ? null : ertn0.a));
                this.f = icih0;
                this.a = 1;
                if(icih0.a(erty0, this) != object1) {
                    icih1 = icih0;
                    goto label_15;
                }
                break;
            }
            case 1: {
                icih1 = (icih)this.f;
                ibnx.b(object0);
            label_15:
                erto erto0 = this.d;
                if((erto0 instanceof ertm)) {
                    this.f = icih1;
                    this.a = 2;
                    object0 = this.c.a.a(this.b, this);
                    if(object0 != object1) {
                        goto label_31;
                    }
                }
                else {
                    if(!(erto0 instanceof ertn)) {
                        throw new ibnq();
                    }
                    this.f = icih1;
                    this.a = 3;
                    object0 = this.c.b.a(this.b, ((ertn)erto0).a, this);
                    if(object0 != object1) {
                        goto label_43;
                    }
                }
                break;
            }
            case 2: {
                icih1 = (icih)this.f;
                ibnx.b(object0);
            label_31:
                Object object2 = ((ibnw)object0).a;
                String s = this.b;
                ibvd ibvd0 = this.e;
                Throwable throwable0 = ibnw.a(object2);
                if(throwable0 == null) {
                    ertw0 = new ertw(s, object2);
                    ibvd0.a = object2;
                }
                else {
                    ertx0 = new ertx(s, ibvd0.a, throwable0);
                    goto label_54;
                }
                goto label_55;
            }
            case 3: {
                icih1 = (icih)this.f;
                ibnx.b(object0);
            label_43:
                Object object3 = ((ibnw)object0).a;
                String s1 = this.b;
                erto erto1 = this.d;
                ibvd ibvd1 = this.e;
                Throwable throwable1 = ibnw.a(object3);
                if(throwable1 == null) {
                    ibom ibom0 = (ibom)object3;
                    ertx0 = new ertw(s1, ((ertn)erto1).a);
                    ibvd1.a = ((ertn)erto1).a;
                }
                else {
                    ertx0 = new ertx(s1, ibvd1.a, throwable1);
                }
            label_54:
                ertw0 = ertx0;
            label_55:
                this.f = null;
                this.a = 4;
                if(icih1.a(ertw0, this) != object1) {
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

