import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.service.WearableServiceBase.PackageBroadcastReceiver;

public final class fffs implements Runnable {
    public final WearableServiceBase.PackageBroadcastReceiver a;
    public final Intent b;
    public final BroadcastReceiver.PendingResult c;

    public fffs(WearableServiceBase.PackageBroadcastReceiver wearableServiceBase$PackageBroadcastReceiver0, Intent intent0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        this.a = wearableServiceBase$PackageBroadcastReceiver0;
        this.b = intent0;
        this.c = broadcastReceiver$PendingResult0;
    }

    @Override
    public final void run() {
        String s = this.b.getData().getSchemeSpecificPart();
        WearableServiceBase.PackageBroadcastReceiver wearableServiceBase$PackageBroadcastReceiver0 = this.a;
        ffgm ffgm0 = wearableServiceBase$PackageBroadcastReceiver0.a;
        ffft ffft0 = (ffft)ffgm0.f.remove(s);
        synchronized(ffgm0.g) {
            ffgm0.g.remove(s);
        }
        if(ffft0 != null) {
            ffft0.b(ffgm0);
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", "Removed package record: " + ffmr.b(s, ffft0.d));
            }
        }
        synchronized(wearableServiceBase$PackageBroadcastReceiver0.a.h) {
            wearableServiceBase$PackageBroadcastReceiver0.a.i = null;
        }
        wearableServiceBase$PackageBroadcastReceiver0.a.I.a(wearableServiceBase$PackageBroadcastReceiver0.a.getApplicationContext().getPackageManager(), s);
        this.c.finish();
    }
}

