final class iga extends ibur implements ibts {
    final igb a;
    final iew b;
    final ibts c;

    public iga(igb igb0, iew iew0, ibts ibts0) {
        this.a = igb0;
        this.b = iew0;
        this.c = ibts0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        iew iew1;
        hpn hpn1;
        long v1;
        hli hli1;
        jlm jlm1;
        jks jks1;
        ibts ibts0;
        hpn hpn0;
        long v;
        hli hli0;
        jlm jlm0;
        jks jks0;
        igb igb0 = this.a;
        hpd hpd0 = (hpd)object0;
        iew iew0 = igb0.b;
        igb0.b = this.b;
        try {
            jks0 = hpd0.t().c();
            jlm0 = hpd0.t().d();
            hli0 = hpd0.t().b();
            v = hpd0.t().a();
            hpn0 = hpd0.t().a;
            ibts0 = this.c;
            jks1 = igb0.t().c();
            jlm1 = igb0.t().d();
            hli1 = igb0.t().b();
            v1 = igb0.t().a();
            hpn1 = igb0.t().a;
        }
        catch(Throwable throwable0) {
            iew1 = iew0;
            this.a.b = iew1;
            throw throwable0;
        }
        try {
            hoy hoy0 = igb0.t();
            hoy0.f(jks0);
            hoy0.g(jlm0);
            hoy0.e(hli0);
            hoy0.h(v);
            hoy0.a = hpn0;
            hli0.l();
        }
        catch(Throwable throwable0) {
            iew1 = iew0;
            this.a.b = iew1;
            throw throwable0;
        }
        try {
            ibts0.a(igb0);
        }
        catch(Throwable throwable1) {
            try {
                iew1 = iew0;
                hli0.j();
                hoy hoy1 = igb0.t();
                hoy1.f(jks1);
                hoy1.g(jlm1);
                hoy1.e(hli1);
                hoy1.h(v1);
                hoy1.a = hpn1;
                throw throwable1;
            }
            catch(Throwable throwable0) {
                this.a.b = iew1;
                throw throwable0;
            }
        }
        try {
            hli0.j();
            hoy hoy2 = igb0.t();
            hoy2.f(jks1);
            hoy2.g(jlm1);
            hoy2.e(hli1);
            hoy2.h(v1);
            hoy2.a = hpn1;
            this.a.b = iew0;
            return ibom.a;
        }
        catch(Throwable throwable0) {
            iew1 = iew0;
        }
        this.a.b = iew1;
        throw throwable0;
    }
}

