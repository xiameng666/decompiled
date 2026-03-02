import android.content.Context;
import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.WifiRttManager;
import j..util.Objects;
import java.util.concurrent.Executor;

class fwwg extends fwwc {
    final fwep a;

    public fwwg() {
        super(null);
        int v = Math.min(6, RangingRequest.getMaxPeers());
        Objects.requireNonNull(this);
        this.a = new fwep(-100, 5, v, 60000, 0.0, new fwen(), false);
    }

    @Override  // fwwc
    public void e(Context context0, fwvz fwvz0, boolean z, fwyc fwyc0, fvwz fvwz0, Executor executor0) {
        WifiRttManager wifiRttManager0 = (WifiRttManager)context0.getSystemService("wifirtt");
        if(wifiRttManager0 != null) {
            fwvz0 = new fwwf(context0, wifiRttManager0, this.a, fwvz0, fvwz0, executor0);
        }
        super.e(context0, fwvz0, z, fwyc0, fvwz0, executor0);
    }
}

