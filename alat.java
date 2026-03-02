import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class alat {
    public static final baun a;
    public final Map b;
    public final albe c;
    public final ConnectivityManager d;
    public final WifiManager e;
    private final alnb f;
    private final bbpj g;
    private final gmcg h;

    static {
        alat.a = new baun("ProximityAuth", new String[]{"ExoGMSConnectionManager"});
    }

    public alat(albe albe0, alnb alnb0, gmcg gmcg0) {
        this.b = new ConcurrentHashMap();
        this.c = albe0;
        this.f = alnb0;
        this.g = bbpj.a(AppContextProvider.a());
        this.h = gmcg0;
        this.e = (WifiManager)AppContextProvider.a().getSystemService("wifi");
        this.d = (ConnectivityManager)AppContextProvider.a().getSystemService("connectivity");
    }

    public final alao a(String s) {
        return (alao)this.b.get(s);
    }

    public final void b(String s) {
        alap alap0 = new alap(this, s);
        this.c.f.put(s, alap0);
        alaq alaq0 = new alaq(this, s);
        this.c.e.put(s, alaq0);
        alce alce0 = new alce();
        alao alao0 = new alao(this.c, s, alce0, this.f, this.g);
        this.c.h = alao0;
        this.b.put(s, alao0);
    }

    public final void c() {
        alar alar0 = new alar(this);
        albe albe0 = this.c;
        albe0.g.e("Exo service start", 1000L);
        baun baun0 = albe.a;
        baun0.h("ExoBinding bound G->B", new Object[0]);
        albe0.l = 1;
        albe0.q = alar0;
        if(albe0.r == null) {
            Intent intent0 = hpzc.l() ? new Intent("com.google.android.gms.exo.action.BIND_SIGNALING").setPackage("com.google.android.gms.exo") : new Intent("com.google.ambient.streaming.action.BIND_SIGNALING").setPackage("com.google.ambient.streaming");
            baun0.h("Bind to Exo signal service result: " + albe0.j.bindService(intent0, albe0.i, 1), new Object[0]);
        }
    }

    public final void d() {
        this.c.b();
    }

    public final void e() {
        for(Object object0: this.b.values()) {
            alao alao0 = (alao)object0;
            if(hpzc.g() && alao0.d.c() || (alao0.f == 1 || alao0.f == 2)) {
                return;
            }
        }
        this.g(true);
        this.d();
    }

    public final boolean f() {
        return this.c.l == 1 || this.c.l == 2;
    }

    public final void g(boolean z) {
        alas alas0 = new alas(z);
        this.h.d(alas0);
    }

    @Override
    public final String toString() {
        String s = "connectedClients: \n";
        for(Object object0: this.b.keySet()) {
            s = s + akwe.a(((String)object0)) + "\n";
        }
        return s + this.c.toString() + "\n";
    }
}

