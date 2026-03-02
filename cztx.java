import android.bluetooth.le.AdvertisingSet;
import android.bluetooth.le.AdvertisingSetCallback;
import j..util.Objects;

final class cztx extends AdvertisingSetCallback {
    final gmcu a;
    final gged_interceptors b;
    final czty c;

    public cztx(czty czty0, gmcu gmcu0, gged_interceptors gged0) {
        this.a = gmcu0;
        this.b = gged0;
        Objects.requireNonNull(czty0);
        this.c = czty0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertisingSetCallback
    public final void onAdvertisingSetStarted(AdvertisingSet advertisingSet0, int v, int v1) {
        if(v1 == 0) {
            this.a.q(null);
            czkq.a.b().i("[%s] Start instant onLost extended advertising, hashes = %s.", "InstantOnLostManager", czmk.f(this.b));
            return;
        }
        this.c.c = v1;
        RuntimeException runtimeException0 = new RuntimeException(String.format("Failed to start BLE onLost extended advertising due to error %s", czkg.b(v1)));
        this.a.r(runtimeException0);
        czkq.a.b().i("[%s] Failed to start instant onLost advertising via extended, due to error %s.", "InstantOnLostManager", czkg.b(v1));
    }
}

