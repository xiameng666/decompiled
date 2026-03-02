import android.app.KeyguardManager;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arcs implements Runnable {
    public final D2dSourceChimeraActivity a;

    public arcs(D2dSourceChimeraActivity d2dSourceChimeraActivity0) {
        this.a = d2dSourceChimeraActivity0;
    }

    @Override
    public final void run() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.a;
        if(!d2dSourceChimeraActivity0.s()) {
            KeyguardManager keyguardManager0 = (KeyguardManager)d2dSourceChimeraActivity0.getSystemService("keyguard");
            if(keyguardManager0 == null || keyguardManager0.isKeyguardSecure()) {
                d2dSourceChimeraActivity0.o(arch.c);
                return;
            }
        }
        d2dSourceChimeraActivity0.l();
    }
}

