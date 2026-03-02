import android.content.BroadcastReceiver;
import android.net.ConnectivityManager.NetworkCallback;
import java.util.Map;

public final class aauh implements aavy {
    public final aaui a;

    public aauh(aaui aaui0) {
        this.a = aaui0;
    }

    @Override  // aavy
    public final void a() {
        aaui aaui0 = this.a;
        Map map0 = aaui0.c;
        for(Object object0: map0.values()) {
            aaui0.e.unregisterNetworkCallback(((ConnectivityManager.NetworkCallback)object0));
        }
        Map map1 = aaui0.d;
        for(Object object1: map1.values()) {
            aaui0.a.unregisterReceiver(((BroadcastReceiver)object1));
        }
        map0.clear();
        map1.clear();
    }
}

