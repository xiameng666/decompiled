import android.net.wifi.WifiManager.WifiLock;

public final class dghh implements ibth {
    public final dghl a;
    public final esaa b;
    public final WifiManager.WifiLock c;

    public dghh(dghl dghl0, esaa esaa0, WifiManager.WifiLock wifiManager$WifiLock0) {
        this.a = dghl0;
        this.b = esaa0;
        this.c = wifiManager$WifiLock0;
    }

    @Override  // ibth
    public final Object a() {
        dghl dghl0 = this.a;
        synchronized(dghl0) {
            dghl0.e = null;
            esaa esaa0 = this.b;
            if(esaa0 != null) {
                dcvz.a.b().p("Released wake lock", new Object[0]);
                esaa0.g();
            }
            WifiManager.WifiLock wifiManager$WifiLock0 = this.c;
            if(wifiManager$WifiLock0 != null) {
                dcvz.a.b().p("Released Wifi lock", new Object[0]);
                wifiManager$WifiLock0.release();
            }
            dghl0.f = null;
        }
        return ibom.a;
    }
}

