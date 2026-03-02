import android.provider.Settings.Global;

final class dcxu extends ibsl implements ibtw {
    int a;
    final dcyu b;
    private Object c;

    public dcxu(dcyu dcyu0, ibrl ibrl0) {
        this.b = dcyu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcxu)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcxu(this.b, ibrl0);
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
            dcxt dcxt0 = new dcxt(ichm0);
            try {
                this.b.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, dcxt0);
            }
            catch(SecurityException securityException0) {
                dcvz.a.e().f(securityException0).h("Failed to register content observer for %s", Settings.Global.getUriFor("ble_scan_always_enabled"));
            }
            dcxs dcxs0 = new dcxs(this.b, dcxt0);
            this.a = 1;
            if(ichl.b(ichm0, dcxs0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

