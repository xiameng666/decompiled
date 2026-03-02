import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class egyz {
    public final frli a;
    public static final int b;
    private static final bboh c;
    private static egyz d;

    static {
        egyz.c = bboh.b("SimContactsSyncStorage", bbcu.f);
    }

    private egyz(Context context0) {
        frie frie0 = frif.a();
        frie0.e(((MessageLite)egqw.a));
        frce frce0 = new frce(context0);
        frce0.d("people");
        frce0.j();
        frce0.e("sim_contacts_sync.pb");
        frie0.f(frce0.a());
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static egyz a(Context context0) {
        synchronized(egyz.class) {
            if(egyz.d == null) {
                egyz.d = new egyz(context0);
            }
        }
        return egyz.d;
    }

    public final Map b() {
        try {
            return (Map)((glyq)glzd.f(this.a.a(), new egyx(), gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(egyz.c.j(), "Failed to get simContactContentHashMap", exception0);
            return new HashMap();
        }
    }

    public final void c(Map map0) {
        try {
            egyw egyw0 = new egyw(map0);
            ((glyq)this.a.b(egyw0, gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(egyz.c.j(), "Failed to set simContactContentHashMap", exception0);
        }
    }
}

