final class aaaa extends ibsl implements ibtw {
    int a;
    final hix b;
    final ipc c;

    public aaaa(hix hix0, ipc ipc0, ibrl ibrl0) {
        this.b = hix0;
        this.c = ipc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aaaa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aaaa(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            hix.b(this.b);
            this.a = 1;
            if(iccv.c(100L, this) == object1) {
                return object1;
            }
        }
        ipc ipc0 = this.c;
        if(ipc0 != null) {
            ipc0.b();
        }
        return ibom.a;
    }
}

