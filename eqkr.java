import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;

final class eqkr implements Callable {
    final BootstrapProgressResult a;
    final eqis b;

    public eqkr(eqis eqis0, BootstrapProgressResult bootstrapProgressResult0) {
        this.a = bootstrapProgressResult0;
        Objects.requireNonNull(eqis0);
        this.b = eqis0;
        super();
    }

    @Override
    public final Object call() {
        baun baun0 = eqqd.a;
        baun0.j("TargetBootstrapListener.onProgress()", new Object[0]);
        eqqd eqqd0 = ((eqqa)((eqdy)this.b.a).a).a;
        Bundle bundle0 = this.a.b;
        eqqd0.ag = bundle0;
        ArrayList arrayList0 = eqqd0.ag.getParcelableArrayList("accounts");
        switch(this.a.a) {
            case 1: {
                PendingIntent pendingIntent0 = (PendingIntent)eqqd0.ag.getParcelable("pendingIntent");
                if(pendingIntent0 != null) {
                    eqqd0.al.d(eqqd0, pendingIntent0);
                    return Boolean.valueOf(false);
                }
                Bundle bundle1 = eqqd0.ag;
                baun0.j("handleProgressResults()", new Object[0]);
                TargetChimeraActivity targetChimeraActivity0 = (TargetChimeraActivity)eqqd0.getContext();
                targetChimeraActivity0.t = (ResultReceiver)bundle1.getParcelable("resultReceiver");
                Bundle bundle2 = eqqd.B(bundle1);
                TargetChimeraActivity.h.j("handleProgressResults", new Object[0]);
                boolean z = bundle0.getBoolean("isFidoFlow");
                targetChimeraActivity0.n = z;
                TargetChimeraActivity.h.j("Is fido flow: " + z, new Object[0]);
                ArrayList arrayList1 = bundle2.getParcelableArrayList("accounts");
                if(arrayList1 != null) {
                    boolean z1 = targetChimeraActivity0.n;
                    targetChimeraActivity0.k(eriu.b(arrayList1, bundle2.getString("restoreAccount"), null, null, -1, true, z1, false, null, 0));
                    targetChimeraActivity0.l = 9;
                }
                if(arrayList0 != null) {
                    eqqd0.aj.c(10, arrayList0.size());
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(false);
            }
            case 2: {
                baun0.j("Wifi setup", new Object[0]);
                return Boolean.valueOf(false);
            }
            case 3: {
                eqqd0.ak = true;
                return Boolean.valueOf(false);
            }
            case 4: {
                boolean z2 = eqqd0.ak;
                if(!z2) {
                    if(arrayList0 != null) {
                        eqqd0.aj.c(9, arrayList0.size());
                        return Boolean.valueOf(false);
                    }
                    arrayList0 = null;
                }
                if(z2 && arrayList0 != null) {
                    eqqd0.aj.c(11, arrayList0.size());
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(false);
            }
            case 5: {
                eqqd0.aj.b(7);
                return Boolean.valueOf(false);
            }
            case 7: {
                eqqd0.aj.b(12);
                return Boolean.valueOf(false);
            }
            default: {
                baun0.j("Unknown progress event", new Object[0]);
                return Boolean.valueOf(false);
            }
        }
    }
}

