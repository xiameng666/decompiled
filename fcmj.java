import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import j..util.Collection.-EL;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class fcmj implements fcfd {
    public static final baun a;
    public final Set b;
    public final fced c;
    public final fcls d;
    public final fciy e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final fcmi i;

    static {
        fcmj.a = new fcgf(new String[]{"WearBackupService"});
    }

    public fcmj(fced fced0, fcls fcls0, fcmi fcmi0) {
        this.b = ggog.l();
        this.c = fced0;
        this.d = fcls0;
        this.e = new fcji(fcls0);
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new ConcurrentHashMap();
        this.i = fcmi0;
    }

    public static final String a(String s, String s1) {
        return a.r(s1, s, "|");
    }

    @Override  // fcfd
    public final evql k(String s, String s1, byte[] arr_b) {
        if(!gfta.c(s) && s1.equals("/restore/restore_finished")) {
            fcmj.a.d("Received restore_finished from node: " + s, new Object[0]);
            this.f.remove(s);
            this.g.remove(s);
            if(hzyp.g()) {
                RestoreCompletedEventParcelable restoreCompletedEventParcelable0 = new RestoreCompletedEventParcelable(s);
                Collection.-EL.stream(this.b).forEach(new fcmh(restoreCompletedEventParcelable0));
            }
            ((fcly)this.d).b.g(this);
            return evrg.d(new byte[0]);
        }
        fcmj.a.m("WearBackupService received a non restore finished request", new Object[0]);
        return null;
    }
}

