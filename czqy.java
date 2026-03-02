import android.bluetooth.le.AdvertisingSet;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

final class czqy extends AdvertisingSetCallback {
    final AtomicBoolean a;
    final cupu b;
    final gmcu c;
    final czqz d;

    public czqy(czqz czqz0, AtomicBoolean atomicBoolean0, cupu cupu0, gmcu gmcu0) {
        this.a = atomicBoolean0;
        this.b = cupu0;
        this.c = gmcu0;
        Objects.requireNonNull(czqz0);
        this.d = czqz0;
        super();
    }

    @Override  // android.bluetooth.le.AdvertisingSetCallback
    public final void onAdvertisingSetStarted(AdvertisingSet advertisingSet0, int v, int v1) {
        if(v1 == 0) {
            if(hvol.aH() && this.a.get()) {
                czri.C(this.b, this);
            }
            this.c.q(null);
            return;
        }
        gymd gymd0 = czkg.a(v1);
        czke.j(this.d.d, 2, gymp.f, gymd0, String.format(Locale.US, "Failure code : %d", v1));
        cunf cunf0 = czkq.a.e();
        String s = gxyf.b(gxye.k, this.d.d);
        AdvertisingSetParameters advertisingSetParameters0 = this.d.a.d(this.d.c != null);
        cunf0.k("Failed to start BLE Legacy advertising, %s, with advertiseData : %s, scanResponse : %s, advertiseSettings : %s", s, this.d.b.toString(), String.valueOf(this.d.c), advertisingSetParameters0);
        RuntimeException runtimeException0 = new RuntimeException(String.format("Failed to start BLE Legacy advertising due to error %s", czkg.b(v1)));
        this.c.r(runtimeException0);
    }
}

