final class dunm extends ibsl implements ibtw {
    final duoa a;

    public dunm(duoa duoa0, ibrl ibrl0) {
        this.a = duoa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dunm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dunm(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        duoa duoa0 = this.a;
        String s = duoa0.ah;
        if(s == null) {
            ibuq.j("provisioningId");
            s = null;
        }
        duoa0.startActivity(dlnf.T(s, duoa0.requireContext()));
        duoa0.ar();
        return ibom.a;
    }
}

