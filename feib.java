import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

final class feib extends AdvertiseCallback {
    public final CountDownLatch a;
    public volatile boolean b;

    public feib() {
        this.a = new CountDownLatch(1);
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        Log.e("AdvertisingHandler", "Advertising failed to start. error: " + v);
        this.b = false;
        this.a.countDown();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        feic.a("Advertising started");
        Log.i("AdvertisingHandler", "onStartSuccess()");
        this.b = true;
        this.a.countDown();
    }
}

