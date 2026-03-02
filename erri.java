import android.content.Context;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;

public final class erri extends azts implements erqw {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        erri.b = azss0;
        errf errf0 = new errf();
        erri.c = errf0;
        erri.a = new azta_api("SmartDevice.WifiHelper.API", errf0, azss0);
    }

    public erri(Context context0) {
        super(context0, erri.a, azsx.s, aztr_settings.a);
    }

    @Override  // erqw
    public final evql b(ConnectToWifiNetworkRequest connectToWifiNetworkRequest0) {
        azzc azzc0 = new azzc();
        azzc0.d = 20753;
        azzc0.a = new erre(this, connectToWifiNetworkRequest0);
        return this.jn(azzc0.a());
    }
}

