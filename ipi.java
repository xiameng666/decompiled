final class ipi extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final icgv d;

    public ipi(icgv icgv0, ibrl ibrl0) {
        this.d = icgv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ipi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ipi(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c == 0) {
            ibnx.b(object0);
            object3 = this.d;
            try {
                object2 = ((icho)object3).A();
                while(true) {
                label_9:
                    this.a = object3;
                    this.b = object2;
                    this.c = 1;
                    object0 = ((icgh)object2).a(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_15:
                    if(!((Boolean)object0).booleanValue()) {
                        goto label_23;
                    }
                    ibom ibom0 = (ibom)((icgh)object2).b();
                    ipk.b.set(false);
                    hbl.e();
                }
            }
            catch(Throwable throwable0) {
                iche.a(((icho)object3), throwable0);
                throw throwable0;
            }
        }
        else {
            try {
                object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                goto label_15;
            }
            catch(Throwable throwable0) {
                iche.a(((icho)object3), throwable0);
                throw throwable0;
            }
        }
        goto label_9;
    label_23:
        iche.a(((icho)object3), null);
        return ibom.a;
    }
}

