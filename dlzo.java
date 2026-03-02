final class dlzo extends ibsl implements ibtw {
    int a;
    int b;
    final dlzp c;
    final hjus d;

    public dlzo(dlzp dlzp0, hjus hjus0, ibrl ibrl0) {
        this.c = dlzp0;
        this.d = hjus0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlzo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlzo(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                this.b = 1;
                object0 = this.c.a.a(this.d, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                v = this.a;
                ibnx.b(object0);
                goto label_23;
            }
        }
        int v1 = ((Boolean)object0).booleanValue();
        if(v1 == 0) {
            this.a = 1;
            this.b = 2;
            edsx edsx0 = new edsx(this.c.a, null);
            Object object2 = icbd.a(this.c.a.a, edsx0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        v = v1 ^ 1;
    label_23:
        if(1 != v) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

