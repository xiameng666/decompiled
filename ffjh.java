import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjh extends ffee {
    final fdiy c;
    final String d;
    final String e;
    final fflv f;

    public ffjh(fflv fflv0, fdiy fdiy0, String s, String s1) {
        this.c = fdiy0;
        this.d = s;
        this.e = s1;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("syncWifiCredential");
    }

    @Override  // ffee
    public final void a() {
        feah feah0 = this.f.p;
        if(feah0 == null) {
            Log.e("WearableService", "syncWifiCredential: wifiService is null!");
            Status status0 = new Status(8);
            this.c.a(status0);
            return;
        }
        gmbu.t(feah0.c(this.d, this.e), new fflu(this.c), gmap.a);
    }
}

