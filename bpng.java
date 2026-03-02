import android.content.IntentFilter;
import com.google.android.gms.findmydevice.spot.service.FinderChimeraService.OfflineBeaconBroadcastReceiver;
import com.google.android.gms.findmydevice.spot.service.FinderChimeraService.PowerSaveModeBroadcastReceiver;
import com.google.android.gms.findmydevice.spot.service.FinderChimeraService;

public final class bpng implements Runnable {
    public final FinderChimeraService a;

    public bpng(FinderChimeraService finderChimeraService0) {
        this.a = finderChimeraService0;
    }

    @Override
    public final void run() {
        FinderChimeraService finderChimeraService0 = this.a;
        if(hsww.i()) {
            fray.a(((bnmz)finderChimeraService0.d.a()).a(), "Offline beacon state refresh failed.", new Object[0]);
        }
        synchronized(finderChimeraService0.a) {
            if(!finderChimeraService0.b) {
                if(hsww.k()) {
                    fray.a(((bpcz)finderChimeraService0.c.a()).a(), "Self location fetcher initialization failed.", new Object[0]);
                    if(hsxl.j()) {
                        IntentFilter intentFilter0 = new IntentFilter();
                        intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                        jwe.b(finderChimeraService0, new FinderChimeraService.PowerSaveModeBroadcastReceiver(finderChimeraService0, finderChimeraService0), intentFilter0, 2);
                    }
                }
                if(hsww.i() && ((bnne)finderChimeraService0.e.a()).d()) {
                    IntentFilter intentFilter1 = new IntentFilter();
                    intentFilter1.addAction("android.intent.action.ACTION_SHUTDOWN");
                    intentFilter1.addAction("android.intent.action.BATTERY_LOW");
                    intentFilter1.setPriority(999);
                    jwe.b(finderChimeraService0, new FinderChimeraService.OfflineBeaconBroadcastReceiver(finderChimeraService0, finderChimeraService0), intentFilter1, 2);
                }
                finderChimeraService0.b = true;
            }
        }
        ((bown)finderChimeraService0.f.a()).a();
    }
}

