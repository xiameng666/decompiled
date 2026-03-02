import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

public final class azuy implements aztv {
    public final int a;
    public final aztw b;
    public final aztv c;
    final azuz d;

    public azuy(azuz azuz0, int v, aztw aztw0, aztv aztv0) {
        Objects.requireNonNull(azuz0);
        this.d = azuz0;
        super();
        this.a = v;
        this.b = aztw0;
        this.c = aztv0;
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.d.f(connectionResult0, this.a);
    }
}

