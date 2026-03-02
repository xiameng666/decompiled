import com.google.android.gms.wallet.analytics.events.ReauthApiEvent;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import j..util.Objects;
import java.util.UUID;

final class fcdc extends fbnw {
    final fcdd a;

    public fcdc(fcdd fcdd0) {
        Objects.requireNonNull(fcdd0);
        this.a = fcdd0;
        super();
    }

    @Override  // fbnw
    public final void c() {
        this.a.m(-1);
    }

    @Override  // fbnw
    public final void f() {
        this.a.m(100);
    }

    @Override  // fbnw
    public final void h(ReauthProofTokenResponse reauthProofTokenResponse0) {
        int v = reauthProofTokenResponse0.b;
        fcdd fcdd0 = this.a;
        int v1 = fcdd0.f;
        String s = UUID.randomUUID().toString();
        ReauthApiEvent.d(fcdd0.a, ReauthApiEvent.c(v), reauthProofTokenResponse0.c, v1, s);
        int v2 = ReauthApiEvent.a(v);
        gcfz.q(fcdd0.b, fcdd0.e, (v2 == 0 ? 2 : 5), v2, null, null, 1);
        if(v == 0) {
            fbej fbej0 = fbej.a(fcdd0, "doAnimateSuccess");
            fbej0.a.putString("encodedPreauthProofToken", reauthProofTokenResponse0.a);
            long v3 = fcdd0.i.a();
            fcdd0.h.postDelayed(fbej0, v3);
            return;
        }
        fbej fbej1 = fbej.a(fcdd0, "doAnimateError");
        fbej1.a.putInt("errorCode", v);
        long v4 = fcdd0.i.a();
        fcdd0.h.postDelayed(fbej1, v4);
    }
}

