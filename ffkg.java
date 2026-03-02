import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.ConsentStatusRequest;
import j..util.Objects;

final class ffkg extends ffee {
    final ConsentStatusRequest c;
    final fdiy d;
    final fflv e;

    public ffkg(fflv fflv0, ConsentStatusRequest consentStatusRequest0, fdiy fdiy0) {
        this.c = consentStatusRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getUserConsentStatus");
    }

    @Override  // ffee
    public final void a() {
        ffco ffco0;
        if(fdci.a(ffgp.m())) {
            batl.s(this.e.C);
            ffco0 = this.e.C.j(this.c.a);
        }
        else {
            batl.s(this.e.C);
            ffco0 = this.e.C.i();
        }
        if(ffco0 != null) {
            ConsentResponse consentResponse0 = fflv.r(ffco0);
            this.d.T(consentResponse0);
            return;
        }
        ConsentResponse consentResponse1 = fflv.s();
        this.d.T(consentResponse1);
    }
}

