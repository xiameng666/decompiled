import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import com.google.android.gms.wearable.backup.wear.WifiConnectionHelper.1;
import java.util.concurrent.TimeUnit;

public final class fcvi implements jqv {
    public final fcvj a;

    public fcvi(fcvj fcvj0) {
        this.a = fcvj0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        WifiConnectionHelper.1 wifiConnectionHelper$10 = new WifiConnectionHelper.1(this.a, jqt0);
        this.a.c = wifiConnectionHelper$10;
        NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(1).build();
        int v = glwy.a(TimeUnit.SECONDS.toMillis(hzyp.a.b().f()));
        this.a.b.requestNetwork(networkRequest0, wifiConnectionHelper$10, v);
        return "WifiConnectionHelper#requestWifi future";
    }
}

