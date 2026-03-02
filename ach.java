final class ach extends ibsl implements ibtw {
    final ace a;
    final boolean b;

    public ach(ace ace0, boolean z, ibrl ibrl0) {
        this.a = ace0;
        this.b = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ach)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ach(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ace ace0 = this.a;
        boolean z = this.b;
        if(!z && !ace0.f && ace0.b) {
            acd acd0 = ace0.e;
            if(acd0 != null) {
                acd0.a();
            }
        }
        ace0.g(z);
        return ibom.a;
    }
}

