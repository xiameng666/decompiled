import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.util.ArrayMap;
import android.util.Pair;
import java.util.HashSet;
import java.util.function.Predicate;

public final class gpqg {
    public final gpsv a;
    public final ConnectivityManager.NetworkCallback b;
    public final ConnectivityManager c;
    public final ArrayMap d;
    public boolean e;
    private final gpsq f;

    public gpqg(Context context0, gpsq gpsq0, gpsv gpsv0) {
        new gpqe(this);
        this.d = new ArrayMap();
        this.e = false;
        this.f = gpsq0;
        this.a = gpsv0;
        this.c = (ConnectivityManager)context0.getSystemService("connectivity");
        this.b = new gpqf(this, gpsv0);
    }

    public final Pair a(Predicate predicate0) {
        int v;
        ArrayMap arrayMap0 = this.d;
        synchronized(arrayMap0) {
            for(v = 0; true; ++v) {
                if(v >= arrayMap0.size()) {
                    new HashSet(arrayMap0.keySet());
                    return null;
                }
                if(predicate0.test(((LinkProperties)arrayMap0.valueAt(v)))) {
                    break;
                }
            }
        }
        return new Pair(((Network)arrayMap0.keyAt(v)), ((LinkProperties)arrayMap0.valueAt(v)));
    }

    public final void b() {
        this.f.a.d();
    }
}

