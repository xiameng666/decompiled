import android.util.Log;
import j..util.Objects;

final class ffle extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffle(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("migrateToConsentPerWatch");
    }

    @Override  // ffee
    public final void a() {
        evql evql0;
        fdch fdch0 = this.e.C;
        batl.s(fdch0);
        if(fdci.a(ffgp.m())) {
            String s = this.c;
            if(fdch0.k(s) == null) {
                ffco ffco0 = hzvd.a.c().j() ? fdch0.h() : fdch0.i();
                if(ffco0 == null) {
                    evql0 = evrg.c(new IllegalStateException("Global consent missing. Nothing to migrate."));
                }
                else {
                    fdco fdco0 = fdco.a();
                    fdco0.e(ffco0);
                    ffco ffco1 = fdco0.d(s, hfyn.l());
                    fdbf fdbf0 = fdbf.i(fdch0.i);
                    fdny.a(fdnq.b);
                    evql0 = fdbf0.f(ffco1, false);
                }
            }
            else {
                if(Log.isLoggable("wearable.Consents", 4)) {
                    Log.i("wearable.Consents", a.a(s, "Consents for ", " already exists, noop"));
                }
                evql0 = evrg.d(null);
            }
        }
        else {
            evql0 = evrg.c(new IllegalStateException("ConsentsPerWatch Feature disabled"));
        }
        evql0.z(new ffld(this.d));
    }
}

