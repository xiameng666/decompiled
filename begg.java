import java.util.List;

final class begg extends ibsl implements ibtw {
    Object a;
    int b;
    final begh c;
    private Object d;

    public begg(begh begh0, ibrl ibrl0) {
        this.c = begh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((begg)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new begg(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        List list0;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.d;
                this.d = icih0;
                this.b = 1;
                if(icih0.a(null, this) != object1) {
                    object2 = icih0;
                    goto label_13;
                }
                break;
            }
            case 1: {
                object2 = (icih)this.d;
                ibnx.b(object0);
                try {
                label_13:
                    this.d = object2;
                    this.a = object2;
                    this.b = 2;
                    object0 = this.c.b(this);
                }
                catch(aztb unused_ex) {
                    object3 = object2;
                    goto label_28;
                }
                if(object0 != object1) {
                    object3 = object2;
                    list0 = (List)object0;
                    goto label_30;
                }
                break;
            }
            case 2: {
                object2 = this.a;
                object3 = (icih)this.d;
                try {
                    ibnx.b(object0);
                    list0 = (List)object0;
                    goto label_30;
                }
                catch(aztb unused_ex) {
                }
            label_28:
                object2 = object3;
                list0 = null;
            label_30:
                this.d = null;
                this.a = null;
                this.b = 3;
                if(((icih)object2).a(list0, this) != object1) {
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

