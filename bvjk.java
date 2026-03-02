public final class bvjk extends ibsl implements ibtx {
    int a;
    Object b;
    final Object c;
    final bvkk d;
    final clou e;
    private Object f;

    public bvjk(Object object0, ibrl ibrl0, clou clou0, bvkk bvkk0) {
        this.c = object0;
        this.e = clou0;
        this.d = bvkk0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bvjk bvjk0 = new bvjk(this.c, ((ibrl)object2), this.e, this.d);
        bvjk0.f = (icih)object0;
        bvjk0.b = object1;
        return bvjk0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                Object object2 = this.f;
                object3 = this.b;
                this.a = 1;
                if(((icih)object2).a(this.c, this) != object1) {
                    object4 = object2;
                    goto label_14;
                }
                break;
            }
            case 1: {
                object3 = this.b;
                object4 = this.f;
                ibnx.b(object0);
            label_14:
                bviy bviy0 = new bviy(new icht(new clos(this.e, ((String)object3), null)), this.d, ((String)object3));
                this.f = null;
                this.b = null;
                this.a = 2;
                if(icir.c(((icih)object4), bviy0, this) != object1) {
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

