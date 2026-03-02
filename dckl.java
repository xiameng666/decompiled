import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraService;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

public final class dckl implements evqc {
    public final ReceiveSurfaceChimeraService a;
    public final WifiCredentialsAttachment b;

    public dckl(ReceiveSurfaceChimeraService receiveSurfaceChimeraService0, WifiCredentialsAttachment wifiCredentialsAttachment0) {
        this.a = receiveSurfaceChimeraService0;
        this.b = wifiCredentialsAttachment0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.i(0, 0x7F152D9A, new String[]{this.b.a});  // string:sharing_toast_wifi_connection_failed "Failed to connect to \'%1$s\'"
        dcvz.a.e().f(exception0).h("WifiUtils#connectToWifi failed to connect to %s", this.b.a);
    }
}

