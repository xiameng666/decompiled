import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public final class fwuy {
    public fxbx a;
    public ConnectivityManager.NetworkCallback b;
    public Context c;
    public Network d;
    private final fvwz e;
    private final fwyl f;

    public fwuy(fxbx fxbx0, fvwz fvwz0, fwyl fwyl0) {
        this.a = fxbx0;
        this.e = fvwz0;
        this.f = fwyl0;
    }

    public final void a(int v, NetworkCapabilities networkCapabilities0) {
        int v1 = 0;
        if(networkCapabilities0 != null) {
            int v2 = networkCapabilities0.hasCapability(11);
            int v3 = networkCapabilities0.hasCapability(12) ? 2 : 0;
            int v4 = networkCapabilities0.hasCapability(17) ? 4 : 0;
            int v5 = networkCapabilities0.hasTransport(1) ? 8 : 0;
            int v6 = networkCapabilities0.hasTransport(0) ? 16 : 0;
            int v7 = networkCapabilities0.hasTransport(2) ? 0x20 : 0;
            int v8 = networkCapabilities0.hasTransport(3) ? 0x40 : 0;
            int v9 = networkCapabilities0.hasTransport(8) ? 0x80 : 0;
            int v10 = networkCapabilities0.hasTransport(10) ? 0x100 : 0;
            if(fwuy.c(networkCapabilities0)) {
                v1 = 0x200;
            }
            v1 |= v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10;
        }
        fwso.i(this.e, v, v1);
    }

    public final void b(NetworkCapabilities networkCapabilities0) {
        boolean z3;
        boolean z2;
        boolean z1;
        String s1;
        int v1;
        if(huvd.A()) {
            Context context0 = this.c;
            if(context0 != null) {
                if(networkCapabilities0 == null) {
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
                    networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                }
                int v = -1;
                String s = null;
                boolean z = false;
                if(networkCapabilities0 == null || !networkCapabilities0.hasCapability(12)) {
                    v1 = -1;
                    s1 = null;
                    z3 = false;
                    z1 = false;
                    z2 = false;
                label_52:
                    this.a.d(z3, z1, z2, v1, s1);
                    boolean z4 = fwuy.c(networkCapabilities0);
                    this.f.d(z3, z1, z2, z, z4, v1);
                }
                else if(networkCapabilities0.hasTransport(1)) {
                    Context context1 = this.c;
                    if(context1 != null) {
                        WifiInfo wifiInfo0 = ((WifiManager)context1.getApplicationContext().getSystemService(WifiManager.class)).getConnectionInfo();
                        if(wifiInfo0 != null) {
                            v = wifiInfo0.getNetworkId();
                        }
                        if(wifiInfo0 != null && hupk.j()) {
                            s = wifiInfo0.getBSSID();
                        }
                        v1 = v;
                        s1 = s;
                        z1 = false;
                        z2 = false;
                        z3 = true;
                        goto label_52;
                    }
                    goto label_24;
                }
                else {
                label_24:
                    if(networkCapabilities0.hasTransport(0) || networkCapabilities0.hasTransport(3)) {
                        v1 = -1;
                        s1 = null;
                        z3 = false;
                        z2 = false;
                        z1 = true;
                        goto label_52;
                    }
                    else if(networkCapabilities0.hasTransport(2)) {
                        v1 = -1;
                        s1 = null;
                        z3 = false;
                        z1 = false;
                        z2 = true;
                        goto label_52;
                    }
                    else if(networkCapabilities0.hasTransport(10)) {
                        v1 = -1;
                        s1 = null;
                        z3 = false;
                        z1 = false;
                        z2 = false;
                        z = true;
                        goto label_52;
                    }
                }
            }
        }
    }

    private static final boolean c(NetworkCapabilities networkCapabilities0) {
        return networkCapabilities0 == null ? false : jys.d() && !networkCapabilities0.hasCapability(37);
    }
}

