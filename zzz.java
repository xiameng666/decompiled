final class zzz extends ibsl implements ibtw {
    final gui a;
    final ipc b;
    final hio c;

    public zzz(ipc ipc0, hio hio0, gui gui0, ibrl ibrl0) {
        this.b = ipc0;
        this.c = hio0;
        this.a = gui0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((zzz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new zzz(this.b, this.c, this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        if(aaag.b(this.a)) {
            ipc ipc0 = this.b;
            if(ipc0 != null) {
                ipc0.a();
            }
            hih.a(this.c);
        }
        return ibom.a;
    }
}

