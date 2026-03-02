import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.service.controllers.TurnOnLocationController.1;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class bltm implements jqv {
    public final bltp a;

    public bltm(bltp bltp0) {
        this.a = bltp0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        Objects.requireNonNull(jqt0);
        bltn bltn0 = new bltn(jqt0);
        bltp bltp0 = this.a;
        if(blzc.a(bltp0.a)) {
            bltn0.a(Integer.valueOf(0));
            return "Execute turn on Location stage";
        }
        bltl bltl0 = bltp0.b;
        gmcd gmcd0 = jqy.a(new bltk(bltl0));
        Context context0 = bltl0.a;
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        if(keyguardManager0 != null && keyguardManager0.isKeyguardLocked()) {
            bltl0.c.compareAndSet(0, 1);
            bltl0.b(blhc.ao);
            if(bltl0.d == null) {
                bltl0.d = new TurnOnLocationController.1(bltl0);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.USER_PRESENT");
                jwe.b(context0, bltl0.d, intentFilter0, 2);
            }
            bltl0.b.b();
        }
        else {
            bltl0.c();
        }
        gmbu.t(gmbu.q(gmcd0, hsvp.b(), TimeUnit.MILLISECONDS, bltp0.c), new blto(bltp0, bltn0), gmap.a);
        return "Execute turn on Location stage";
    }
}

