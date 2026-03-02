import android.bluetooth.le.ScanRecord;
import com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver;
import j..util.Objects;

public final class bowy {
    final BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver a;

    public bowy(BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0) {
        Objects.requireNonNull(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0);
        this.a = batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0;
        super();
    }

    public final void a(fgvl fgvl0) {
        if(fgvl0.a() != null) {
            ScanRecord scanRecord0 = fgvl0.a();
            gftb.check(scanRecord0);
            byte[] arr_b = scanRecord0.getServiceData(fqog.a);
            if(arr_b != null) {
                fray.a(gdtd.e(new boww(this), this.a.a.e).i(new bowx(this, arr_b, fgvl0), this.a.a.e), "Failed to handle batch scan result", new Object[0]);
            }
        }
    }
}

