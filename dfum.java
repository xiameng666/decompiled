import android.content.Context;
import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import jeb.synthetic.FIN;

public final class dfum {
    public static final byte[] a;
    public final dfvp b;
    public final String c;
    public final ConcurrentLinkedQueue d;
    public boolean e;
    public dful f;
    private esaa g;
    private WifiManager.WifiLock h;

    static {
        dfum.a = new byte[0];
    }

    public dfum(Context context0, dfvp dfvp0, String s) {
        this.d = new ConcurrentLinkedQueue();
        this.e = false;
        this.b = dfvp0;
        this.c = s;
        String s1 = "NearbyShare{" + s + "}";
        if(hvqz.S()) {
            esaa esaa0 = new esaa(context0, 26, s1, "A wakelock created by NearbyShare while sending or receiving a file");
            this.g = esaa0;
            esaa0.b();
            dcvz.a.b().p("Acquired wake lock", new Object[0]);
        }
        else {
            dcvz.a.b().p("Skipped acquiring wake lock", new Object[0]);
        }
        if(hvqz.T()) {
            WifiManager.WifiLock wifiManager$WifiLock0 = ((WifiManager)context0.getSystemService("wifi")).createWifiLock(3, s1);
            this.h = wifiManager$WifiLock0;
            wifiManager$WifiLock0.acquire();
            dcvz.a.b().p("Acquired Wifi lock", new Object[0]);
        }
        else {
            dcvz.a.b().p("Skipped acquiring Wifi lock", new Object[0]);
        }
        dcvz.a.b().h("A new NearbyConnection for %s has been created", s);
    }

    public final void a() {
        dfvp dfvp0 = this.b;
        synchronized(dfvp0) {
            if(!this.e) {
                String s = this.c;
                dfvp0.k(s);
                this.d.add(dfum.a);
                dful dful0 = this.f;
                if(dful0 != null) {
                    dful0.a();
                }
                esaa esaa0 = this.g;
                if(esaa0 != null) {
                    esaa0.g();
                    this.g = null;
                    dcvz.a.b().p("Released wake lock", new Object[0]);
                }
                WifiManager.WifiLock wifiManager$WifiLock0 = this.h;
                if(wifiManager$WifiLock0 != null) {
                    wifiManager$WifiLock0.release();
                    this.h = null;
                    dcvz.a.b().p("Released Wifi lock", new Object[0]);
                }
                this.e = true;
                dcvz.a.b().h("Closed NearbyConnection for %s", s);
            }
            dfvp0.notifyAll();
        }
    }

    public final void b(dful dful0) {
        synchronized(this.b) {
            this.f = dful0;
            if(this.e && dful0 != null) {
                dful0.a();
            }
        }
    }

    public final void c(byte[] arr_b) {
        dfvp dfvp0 = this.b;
        __monitor_enter(dfvp0);
        int v = FIN.finallyOpen$NT();
        if(!this.e) {
            cuwu cuwu0 = cuwu.b(arr_b);
            dfuk dfuk0 = new dfuk();
            dfvp0.A(this.c, cuwu0, dfuk0);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IOException("Connection closed");
    }

    public final boolean d() {
        synchronized(this.b) {
        }
        return this.e;
    }
}

