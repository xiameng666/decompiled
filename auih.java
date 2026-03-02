import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

public final class auih implements evqf {
    public final auim a;

    public auih(auim auim0) {
        this.a = auim0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        auim auim0 = this.a;
        if(((ModuleAvailabilityResponse)object0).a) {
            auim0.f(4);
            auim0.h.a();
            return;
        }
        auim0.f(3);
        long v = System.currentTimeMillis();
        auim0.g = v;
        cjpa cjpa0 = auim0.e.c();
        cjpa0.g("com.google.android.gms.PREF_LAST_USONIA_MODULE_DOWNLOAD_REQUEST_TIMESTAMP", v);
        cjpd.g(cjpa0);
        bavt bavt0 = auim0.b();
        auil auil0 = new auil(auim0, bavt0, auim0.h);
        auim0.h.a.g.q.g();
        auii auii0 = new auii(auim0, bavt0, auil0);
        auim0.c.execute(auii0);
    }
}

