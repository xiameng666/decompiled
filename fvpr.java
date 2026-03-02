import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.collectionlib.WifiManagerImpl.1;

final class fvpr extends fvpq {
    final BroadcastReceiver e;

    public fvpr(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, long v) {
        super(context0, fvls0, fvlt0, fybc0, v);
        this.e = new WifiManagerImpl.1(this);
    }

    @Override  // fvpq
    public final void g() {
        IntentFilter intentFilter0 = new IntentFilter("android.net.wifi.SCAN_RESULTS");
        jwe.b(this.a, this.e, intentFilter0, 2);
    }

    @Override  // fvpq
    public final void h() {
        try {
            this.b.startScan();
        }
        catch(NullPointerException unused_ex) {
        }
    }

    @Override  // fvpq
    public final void o() {
        this.a.unregisterReceiver(this.e);
    }
}

