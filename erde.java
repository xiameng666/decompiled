import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import j..util.Objects;

final class erde extends clil {
    final TargetQuickStartChimeraActivity a;

    public erde(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0) {
        Objects.requireNonNull(targetQuickStartChimeraActivity0);
        this.a = targetQuickStartChimeraActivity0;
        super("SmartDevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        eqxa eqxa0;
        if(iBinder0 == null) {
            eqxa0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
            eqxa0 = (iInterface0 instanceof eqxa) ? ((eqxa)iInterface0) : new eqwy(iBinder0);
        }
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a;
        targetQuickStartChimeraActivity0.q = eqxa0;
        if(targetQuickStartChimeraActivity0.q == null) {
            TargetQuickStartChimeraActivity.i.f("Failed to start service", new Object[0]);
            return;
        }
        targetQuickStartChimeraActivity0.r = new erdd(this);
        TargetQuickStartOptions targetQuickStartOptions0 = targetQuickStartChimeraActivity0.K;
        if(targetQuickStartOptions0 != null) {
            targetQuickStartChimeraActivity0.D(targetQuickStartChimeraActivity0.t, targetQuickStartOptions0, targetQuickStartChimeraActivity0.r);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

