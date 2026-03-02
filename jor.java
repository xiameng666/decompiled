final class jor extends ibsl implements ibtw {
    int a;
    final jqc b;
    private Object c;

    public jor(jqc jqc0, ibrl ibrl0) {
        this.b = jqc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((jor)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new jor(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck0 = (icck)this.c;
        }
        else {
            icck0 = (icck)this.c;
            ibnx.b(object0);
            goto label_19;
        }
        while(iccl.g(icck0)) {
            joq joq0 = joq.a;
            this.c = icck0;
            this.a = 1;
            ipq ipq0 = (ipq)this.u().get(ipq.a);
            if(ipq0 == null) {
                object2 = gqv.c(joq0, this);
            }
            else {
                new ipr(joq0, null);
                object2 = ipq0.a();
            }
            if(object2 == object1) {
                return object1;
            }
        label_19:
            jqc jqc0 = this.b;
            if(jqc0.isAttachedToWindow()) {
                int v = jqc0.i[0];
                int v1 = jqc0.i[1];
                jqc0.a.getLocationOnScreen(jqc0.i);
                if(v != jqc0.i[0] || v1 != jqc0.i[1]) {
                    jqc0.l();
                }
            }
        }
        return ibom.a;
    }
}

