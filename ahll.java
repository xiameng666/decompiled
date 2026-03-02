import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ahll extends cjtm {
    private final int a;
    private final azxs b;
    private final ahla c;

    @Deprecated
    public ahll(ahla ahla0, int v, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        batl.s(ahla0);
        this.c = ahla0;
        this.a = v;
        this.b = null;
    }

    public ahll(azxs azxs0, int v, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        this.c = null;
        this.a = v;
        batl.s(azxs0);
        this.b = azxs0;
    }

    private final void b(Status status0, boolean z) {
        ahla ahla0 = this.c;
        if(ahla0 != null) {
            ahla0.a(status0, z, cckf.d(bbdp.E));
        }
        azxs azxs0 = this.b;
        if(azxs0 != null) {
            azxs0.a(status0);
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ahkw ahkw0 = new ahkw(context0);
        ahle ahle0 = ahle.a(context0);
        ahkw0.a(context0, ahkw0.b(3, this.a, null, context0));
        if(hppc.c() && !ahle0.c()) {
            Log.i("AuthEarlyUpdate", String.format("[EUUnrequestFeaturesOperation]SidecarAps was never updated. No need to rollback."));
            this.b(Status.b, true);
            return;
        }
        ahle0.b();
        Log.i("AuthEarlyUpdate", String.format("[EUActionHelper]Performing clearGmsCoreData()"));
        ahle0.b.clearApplicationUserData();
        this.b(Status.b, true);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b(status0, false);
    }
}

