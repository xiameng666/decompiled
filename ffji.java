import android.net.wifi.WifiInfo;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffji extends ffee {
    final fdiy c;
    final String d;
    final fflv e;

    public ffji(fflv fflv0, fdiy fdiy0, String s) {
        this.c = fdiy0;
        this.d = s;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("syncConnectedWifiCredential");
    }

    @Override  // ffee
    public final void a() {
        feah feah0 = this.e.p;
        if(feah0 == null) {
            Log.e("WearableService", "syncConnectedWifiCredential: wifiService is null!");
            Status status0 = new Status(8);
            this.c.a(status0);
            return;
        }
        WifiInfo wifiInfo0 = feah0.c.getConnectionInfo();
        gmbu.t((wifiInfo0 == null || bbqr.d(wifiInfo0.getSSID()) ? gmbu.i(new Status(4008)) : feah0.c(this.d, wifiInfo0.getSSID())), new fflu(this.c), gmap.a);
    }
}

