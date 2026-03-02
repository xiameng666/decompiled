import com.google.android.gms.wearable.internal.RecordTermConsentRequest;
import j..util.Objects;

final class ffkx extends ffee {
    final RecordTermConsentRequest c;
    final fdiy d;
    final fflv e;

    public ffkx(fflv fflv0, RecordTermConsentRequest recordTermConsentRequest0, fdiy fdiy0) {
        this.c = recordTermConsentRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("recordTermConsent");
    }

    @Override  // ffee
    public final void a() {
        evql evql0;
        if(fdci.a(ffgp.m())) {
            batl.s(this.e.C);
            boolean z = ffgp.k();
            evql0 = this.e.C.g(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, z, this.c.f);
        }
        else {
            batl.s(this.e.C);
            boolean z1 = ffgp.k();
            evql0 = this.e.C.g(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, z1, null);
        }
        evql0.z(new ffkw(this.d));
    }
}

