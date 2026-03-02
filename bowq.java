import android.content.IntentFilter;
import com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver;

public final class bowq implements gfsi {
    public final bowz a;

    public bowq(bowz bowz0) {
        this.a = bowz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        bowz bowz0 = this.a;
        synchronized(bowz0.h) {
            if(!((Boolean)object0).booleanValue()) {
                BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver1 = bowz0.i;
                if(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver1 != null) {
                    batchScanningManagerImpl$ScreenOnOffBroadcastReceiver1.d();
                    BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver2 = bowz0.i;
                    gftb.check(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver2);
                    bowz0.g.unregisterReceiver(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver2);
                    bowz0.i = null;
                }
            }
            else if(bowz0.i == null) {
                bowz0.i = new BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver(bowz0, bowz0.g);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("android.intent.action.SCREEN_ON");
                intentFilter0.addAction("android.intent.action.SCREEN_OFF");
                jwe.b(bowz0.g, bowz0.i, intentFilter0, 2);
                BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0 = bowz0.i;
                gftb.check(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0);
                batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0.b(((boolean)(bowz0.f() ^ 1)));
            }
        }
        return null;
    }
}

