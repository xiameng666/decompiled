import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

public final class eqpk implements Runnable {
    public final TargetChimeraActivity a;
    public final Bundle b;

    public eqpk(TargetChimeraActivity targetChimeraActivity0, Bundle bundle0) {
        this.a = targetChimeraActivity0;
        this.b = bundle0;
    }

    @Override
    public final void run() {
        TargetChimeraActivity targetChimeraActivity0 = this.a;
        if(!targetChimeraActivity0.k.isEmpty()) {
            targetChimeraActivity0.u(false);
            return;
        }
        targetChimeraActivity0.m(this.b);
    }
}

