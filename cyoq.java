import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.os.SystemClock;
import j..util.Objects;

final class cyoq extends AdvertiseCallback {
    final cyor a;

    public cyoq(cyor cyor0) {
        Objects.requireNonNull(cyor0);
        this.a = cyor0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        super.onStartFailure(v);
        cyjh.a.g().z("SeekerToSeekerBleAdvertiser: Error while starting ble advertising. Error code %d.", v);
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        this.a.a = SystemClock.elapsedRealtime();
        super.onStartSuccess(advertiseSettings0);
        cyjh.a.d().x("SeekerToSeekerBleAdvertiser: Successfully started ble advertising.");
    }
}

