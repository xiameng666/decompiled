import android.net.wifi.WifiConfiguration;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;

final class eqdl implements eqdm {
    private final eqdn a;
    private final epwt b;
    private final BootstrapConfigurations c;

    public eqdl(eqdn eqdn0, epwt epwt0, BootstrapConfigurations bootstrapConfigurations0) {
        this.a = eqdn0;
        this.b = epwt0;
        this.c = bootstrapConfigurations0;
    }

    @Override  // eqdm
    public final void a() {
        eqdn.f.d("Processing Wi-Fi in BootstrapConfigurations.", new Object[0]);
        String s = this.c.c;
        eqdn.f.j("BootstrapConfigurations SSID: " + s, new Object[0]);
        eqdn.f.j("Creating WifiConfiguration", new Object[0]);
        try {
            WifiConfiguration wifiConfiguration0 = erqr.a(this.c.e, this.c.c, this.c.d, false);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            eqdn.f.g("Exception setting up WiFi", unsupportedOperationException0, new Object[0]);
            this.a.l(10574);
            this.b.d(10574, null);
            return;
        }
        eqdn eqdn0 = this.a;
        if(new erqn(eqdn0.g).b(wifiConfiguration0) == -1) {
            eqdn.f.f("Could not setup wifi, likely due to authentication error", new Object[0]);
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.h = new ProgressEvent(null);
            messagePayload0.a.add(Integer.valueOf(8));
            eqdn0.n(messagePayload0);
            eqdn0.j = true;
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("ssid", s);
        eqdn0.s(new BootstrapProgressResult(2, bundle0));
    }
}

