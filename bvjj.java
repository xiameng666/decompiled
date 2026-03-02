public final class bvjj extends ibsl implements ibtx {
    int a;
    Object b;
    final Object c;
    final bvkk d;
    private Object e;

    public bvjj(Object object0, ibrl ibrl0, bvkk bvkk0) {
        this.c = object0;
        this.d = bvkk0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bvjj bvjj0 = new bvjj(this.c, ((ibrl)object2), this.d);
        bvjj0.e = (icih)object0;
        bvjj0.b = object1;
        return bvjj0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                Object object2 = this.e;
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
                object4 = this.e;
                ibnx.b(object0);
            label_14:
                icht icht0 = new icht(new bviq(this.d, ((String)object3), null));
                this.e = null;
                this.b = null;
                this.a = 2;
                if(icir.c(((icih)object4), icht0, this) != object1) {
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

