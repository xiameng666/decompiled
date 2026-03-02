final class dxgt extends ibsl implements ibtw {
    int a;
    final gtl b;

    public dxgt(gtl gtl0, ibrl ibrl0) {
        this.b = gtl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxgt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxgt(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            goto label_6;
        }
        while(true) {
            this.a = 1;
            if(iccv.c(2000L, this) == object1) {
                break;
            }
        label_6:
            int v1 = (this.b.e() + 1) % 3;
            this.b.i(v1);
        }
        return object1;
    }
}

