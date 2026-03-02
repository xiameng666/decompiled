final class fugh implements ibtw {
    final ibth a;
    final ibtw b;

    public fugh(ibth ibth0, ibtw ibtw0) {
        this.a = ibth0;
        this.b = ibtw0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        fhvs fhvs0 = (fhvs)((goz)object0).h(fhxk.a);
        fhvw fhvw0 = (fhvw)((goz)object0).h(fsdq.b);
        ((goz)object0).M(0x97EA02AA);
        ibth ibth0 = this.a;
        int v = ((goz)object0).X(ibth0) | ((goz)object0).Z(fhvs0) | ((goz)object0).Z(fhvw0);
        Object object2 = ((goz)object0).k();
        if(v != 0 || object2 == gop.a) {
            object2 = new fugf(ibth0, fhvs0, fhvw0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fufv fufv0 = new fufv(((ibth)object2));
        gpo.a(fugo.a.c(fufv0), gzf.e(0xCCD9E870, new fugg(this.b), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

