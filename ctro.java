final class ctro extends ibsl implements ibtw {
    int a;
    final ctrq b;
    final byte[] c;

    public ctro(ctrq ctrq0, byte[] arr_b, ibrl ibrl0) {
        this.b = ctrq0;
        this.c = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctro)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctro(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.i.a(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

