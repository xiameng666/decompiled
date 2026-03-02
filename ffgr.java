import android.util.Log;
import com.google.android.gms.wearable.internal.BooleanResponse;
import java.util.concurrent.ExecutionException;

public final class ffgr implements fflt {
    public final fflv a;
    public final String b;
    public final fdiy c;
    public final String d;

    public ffgr(fflv fflv0, String s, fdiy fdiy0) {
        this.a = fflv0;
        this.b = s;
        this.c = fdiy0;
        this.d = "isRestoreOngoing";
    }

    @Override  // fflt
    public final void a() {
        boolean z1;
        fdiy fdiy0;
        try {
            fdiy0 = this.c;
            fcmj fcmj0 = this.a.E;
            batl.s(fcmj0);
            boolean z = hzyp.g();
            String s = this.b;
            if(!z) {
                fcmj.a.j("isRestoreOngoing=false as restore flow is disabled on phone, node id %s", new Object[]{s});
                z1 = false;
                fdiy0.f(new BooleanResponse(0, z1));
                return;
            }
            if(hzyp.a.b().m()) {
                fcmj.a.j("isRestoreOngoing, node id %s", new Object[]{s});
                evql evql0 = fcmj0.d.a(s, "/restore/restore_ongoing", null);
                fcmg fcmg0 = new fcmg();
                z1 = ((Boolean)evrg.n(evql0.h(gmap.a, fcmg0))).booleanValue();
                fdiy0.f(new BooleanResponse(0, z1));
                return;
            }
            fcmj.a.j("isRestoreOngoing API is disabled by flag, node id %s", new Object[]{s});
            throw new IllegalStateException("Feature Restore ongoing status disabled");
        }
        catch(ExecutionException | InterruptedException exception0) {
            Log.e("WearableService", this.d + ": exception during processing", exception0);
            fdiy0.f(new BooleanResponse(8, false));
        }
    }
}

