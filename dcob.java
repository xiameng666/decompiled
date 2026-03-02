final class dcob extends ibsl implements ibtx {
    int a;
    Object b;
    final long c;
    final Object d;

    public dcob(long v, Object object0, ibrl ibrl0) {
        this.c = v;
        this.d = object0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icck icck0 = (icck)object0;
        dcob dcob0 = new dcob(this.c, this.d, ((ibrl)object2));
        dcob0.b = (dcor)object1;
        return dcob0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                object2 = this.b;
                this.a = 1;
                if(iccv.c(this.c, this) != object1) {
                    goto label_11;
                }
                break;
            }
            case 1: {
                object2 = this.b;
                ibnx.b(object0);
            label_11:
                this.b = null;
                this.a = 2;
                if(((dcor)object2).c.a(this.d, this) != object1) {
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

