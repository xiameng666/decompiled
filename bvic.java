final class bvic extends ibsl implements ibtw {
    Object a;

    public bvic(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvic)this.c(((ibns)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bvic(ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ibns ibns0 = (ibns)this.a;
        String s = (String)ibns0.a;
        String s1 = (String)ibns0.b;
        boolean z = true;
        if(s != null) {
        label_8:
            if(s == null || s1 != null) {
                z = false;
            }
        }
        else if(s1 == null) {
            s1 = null;
            goto label_8;
        }
        return Boolean.valueOf(z);
    }
}

