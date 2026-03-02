final class ehzr extends ibsl implements ibtw {
    int a;
    final boolean b;
    final chb c;
    final boolean d;

    public ehzr(boolean z, chb chb0, boolean z1, ibrl ibrl0) {
        this.b = z;
        this.c = chb0;
        this.d = z1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehzr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehzr(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(this.b) {
                this.a = 1;
                if(ehzx.c(this.c, this) == object1) {
                    return object1;
                }
            }
            else {
                chb chb0 = this.c;
                if(chb0.j()) {
                    this.a = 2;
                    if(ehzx.b(chb0, this.d, this) == object1) {
                        return object1;
                    }
                }
                else if(this.d) {
                    this.a = 3;
                    if(ehzx.b(chb0, true, this) == object1) {
                        return object1;
                    }
                }
            }
        }
        return ibom.a;
    }
}

