import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

public final class azyv extends epua implements aztu, aztv {
    public final Context a;
    public final Handler b;
    public final Set c;
    public final baqv d;
    public epui e;
    public azxl f;
    public final azsy g;
    private static final azsy h;

    static {
        azyv.h = eppr.g;
    }

    public azyv(Context context0, Handler handler0, baqv baqv0) {
        this.a = context0;
        this.b = handler0;
        this.d = baqv0;
        this.c = baqv0.b;
        this.g = azyv.h;
    }

    @Override  // epua
    public final void a(SignInResponse signInResponse0) {
        azyu azyu0 = new azyu(this, signInResponse0);
        this.b.post(azyu0);
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        this.e.t(this);
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.f.b(connectionResult0);
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        azxi azxi0 = (azxi)this.f.f.k.get(this.f.b);
        if(azxi0 != null) {
            if(azxi0.g) {
                azxi0.i(new ConnectionResult(17));
                return;
            }
            azxi0.onConnectionSuspended(v);
        }
    }
}

