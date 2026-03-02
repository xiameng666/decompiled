public final class bvjl extends ibsl implements ibtx {
    int a;
    Object b;
    final Object c;
    final bvkk d;
    private Object e;

    public bvjl(Object object0, ibrl ibrl0, bvkk bvkk0) {
        this.c = object0;
        this.d = bvkk0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bvjl bvjl0 = new bvjl(this.c, ((ibrl)object2), this.d);
        bvjl0.e = (icih)object0;
        bvjl0.b = object1;
        return bvjl0.jI(ibom.a);
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
                clnl clnl0 = new clnl(((String)object3), this.d.g, new ibzw(ibzy.i(htva.a.b().b(), ibzz.c)));
                bvil bvil0 = new bvil(new icoj(new clnm(null, this.d.j, clnl0), this.d.j.b), this.d, ((String)object3));
                this.e = null;
                this.b = null;
                this.a = 2;
                if(icir.c(((icih)object4), bvil0, this) != object1) {
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

