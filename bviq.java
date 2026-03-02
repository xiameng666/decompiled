import java.util.List;

final class bviq extends ibsl implements ibtw {
    int a;
    final bvkk b;
    final String c;
    private Object d;

    public bviq(bvkk bvkk0, String s, ibrl ibrl0) {
        this.b = bvkk0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bviq)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bviq(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.d;
                this.d = icih0;
                this.a = 1;
                object0 = this.b.d.a(this.c, this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.d;
                ibnx.b(object0);
            label_13:
                bvku bvku0 = new bvku(this.c, ((List)object0));
                this.d = null;
                this.a = 2;
                if(icih0.a(bvku0, this) != object1) {
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

