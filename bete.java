import java.util.List;

final class bete extends ibsl implements ibtw {
    int a;
    final boolean b;
    final betf c;
    private Object d;

    public bete(boolean z, betf betf0, ibrl ibrl0) {
        this.b = z;
        this.c = betf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bete)this.c(((lqf)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bete(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lqf lqf0;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                lqf0 = (lqf)this.d;
                if(this.b) {
                    this.a = 1;
                    return lqf0.a(Boolean.valueOf(false), this) != object1 ? ibom.a : object1;
                }
                this.d = lqf0;
                this.a = 2;
                object0 = begh.a(this.c.b, this);
                if(object0 != object1) {
                    goto label_18;
                }
                break;
            }
            case 2: {
                lqf0 = (lqf)this.d;
                ibnx.b(object0);
            label_18:
                if(((List)object0) != null && !((List)object0).isEmpty()) {
                    z = true;
                }
                this.d = null;
                this.a = 3;
                if(lqf0.a(Boolean.valueOf(z), this) != object1) {
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

