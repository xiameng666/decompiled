import com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver;

public final class bowv implements Runnable {
    public final BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver a;

    public bowv(BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0) {
        this.a = batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0;
    }

    @Override
    public final void run() {
        this.a.a.b.c(this.a.b);
    }
}

