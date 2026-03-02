final class eyvv extends ibsl implements ibtw {
    int a;
    final eyvx b;
    private Object c;

    public eyvv(eyvx eyvx0, ibrl ibrl0) {
        this.b = eyvx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyvv)this.c(((lqf)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eyvv(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lqf lqf0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                lqf0 = (lqf)this.c;
                this.c = lqf0;
                this.a = 1;
                object0 = this.b.b(this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                lqf0 = (lqf)this.c;
                ibnx.b(object0);
            label_13:
                if(((Boolean)object0).booleanValue()) {
                    this.c = null;
                    this.a = 2;
                    return lqf0.a(new Integer(0x7F0B0ADB), this) != object1 ? ibom.a : object1;  // id:action_global_to_explanation
                }
                this.c = null;
                this.a = 3;
                if(lqf0.a(new Integer(0x7F0B0ADA), this) != object1) {  // id:action_global_to_enrolledDeviceList
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

