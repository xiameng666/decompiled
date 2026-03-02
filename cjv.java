final class cjv extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final cke d;
    final Object e;
    final clj f;

    public cjv(cke cke0, Object object0, clj clj0, ibrl ibrl0) {
        this.d = cke0;
        this.e = object0;
        this.f = clj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cjv(this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        chp chp0;
        Object object7;
        Object object5;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.c;
        switch(v) {
            case 0: {
                ibnx.b(object0);
                object2 = this.d;
                Object object3 = this.e;
                Object object4 = ((cke)object2).b();
                if(!ibuq.m(object3, object4)) {
                    ((cke)object2).m();
                    ((cke)object2).p(0.0f);
                    this.f.w(object3);
                    this.f.q(0L);
                    ((cke)object2).c(object4);
                    ((cke)object2).q(object3);
                }
                icta icta0 = object2.k;
                this.a = icta0;
                this.b = object2;
                this.c = 1;
                if(icta0.b(this) != object1) {
                    object5 = icta0;
                    goto label_27;
                }
                break;
            }
            case 1: {
                object2 = this.b;
                object5 = this.a;
                ibnx.b(object0);
            label_27:
                try {
                    Object object6 = ((cke)object2).b;
                }
                finally {
                    ((icta)object5).d();
                }
                if(ibuq.m(this.e, object6)) {
                    goto label_50;
                }
                else {
                    cke cke0 = this.d;
                    this.a = null;
                    this.b = null;
                    this.c = 2;
                    if(cke0.g == 0x8000000000000000L) {
                        object7 = gqv.c(cke0.i, this);
                        if(object7 != ibrx.a) {
                            object7 = ibom.a;
                        }
                    }
                    else {
                        object7 = cke0.g(this);
                        if(object7 != ibrx.a) {
                            object7 = ibom.a;
                        }
                    }
                    if(object7 != object1) {
                        goto label_48;
                    }
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
            label_48:
                this.c = 3;
                if(this.d.k(this) != object1) {
                label_50:
                    cke cke1 = this.d;
                    if(ibuq.m(cke1.a(), this.e)) {
                        return ibom.a;
                    }
                    if((cke1.d() < 1.0f)) {
                        cju cju0 = cke1.h;
                        if(cju0 == null || !ibuq.m(null, null)) {
                            if(cju0 != null && cju0.a != 0L) {
                                long v2 = cju0.g == 0x8000000000000000L ? cke1.d : cju0.g;
                                chp0 = (((float)v2) / 1000000000.0f <= 0.0f) ? cke.a : new chp(1.0f / (((float)v2) / 1000000000.0f));
                            }
                            else {
                                chp0 = cke.a;
                            }
                            if(cju0 == null) {
                                cju0 = new cju();
                            }
                            cju0.b = null;
                            cju0.c = false;
                            cju0.d = cke1.d();
                            float f = cke1.d();
                            cju0.e.e(0, f);
                            cju0.g = cke1.d;
                            cju0.a = 0L;
                            cju0.f = chp0;
                            cju0.h = ibvr.d(((double)cke1.d) * (1.0 - ((double)cke1.d())));
                            cke1.h = cju0;
                        }
                    }
                    this.a = null;
                    this.b = null;
                    this.c = 4;
                    if(cke1.h(this) != object1) {
                    label_79:
                        this.d.c(this.e);
                        this.c = 5;
                        if(this.d.j(this) != object1) {
                            this.d.p(0.0f);
                            return ibom.a;
                        }
                    }
                }
                break;
            }
            default: {
                ibnx.b(object0);
                switch(v) {
                    case 3: {
                        goto label_50;
                    }
                    case 4: {
                        goto label_79;
                    }
                    default: {
                        this.d.p(0.0f);
                        return ibom.a;
                    }
                }
            }
        }
        return object1;
    }
}

