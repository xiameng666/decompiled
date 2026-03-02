import j..time.Duration;

final class dcrg extends ibsl implements ibtw {
    int a;
    final dcrn b;

    public dcrg(dcrn dcrn0, ibrl ibrl0) {
        this.b = dcrn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcrg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcrg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
    alab1:
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                while(true) {
                label_5:
                    this.a = 2;
                    object0 = this.b.d.e(this.b.a, gzdw.c, this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_8:
                    if(!((Boolean)object0).booleanValue()) {
                        dcvz.a.e().h("Failed to extend sharing session [%s].", this.b.a);
                        return ibom.a;
                    }
                    dcvz.a.b().h("Extend sharing session [%s] automatically.", this.b.a);
                    break alab1;
                }
            }
            default: {
                goto label_8;
            }
        }
        Duration duration0 = hfyo.c(hvqs.a.aT().cH());
        this.a = 1;
        if(glya.a(duration0, this) != object1) {
            goto label_5;
        }
        return object1;
    }
}

