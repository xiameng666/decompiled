import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import j..util.Objects;

final class eqtl extends AdvertiseCallback {
    final eqtn a;

    public eqtl(eqtn eqtn0) {
        Objects.requireNonNull(eqtn0);
        this.a = eqtn0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        eqtn.e.d("Start advertising failed: " + v, new Object[0]);
        this.a.j = null;
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        eqtn.e.d("Start advertising succeed.", new Object[0]);
    }
}

