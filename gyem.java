import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.concurrent.CountDownLatch;

final class gyem extends AdvertiseCallback {
    public final CountDownLatch a;
    public boolean b;

    public gyem() {
        this.a = new CountDownLatch(1);
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        String s;
        ggtj ggtj0 = (ggtj)((ggtj)gyke.a.i()).ar(20194);
        switch(v) {
            case 1: {
                s = "ADVERTISE_FAILED_DATA_TOO_LARGE";
                break;
            }
            case 2: {
                s = "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS";
                break;
            }
            case 3: {
                s = "ADVERTISE_FAILED_ALREADY_STARTED";
                break;
            }
            case 4: {
                s = "ADVERTISE_FAILED_INTERNAL_ERROR";
                break;
            }
            case 5: {
                s = "ADVERTISE_FAILED_FEATURE_UNSUPPORTED";
                break;
            }
            default: {
                s = a.f(v, "UNKNOWN (", ")");
            }
        }
        ggtj0.B("BleAdvertiseImplL: Failed to start, error code: %s", s);
        this.b = false;
        this.a.countDown();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        this.b = true;
        this.a.countDown();
    }
}

