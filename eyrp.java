final class eyrp extends ibsl implements ibtw {
    int a;
    final eysa b;
    final exwv c;
    final exjx d;

    public eyrp(eysa eysa0, exwv exwv0, exjx exjx0, ibrl ibrl0) {
        this.b = eysa0;
        this.c = exwv0;
        this.d = exjx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyrp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyrp(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(this.b.i(this.c, this.d, this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                this.a = 2;
                if(this.b.b(this) != object1) {
                    this.b.p();
                    return ibom.a;
                }
                break;
            }
            default: {
                this.b.p();
                return ibom.a;
            }
        }
        return object1;
    }
}

