import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class egzc {
    public static final bboh a;
    public final frli b;
    private static egzc c;

    static {
        egzc.a = bboh.b("SimSyncStatus", bbcu.f);
    }

    private egzc(Context context0) {
        frie frie0 = frif.a();
        frie0.e(((MessageLite)egqx.a));
        frce frce0 = new frce(context0);
        frce0.d("people");
        frce0.j();
        frce0.e("sim_sync_status.pb");
        frie0.f(frce0.a());
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public static egzc a(Context context0) {
        synchronized(egzc.class) {
            if(egzc.c == null) {
                egzc.c = new egzc(context0);
            }
        }
        return egzc.c;
    }

    public final void b(long v) {
        try {
            egza egza0 = new egza(v);
            ((glyq)this.b.b(egza0, gmap.a)).u();
        }
        catch(InterruptedException | ExecutionException exception0) {
            a.ae(egzc.a.i(), "Failed to setLastNoOpSimContactsMigrationTime", exception0);
        }
    }
}

