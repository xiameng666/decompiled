import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

final class azxk implements Runnable {
    final ConnectionResult a;
    final azxl b;

    public azxk(azxl azxl0, ConnectionResult connectionResult0) {
        this.a = connectionResult0;
        Objects.requireNonNull(azxl0);
        this.b = azxl0;
        super();
    }

    @Override
    public final void run() {
        azxl azxl0 = this.b;
        azxi azxi0 = (azxi)azxl0.f.k.get(azxl0.b);
        if(azxi0 == null) {
            return;
        }
        if(this.a.d()) {
            azxl0.e = true;
            azsz azsz0 = azxl0.a;
            if(!azsz0.gb()) {
                try {
                    azsz0.z(null, azsz0.w());
                }
                catch(SecurityException securityException0) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException0);
                    this.b.a.y("Failed to get service from broker.");
                    azxi0.onConnectionFailed(new ConnectionResult(10));
                }
                return;
            }
            azxl0.c();
            return;
        }
        azxi0.onConnectionFailed(this.a);
    }
}

