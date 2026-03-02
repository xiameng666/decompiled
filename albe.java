import android.content.Context;
import android.os.RemoteException;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;

public final class albe {
    public static final baun a;
    public final ConcurrentLinkedDeque b;
    public final Set c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final esaa g;
    public alaz h;
    final clil i;
    public final Context j;
    public final gmcg k;
    public int l;
    public alaj m;
    public alak n;
    public alal o;
    public final albu p;
    public alar q;
    public volatile alfw r;

    static {
        albe.a = new baun("ProximityAuth", new String[]{"ExoBinding"});
    }

    public albe(Context context0, gmcg gmcg0, albu albu0) {
        this.b = new ConcurrentLinkedDeque();
        this.c = ggog.l();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.l = 4;
        this.j = context0;
        this.k = gmcg0;
        this.p = albu0;
        this.i = new albd(this);
        this.g = new esaa(context0, 1, "PhoneHub:Exo", null, (hpzc.l() ? "com.google.android.gms.exo" : "com.google.ambient.streaming"));
    }

    public final void a(gmcg gmcg0) {
        gmcg0.d(new alay(this));
    }

    public final void b() {
        Context context0 = this.j;
        gftb.check(context0);
        albe.a.h("ExoBinding unbound G->B", new Object[0]);
        this.l = 3;
        this.q = null;
        if(this.r != null) {
            context0.unbindService(this.i);
            this.r = null;
        }
    }

    public final boolean c(String s) {
        if(this.r != null) {
            try {
                this.r.e(s);
                return true;
            }
            catch(RemoteException remoteException0) {
                albe.a.g("Could not process stream termination", remoteException0, new Object[0]);
                return false;
            }
        }
        albe.a.h("signalingService is not available to terminate stream", new Object[0]);
        return false;
    }

    @Override
    public final String toString() {
        String s2;
        String s = "";
        alfw alfw0 = this.r == null ? "" : this.r;
        String s1 = String.valueOf(alfw0);
        switch(this.l) {
            case 1: {
                s2 = "CONNECTING";
                break;
            }
            case 2: {
                s2 = "CONNECTED";
                break;
            }
            case 3: {
                s2 = "DISCONNECTING";
                break;
            }
            case 4: {
                s2 = "DISCONNECTED";
                break;
            }
            default: {
                s2 = "null";
            }
        }
        alar alar0 = this.q;
        if(alar0 != null) {
            s = alar0;
        }
        return "signalingService: " + s1 + ", connectionState: " + s2 + ", callback: " + s.toString();
    }
}

