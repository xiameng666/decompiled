import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

final class fegn extends AdvertiseCallback {
    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        ffmn.b("BleAdvertisingManager", "Advertising failed to start. error: %s", new Object[]{v});
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        ffmn.d("BleAdvertisingManager", "Advertising started", new Object[0]);
    }
}

