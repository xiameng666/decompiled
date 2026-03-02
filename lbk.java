final class lbk extends ibsl implements ibtw {
    int a;
    final lcc b;
    final lcu c;

    public lbk(lcc lcc0, lcu lcu0, ibrl ibrl0) {
        this.b = lcc0;
        this.c = lcu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new lbk(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        if(v != 0) {
            ibnx.b(object0);
            if(v == 2) {
                goto label_20;
            }
            return object0;
        }
        ibnx.b(object0);
        lcc lcc0 = this.b;
        lec lec0 = lcc0.d.a();
        if((lec0 instanceof lah)) {
            this.a = 1;
            Object object2 = lcc0.j(this.c.a, this.c.c, this);
            return object2 == object1 ? object1 : object2;
        }
        if(!(lec0 instanceof ldo) && !(lec0 instanceof lef)) {
            if((lec0 instanceof lcs)) {
                throw ((lcs)lec0).a;
            }
            throw new ibnq();
        }
        if(lec0 != this.c.b) {
            throw ((ldo)lec0).a;
        }
        this.a = 2;
        if(lcc0.f(this) != object1) {
        label_20:
            this.a = 3;
            Object object3 = this.b.j(this.c.a, this.c.c, this);
            return object3 == object1 ? object1 : object3;
        }
        return object1;
    }
}

