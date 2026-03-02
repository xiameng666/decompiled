import android.net.ConnectivityManager;
import com.google.android.gms.multidevice.service.system.ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1;

public final class ctgc implements ibth {
    public final ConnectivityManager a;
    public final ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1 b;

    public ctgc(ConnectivityManager connectivityManager0, ConnectivityModule.providesConnectivityStatusFlow.1.networkCallback.1 connectivityModule$providesConnectivityStatusFlow$1$networkCallback$10) {
        this.a = connectivityManager0;
        this.b = connectivityModule$providesConnectivityStatusFlow$1$networkCallback$10;
    }

    @Override  // ibth
    public final Object a() {
        this.a.unregisterNetworkCallback(this.b);
        return ibom.a;
    }
}

