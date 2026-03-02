final class cfd extends ibur implements ibts {
    final ibq a;
    final cfe b;

    public cfd(ibq ibq0, cfe cfe0) {
        this.a = ibq0;
        this.b = cfe0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibp.y(((ibp)object0), this.a, 0, 0);
        cfj cfj0 = this.b.i();
        cgj cgj0 = cfj0.c;
        cfk cfk0 = this.b.b;
        cgj0.d();
        if(!ibuq.m(cfj0.a(), cey.a) && cfk0.m()) {
            cgi cgi0 = cfj0.a();
            if(cfk0.b().f() && cgi0.f()) {
                hzk hzk0 = ((ibp)object0).o();
                if(hzk0 != null) {
                    long v = jll.b(hzk0.g());
                    long v1 = cfk0.c().b.dT(cfk0.c().b.a(), hzk0);
                    cfk0.c();
                    long v2 = hzj.b(cfk0.c().b.a(), hzk0, 2);
                    cgi cgi1 = cgj0.a();
                    cfe cfe0 = cgj0.b;
                    ibuq.c(cfe0);
                    cgj0.f(cgi1.g(cgj0.a, cfe0, v, v1, v2));
                }
            }
        }
        return ibom.a;
    }
}

