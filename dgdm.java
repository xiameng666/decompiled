final class dgdm extends ibsl implements ibtw {
    int a;
    Object b;
    final dgdt c;

    public dgdm(dgdt dgdt0, ibrl ibrl0) {
        this.c = dgdt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgdm)this.c(((dgde)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgdm(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dgde dgde0 = (dgde)this.b;
            if((dgde0 instanceof dgdj)) {
                this.a = 1;
                if(this.c.d(((dgdj)dgde0).a, ((dgdj)dgde0).b, ((dgdj)dgde0).c, ((dgdj)dgde0).d, this) == object1) {
                    return object1;
                }
            }
            else if(ibuq.m(dgde0, dgdk.a)) {
                dgdt dgdt0 = this.c;
                if(dgdt0.e) {
                    this.a = 2;
                    if(dgdt0.e(this) == object1) {
                        return object1;
                    }
                }
            }
            else {
                if(!(dgde0 instanceof dgdl)) {
                    throw new ibnq();
                }
                dgdt dgdt1 = this.c;
                if(dgdt1.e) {
                    this.a = 3;
                    if(dgdt1.f(((dgdl)dgde0).a, ((dgdl)dgde0).b, ((dgdl)dgde0).c, this) == object1) {
                        return object1;
                    }
                }
                else {
                    this.a = 4;
                    if(dgdt1.d(((dgdl)dgde0).a, ((dgdl)dgde0).b, ((dgdl)dgde0).c, dgdt1.d, this) == object1) {
                        return object1;
                    }
                }
            }
        }
        return ibom.a;
    }
}

