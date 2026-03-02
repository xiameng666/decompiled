import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.util.Log;

public final class fduf extends fdpj {
    public fduf(Context context0, fdsh fdsh0, fdyy fdyy0, fdyq fdyq0, fdvl fdvl0, fdxu fdxu0, bsoj bsoj0) {
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getApplicationContext().getSystemService("connectivity");
        super(context0, fdsh0, fdyy0, fdyq0, fdvl0, fdxu0, false, bsoj0);
        super.i();
        this.n(false);
    }

    @Override  // fdpj
    protected final boolean C() {
        return true;
    }

    @Override  // fdpj
    protected final void l(String s) {
        synchronized(this.f) {
            Log.i("CloudSync", "Disabling cloud sync.");
            this.d();
            this.p.a("Cloud sync is disabled: " + s);
        }
    }
}

