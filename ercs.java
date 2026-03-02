import android.os.RemoteException;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;

public final class ercs implements Runnable {
    public final TargetQuickStartChimeraActivity a;
    public final int b;
    public final TargetQuickStartOptions c;
    public final eqwu d;

    public ercs(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0, int v, TargetQuickStartOptions targetQuickStartOptions0, eqwu eqwu0) {
        this.a = targetQuickStartChimeraActivity0;
        this.b = v;
        this.c = targetQuickStartOptions0;
        this.d = eqwu0;
    }

    @Override
    public final void run() {
        try {
            this.a.q.f(this.b, this.c, this.d);
            TargetQuickStartChimeraActivity.i.d("TargetQuickStartService#start() called", new Object[0]);
        }
        catch(RemoteException remoteException0) {
            TargetQuickStartChimeraActivity.i.l(remoteException0);
        }
    }
}

