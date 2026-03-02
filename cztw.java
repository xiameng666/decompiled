import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import j..util.Objects;

final class cztw extends AdvertiseCallback {
    final gmcu a;
    final gged_interceptors b;
    final czty c;

    public cztw(czty czty0, gmcu gmcu0, gged_interceptors gged0) {
        this.a = gmcu0;
        this.b = gged0;
        Objects.requireNonNull(czty0);
        this.c = czty0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        this.c.c = v;
        Exception exception0 = new Exception(String.format("Failed to start BLE onLost legacy advertising due to error %s", czkf.a(v)));
        this.a.r(exception0);
        czkq.a.e().i("[%s] Failed to start instant onLost legacy advertising , due to error %s.", "InstantOnLostManager", czkf.a(v));
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        this.a.q(null);
        czkq.a.b().i("[%s] Start instant onLost legacy advertising, hashes = %s.", "InstantOnLostManager", czmk.f(this.b));
    }
}

