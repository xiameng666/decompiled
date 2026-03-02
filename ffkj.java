import com.google.android.gms.wearable.internal.AddAccountToConsentRequest;
import j..util.Objects;

final class ffkj extends ffee {
    final AddAccountToConsentRequest c;
    final fdiy d;
    final fflv e;

    public ffkj(fflv fflv0, AddAccountToConsentRequest addAccountToConsentRequest0, fdiy fdiy0) {
        this.c = addAccountToConsentRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("addAccountToConsent");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.e.C);
        evql evql0 = this.e.C.b(this.c.a, null, this.c.b);
        evql0.z(new ffkh(this.d));
        evql0.A(new ffki());
    }
}

