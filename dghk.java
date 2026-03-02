import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;

final class dghk extends ibsl implements ibtw {
    int a;
    final dghl b;
    final cuvf c;
    private Object d;

    public dghk(dghl dghl0, cuvf cuvf0, ibrl ibrl0) {
        this.b = dghl0;
        this.c = cuvf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dghk)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dghk(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v2;
        WifiManager.WifiLock wifiManager$WifiLock0;
        esaa esaa0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.d;
            dghj dghj0 = new dghj(this.b, ichm0);
            synchronized(this.b) {
                this.b.e = this.c;
                this.b.f = ichm0;
                wifiManager$WifiLock0 = null;
                v2 = 3;
                this.b.d = icbb.b(ichm0, null, null, new dghi(this.b, dghj0, ichm0, null), 3);
            }
            dghl dghl0 = this.b;
            String s = "NearbyShare{" + dghl0.c + "}";
            if(hvqz.S()) {
                dcvz.a.b().p("Acquired wake lock", new Object[0]);
                esaa0 = new esaa(dghl0.a, 26, s, "A wakelock created by NearbyShare while sending or receiving a file", "com.google.android.gms");
            }
            else {
                dcvz.a.b().p("Skipped acquiring wake lock", new Object[0]);
                esaa0 = null;
            }
            if(esaa0 != null) {
                esaa0.b();
            }
            if(hvqz.T()) {
                dcvz.a.b().p("Acquired Wifi lock", new Object[0]);
                Object object2 = dghl0.a.getApplicationContext().getSystemService("wifi");
                ibuq.d(object2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                if(bbqa.d()) {
                    v2 = 4;
                }
                wifiManager$WifiLock0 = ((WifiManager)object2).createWifiLock(v2, s);
            }
            else {
                dcvz.a.b().p("Skipped acquiring Wifi lock", new Object[0]);
            }
            if(wifiManager$WifiLock0 != null) {
                wifiManager$WifiLock0.acquire();
            }
            dghh dghh0 = new dghh(dghl0, esaa0, wifiManager$WifiLock0);
            this.a = 1;
            if(ichl.b(ichm0, dghh0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

