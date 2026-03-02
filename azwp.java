import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

final class azwp implements aztu, aztv {
    final azwr a;

    public azwp(azwr azwr0) {
        Objects.requireNonNull(azwr0);
        this.a = azwr0;
        super();
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        batl.s(this.a.j);
        epui epui0 = this.a.k;
        batl.s(epui0);
        epui0.t(new azwo(this.a));
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        azwr azwr0 = this.a;
        azwr0.b.lock();
        try {
            if(azwr0.o(connectionResult0)) {
                azwr0.i();
                azwr0.l();
            }
            else {
                azwr0.j(connectionResult0);
            }
        }
        finally {
            this.a.b.unlock();
        }
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
    }
}

