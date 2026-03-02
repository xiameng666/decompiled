final class duod extends ibsl implements ibtw {
    int a;
    final duog b;

    public duod(duog duog0, ibrl ibrl0) {
        this.b = duog0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duod)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duod(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            duog duog0 = this.b;
            String s = duog0.d;
            if(s == null) {
                ibuq.j("provisioningId");
                s = null;
            }
            evql evql0 = duog0.c.c(duog0.b, s, false);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        duog duog1 = this.b;
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        duog1.c(duob.a(duog1.a(), null, ((hjzq)object2), false, 5));
        return ibom.a;
    }
}

