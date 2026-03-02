import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.WifiNetworkDetails;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import com.google.android.gms.smartdevice.quickstart.WifiTransferResult;
import java.util.concurrent.CountDownLatch;

public final class eraa extends eqzx {
    private static final baun c;
    private final WifiTransferOptions d;
    private final eqxa e;
    private final erad f;
    private final CountDownLatch g;
    private Bundle h;

    static {
        eraa.c = new erqc(new String[]{"WifiTransferOperation"});
    }

    public eraa(WifiTransferOptions wifiTransferOptions0, eraf eraf0, eqxa eqxa0, erad erad0, azug azug0) {
        super("WifiTransferOperation", eraf0, azug0);
        this.g = new CountDownLatch(1);
        this.d = wifiTransferOptions0;
        this.e = eqxa0;
        this.f = erad0;
    }

    @Override  // eqzx
    public final void b() {
        super.b();
        eraa.c.d("Cancelling WifiTransferOperation", new Object[0]);
        this.g.countDown();
    }

    @Override  // eqzx
    protected final void d(Context context0) {
        WifiNetworkDetails wifiNetworkDetails0;
        this.e.d(this.d);
        eraa.c.d("Waiting for WiFi transfer result...", new Object[0]);
        try {
            this.g.await();
        }
        catch(InterruptedException unused_ex) {
            throw new cjuh(8, "Interrupted while waiting for WiFi transfer result");
        }
        this.h();
        Bundle bundle0 = this.h.getBundle("wifi_network");
        if(bundle0 == null || bundle0.isEmpty()) {
            throw new cjuh(10902, "No WiFi network transferred");
        }
        try {
            String s = bundle0.getString("wifi_ssid");
            batl.t(s, "WiFi details missing SSID");
            String s1 = bundle0.getString("wifi_security_type");
            batl.t(s1, "WiFi details missing security type");
            wifiNetworkDetails0 = new WifiNetworkDetails(s, s1, bundle0.getString("wifi_pre_shared_key"), bundle0.getBoolean("wifi_hidden_ssid"));
        }
        catch(NullPointerException nullPointerException0) {
            throw new cjuh(10902, "Failed to parse WiFi bundle", null, nullPointerException0);
        }
        if(hyja.c()) {
            this.b.e(this, Status.b);
        }
        WifiTransferResult wifiTransferResult0 = new WifiTransferResult(wifiNetworkDetails0);
        this.f.c(Status.b, wifiTransferResult0);
    }

    @Override  // eqzx
    protected final void e(Status status0) {
        this.f.c(status0, null);
    }

    @Override  // eqzx
    protected final void g(int v) {
        super.g(v);
        this.g.countDown();
    }

    @Override  // eqzx
    protected final void l(Bundle bundle0) {
        eraa.c.h("Received WiFi transfer result bundle", new Object[0]);
        this.h = bundle0;
        this.g.countDown();
    }
}

