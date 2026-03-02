import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public final class cyrr implements Runnable {
    public final cysc a;

    public cyrr(cysc cysc0) {
        this.a = cysc0;
    }

    @Override
    public final void run() {
        cysc cysc0 = this.a;
        ComponentName componentName0 = cunb.a(cysc0.a);
        if(hvpg.bJ()) {
            ((ggtj)cysc0.n.d().ar(8065)).B("WearScannerHelper: updateScannerStateIfNeeded, foregroundComponent=%s", componentName0);
        }
        if(componentName0 == null) {
            cysc0.l(1);
            return;
        }
        String s = componentName0.getPackageName();
        if(TextUtils.isEmpty(s)) {
            cysc0.l(1);
            return;
        }
        boolean z = false;
        int v = cysc0.g.getDisplay(0).getState();
        if(v == 2) {
            hvpg hvpg0 = hvpg.a;
            if(!hvpg0.aY().fD().b.contains(s)) {
                PackageManager packageManager0 = cysc0.c;
                if(!hvpg0.aY().fg().b.contains(s)) {
                    switch(cyfn.b(packageManager0, s)) {
                        case 1: 
                        case 2: {
                            break;
                        }
                        default: {
                            goto label_31;
                        }
                    }
                }
                if(!s.equals(cysc0.m) && !cysc0.l.isMusicActive()) {
                    z = true;
                }
                cysc0.m = s;
                if(!cysc0.d.h(2).isEmpty()) {
                    cysc0.l(2);
                    cysc0.m = s;
                    if(z) {
                        cysc0.k.i(true, "BLUETOOTH_PERIPHERAL_CONNECTED", 0L);
                    }
                    return;
                }
                cysc0.j(s);
                return;
            }
        label_31:
            if(hvpg0.aY().fE().b.contains(s)) {
                if(!cysc0.d.h(1).isEmpty()) {
                    cysc0.l(2);
                    return;
                }
                gged_interceptors gged0 = cyfn.c(cysc0.f);
                if(gged0 != null && !gged0.isEmpty()) {
                    if(hvpg.bJ()) {
                        ((ggtj)cysc0.n.d().ar(0x1F7F)).B("WearScannerHelper: Tethered, node=%s", gged0);
                    }
                    cysc0.l(4);
                    return;
                }
                ((ggtj)cysc0.n.d().ar(8062)).x("WearScannerHelper: Not tethered, trigger scan because calling app is in foreground");
                cysc0.j(s);
                return;
            }
            cysc0.l(1);
            return;
        }
        ((ggtj)cysc0.n.d().ar(0x1F80)).z("WearScannerHelper: updateScannerStateIfNeeded, displayState=%d, stop scan", v);
        cysc0.l(5);
    }
}

