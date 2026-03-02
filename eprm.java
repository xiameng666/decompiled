import android.content.Intent;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprm implements glzn {
    public final ConsentChimeraActivity a;

    public eprm(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = ((gfsx)object0).i();
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        if(!z) {
            consentChimeraActivity0.a(6, "Device management is not supported");
            return gmbu.i(gfqx.a);
        }
        return glzd.f(consentChimeraActivity0.o.b(500, ((Intent)((gfsx)object0).d())), new eprn(consentChimeraActivity0), consentChimeraActivity0.l);
    }
}

