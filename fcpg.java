import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import j..util.Objects;

public final class fcpg implements evqf {
    public final fcpu a;
    public final aqej b;

    public fcpg(fcpu fcpu0, aqej aqej0) {
        this.a = fcpu0;
        this.b = aqej0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fcpu.a.h("Recovery result: " + ((RecoveryResult)object0).a, new Object[0]);
        int v = ((RecoveryResult)object0).a;
        fcpu fcpu0 = this.a;
        aqej aqej0 = this.b;
        if(v == 1) {
            fcpu0.c.g(fcpu0.d.b);
            fcpu0.f(2);
            KeyRecoveryChimeraActivity.j.j("onKeyRecoverySuccess", new Object[0]);
            Objects.requireNonNull(fcpu0.h.b);
            fcoz fcoz0 = new fcoz(fcpu0.h.b);
            fcpu0.h.b.runOnUiThread(fcoz0);
        }
        else {
            switch(v) {
                case 2: {
                    Integer integer0 = (aqej0.b & 16) == 0 ? null : ((int)(aqej0.f + 1));
                    if(integer0 == null || ((int)integer0) < fcpu.g((aqej0.c == null ? aqek.a : aqej0.c))) {
                        fcoy fcoy0 = new fcoy(fcpu0.h, integer0);
                        fcpu0.h.b.runOnUiThread(fcoy0);
                        break;
                    }
                    goto label_13;
                }
                case 3: {
                label_13:
                    fcpu0.f(3);
                    KeyRecoveryChimeraActivity.j.f("onVaultLocked", new Object[0]);
                    fcpb fcpb0 = new fcpb(fcpu0.h);
                    fcpu0.h.b.runOnUiThread(fcpb0);
                    break;
                }
                default: {
                    fcpu0.h.a();
                }
            }
        }
        fcpu0.a(((RecoveryResult)object0), aqej0);
    }
}

