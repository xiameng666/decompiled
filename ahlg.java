import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ahlg extends cjtm {
    private final azxs a;
    private final ahla b;

    @Deprecated
    public ahlg(ahla ahla0, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        this.b = ahla0;
        this.a = null;
    }

    public ahlg(azxs azxs0, azug azug0) {
        super(0xB0, "AuthEarlyUpdate", azug0);
        this.b = null;
        this.a = azxs0;
    }

    private final void b(Status status0, boolean z) {
        ahla ahla0 = this.b;
        if(ahla0 != null) {
            ahla0.a(status0, z, cckf.d(bbdp.E));
        }
        azxs azxs0 = this.a;
        if(azxs0 != null) {
            azxs0.a(status0);
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(ahle.a(context0).c()) {
            Log.i("AuthEarlyUpdate", String.format("[EUIsSidecarUpdatedOperation]Current version of SidecarAps is higher than prebuilt!"));
            this.b(Status.b, true);
            return;
        }
        Log.i("AuthEarlyUpdate", String.format("[EUIsSidecarUpdatedOperation]Sidecar is not updated!"));
        this.b(Status.b, false);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b(status0, false);
    }
}

