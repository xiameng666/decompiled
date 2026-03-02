import android.net.ConnectivityManager.NetworkCallback;
import android.net.LinkProperties;
import android.net.Network;
import j..util.Objects;

final class gpqf extends ConnectivityManager.NetworkCallback {
    final gpsv a;
    final gpqg b;

    public gpqf(gpqg gpqg0, gpsv gpsv0) {
        this.a = gpsv0;
        Objects.requireNonNull(gpqg0);
        this.b = gpqg0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLinkPropertiesChanged(Network network0, LinkProperties linkProperties0) {
        synchronized(this.b.d) {
            Object object0 = this.b.d.put(network0, linkProperties0);
        }
        if(object0 == null) {
            gpqn.d(this.a, "network available: " + network0);
            this.b.b();
        }
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        gpqn.d(this.a, "network lost: " + network0);
        synchronized(this.b.d) {
            this.b.d.remove(network0);
        }
        this.b.b();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onUnavailable() {
        gpqn.d(this.a, "network unavailable.");
        this.b.b();
    }
}

