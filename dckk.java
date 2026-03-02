import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

public final class dckk implements evqf {
    public final ReceiveSurfaceChimeraService a;
    public final WifiCredentialsAttachment b;

    public dckk(ReceiveSurfaceChimeraService receiveSurfaceChimeraService0, WifiCredentialsAttachment wifiCredentialsAttachment0) {
        this.a = receiveSurfaceChimeraService0;
        this.b = wifiCredentialsAttachment0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ConnectToWifiNetworkResponse connectToWifiNetworkResponse0 = (ConnectToWifiNetworkResponse)object0;
        this.a.i(0, 0x7F152D9B, new String[]{this.b.a});  // string:sharing_toast_wifi_connection_succeeded "Successfully connected to \'%1$s\'"
    }
}

