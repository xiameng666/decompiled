import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest.Builder;
import android.util.Log;
import j..util.Objects;
import java.util.Collection;

final class ekuo extends ConnectivityManager.NetworkCallback {
    public final int a;
    boolean b;
    final ekup c;
    private final Collection d;

    public ekuo(ekup ekup0, int v, Collection collection0) {
        Objects.requireNonNull(ekup0);
        this.c = ekup0;
        super();
        this.b = false;
        this.a = v;
        this.d = collection0;
    }

    final void a(ConnectivityManager connectivityManager0) {
        if(connectivityManager0 == null) {
            Log.w("NetworkScheduler", "ConnectivityManager unavailable, not updating network listener");
            return;
        }
        boolean z = this.b;
        if(z == ((this.c.a & this.a) == this.a)) {
            return;
        }
        if(z) {
            connectivityManager0.unregisterNetworkCallback(this);
        }
        else {
            NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder().addCapability(14).addCapability(12);
            ggqk ggqk0 = ((gged_interceptors)this.d).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                networkRequest$Builder0.addCapability(((Integer)object0).intValue());
            }
            connectivityManager0.requestNetwork(networkRequest$Builder0.build(), this);
        }
        this.b ^= 1;
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        ekup ekup0 = this.c;
        synchronized(ekup0) {
            if(hrvh.a.i().I()) {
                ConnectivityManager connectivityManager0 = ekup0.a();
                if(connectivityManager0 == null) {
                    return;
                }
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                if(networkCapabilities0 == null || !networkCapabilities0.hasCapability(16)) {
                    return;
                }
            }
            ekup0.a &= ~this.a;
            this.a(ekup0.a());
            ekrs.b().f.d();
        }
    }
}

