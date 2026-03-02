public final class atom extends ibsl implements ibtw {
    int a;
    final ator b;
    private Object c;

    public atom(ator ator0, ibrl ibrl0) {
        this.b = ator0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atom)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new atom(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            ator ator0 = this.b;
            atok atok0 = new atok(ator0, ichm0);
            if(hxvd.d()) {
                String s = ator0.e();
                if(s != null && ator.l(s)) {
                    ((ggtj)ator.a.h()).B("Initial foreground bank app detected: %s", s);
                    ichm0.b(s);
                }
                try {
                    ator0.b.addOnUidImportanceListener(atok0, 100);
                }
                catch(SecurityException securityException0) {
                    a.ae(ator.a.i(), "Missing PACKAGE_USAGE_STATS permission to add OnUidImportanceListener.", securityException0);
                    ichm0.e(securityException0);
                    return ibom.a;
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    a.ae(ator.a.i(), "Failed to add OnUidImportanceListener.", illegalArgumentException0);
                    ichm0.e(illegalArgumentException0);
                    return ibom.a;
                }
                catch(IllegalStateException illegalStateException0) {
                    a.ae(ator.a.i(), "Failed to add OnUidImportanceListener.", illegalStateException0);
                    ichm0.e(illegalStateException0);
                    return ibom.a;
                }
                atol atol0 = new atol(this.b, atok0);
                this.a = 1;
                if(ichl.b(ichm0, atol0, this) == object1) {
                    return object1;
                }
            }
            else {
                ((ggtj)ator.a.h()).x("BankScamWarningFeature is disabled, not registering listener.");
                ichp.a(ichm0);
            }
        }
        return ibom.a;
    }
}

