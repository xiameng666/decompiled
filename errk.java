import android.content.Context;
import android.net.wifi.WifiConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

public final class errk extends cjtm {
    private static final baun a;
    private final erqz b;
    private final ConnectToWifiNetworkRequest c;

    static {
        errk.a = new erqc(new String[]{"Wifi", "ConnectToWifiNetworkOperation"});
    }

    public errk(erqz erqz0, ConnectToWifiNetworkRequest connectToWifiNetworkRequest0, azug azug0) {
        super(0x9F, "ConnectToWifiNetworkOperation", azug0);
        this.b = erqz0;
        this.c = connectToWifiNetworkRequest0;
    }

    protected final void b(erqn erqn0) {
        baun baun0 = errk.a;
        baun0.j("SSID: " + this.c.a, new Object[0]);
        baun0.j("Creating WifiConfiguration", new Object[0]);
        try {
            WifiConfiguration wifiConfiguration0 = erqr.a(this.c.b, this.c.a, this.c.c, this.c.d);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            errk.a.g("Exception setting up WiFi", unsupportedOperationException0, new Object[0]);
            Status status0 = new Status(10601);
            ConnectToWifiNetworkResponse connectToWifiNetworkResponse0 = new ConnectToWifiNetworkResponse();
            this.b.a(status0, connectToWifiNetworkResponse0);
            return;
        }
        if(erqn0.b(wifiConfiguration0) == -1) {
            baun0.f("Could not setup wifi, likely due to authentication error", new Object[0]);
            ConnectToWifiNetworkResponse connectToWifiNetworkResponse1 = new ConnectToWifiNetworkResponse();
            this.b.a(Status.d, connectToWifiNetworkResponse1);
            return;
        }
        ConnectToWifiNetworkResponse connectToWifiNetworkResponse2 = new ConnectToWifiNetworkResponse();
        this.b.a(Status.b, connectToWifiNetworkResponse2);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        this.b(new erqn(context0));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ConnectToWifiNetworkResponse connectToWifiNetworkResponse0 = new ConnectToWifiNetworkResponse();
        this.b.a(status0, connectToWifiNetworkResponse0);
    }
}

