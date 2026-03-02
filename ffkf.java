import com.google.android.gms.wearable.internal.ConsentResponse;
import j..util.Objects;

final class ffkf extends ffee {
    final fdiy c;
    final fflv d;

    public ffkf(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getUserConsentStatus");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.d.C);
        ffco ffco0 = this.d.C.i();
        if(ffco0 != null) {
            ConsentResponse consentResponse0 = fflv.r(ffco0);
            this.c.T(consentResponse0);
            return;
        }
        ConsentResponse consentResponse1 = fflv.s();
        this.c.T(consentResponse1);
    }
}

