import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class azvs implements aztu, aztv {
    public final azta_api a;
    public azvt b;
    private final boolean c;

    public azvs(azta_api azta0, boolean z) {
        this.a = azta0;
        this.c = z;
    }

    private final azvt a() {
        batl.t(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.b;
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        this.a().onConnected(bundle0);
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        azvt azvt0 = this.a();
        ((azxa)azvt0).a.lock();
        try {
            ((azxa)azvt0).j.e(connectionResult0, this.a, this.c);
        }
        finally {
            ((azxa)azvt0).a.unlock();
        }
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        this.a().onConnectionSuspended(v);
    }
}

