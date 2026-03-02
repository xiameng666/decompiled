import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.service.controllers.UserAuthorizationController.1;
import com.google.android.gms.fido.authenticator.service.controllers.UserAuthorizationController.2;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class blsq implements jqv {
    public final blss a;

    public blsq(blss blss0) {
        this.a = blss0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gmcd gmcd0;
        Objects.requireNonNull(jqt0);
        blsp blsp0 = new blsp(jqt0);
        blss blss0 = this.a;
        bltv bltv0 = blss0.a;
        if(bltv0.g == 1) {
            gmcd0 = jqy.a(new bltt(bltv0));
            if(bltv0.f()) {
                bltv0.d.compareAndSet(0, 1);
                bltv0.b(blhc.ao);
                if(bltv0.f == null) {
                    bltv0.f = new UserAuthorizationController.1(bltv0);
                    IntentFilter intentFilter0 = new IntentFilter();
                    intentFilter0.addAction("android.intent.action.USER_PRESENT");
                    jwe.b(bltv0.a, bltv0.f, intentFilter0, 2);
                }
                bltv0.c.b();
            }
            else {
                bltv0.c();
            }
        }
        else {
            gmcd0 = jqy.a(new blts(bltv0));
            if(bltv0.f()) {
                bltv0.d.compareAndSet(0, 1);
                if(bltv0.f == null) {
                    bltv0.f = new UserAuthorizationController.2(bltv0);
                    IntentFilter intentFilter1 = new IntentFilter();
                    intentFilter1.addAction("android.intent.action.USER_PRESENT");
                    jwe.b(bltv0.a, bltv0.f, intentFilter1, 2);
                }
                bltv0.c.b();
            }
            else {
                bltu bltu0 = bltv0.e;
                if(bltu0 != null) {
                    bltu0.a(0);
                }
            }
        }
        gmbu.t(gmbu.q(gmcd0, hsvp.b(), TimeUnit.MILLISECONDS, blss0.b), new blsr(blss0, blsp0), gmap.a);
        return "Execute caBLE v2 authorization stage";
    }
}

