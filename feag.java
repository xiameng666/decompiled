import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.os.Message;
import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class feag extends bblf {
    final feah a;
    private ConnectivityManager.NetworkCallback b;
    private feaf f;

    public feag(feah feah0, bblg bblg0) {
        Objects.requireNonNull(feah0);
        this.a = feah0;
        super(bblg0);
        this.b = null;
        this.f = null;
    }

    private final void a(fduq fduq0) {
        if(fduq0 == null) {
            if(!Log.isLoggable("Wear_WifiService", 3)) {
                return;
            }
            Log.d("Wear_WifiService", "Wifi sync skipped - no data item present.");
            return;
        }
        feah feah0 = this.a;
        batl.s(feah0.b);
        if(feah0.b.getLong("last_sync_dataitem_written", -1L) >= fduq0.h) {
            if(Log.isLoggable("Wear_WifiService", 3)) {
                Log.d("Wear_WifiService", "Wifi sync skipped - data item has not changed since last sync.");
            }
            return;
        }
        synchronized(feah0.n) {
            feah0.o = fduq0;
            if(feah0.p == null) {
                NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(1).build();
                feah0.p = new ConnectivityManager.NetworkCallback();
                feah0.g.requestNetwork(networkRequest0, feah0.p);
            }
            if(feah0.c.isWifiEnabled()) {
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Syncing credentials from handler.");
                }
                feah0.g("SyncHandler");
            }
        }
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                feah feah0 = this.a;
                AtomicBoolean atomicBoolean0 = feah0.m;
                if(!atomicBoolean0.get()) {
                    for(Object object0: feah0.f(false)) {
                        String s = ((WifiConfiguration)object0).getKey();
                        ffcu ffcu0 = feah.b(((WifiConfiguration)object0));
                        feah0.l.put(s, ffcu0);
                    }
                    atomicBoolean0.set(true);
                }
                fdvl fdvl0 = feah0.e;
                fduq fduq0 = fdur.e(fdvl0, "*", "/wifi_sync_proto");
                if(fduq0 != null) {
                    feah0.i.set(true);
                    this.a(fduq0);
                }
                else if(!feah0.i.get()) {
                    this.a(fdur.e(fdvl0, "*", "/sync_wifi_credentials"));
                }
                feah0.h.set(true);
                return;
            }
            case 2: {
                this.a(((fduq)message0.obj));
                return;
            }
            case 3: {
                this.a.g("WifiOnReceiver");
                return;
            }
            case 4: {
                try {
                    if(!this.a.j(false)) {
                        Log.w("Wear_WifiService", "Failed to sync new wifi credential.");
                        return;
                    }
                }
                catch(IOException iOException0) {
                    Log.w("Wear_WifiService", "Error trying to sync new wifi credentials", iOException0);
                }
                return;
            }
            case 5: {
                feaf feaf0 = (feaf)message0.obj;
                if(feaf0 == null) {
                    Log.w("Wear_WifiService", "wifiConnectImmediately given no wifi object.");
                    return;
                }
                this.f = feaf0;
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = this.b;
                if(connectivityManager$NetworkCallback0 != null) {
                    this.a.g.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
                    this.b = null;
                }
                feah feah1 = this.a;
                feah1.c.setWifiEnabled(true);
                NetworkRequest networkRequest0 = new NetworkRequest.Builder().addTransportType(1).build();
                this.b = new feae(feah1.k);
                int v = (int)hfyf.e((feaf0.d.d == null ? hfst.a : feaf0.d.d));
                if(v <= 0) {
                    v = 300000;
                }
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback1 = this.b;
                gftb.check(connectivityManager$NetworkCallback1);
                feah1.g.requestNetwork(networkRequest0, connectivityManager$NetworkCallback1, v);
                feah1.h((feaf0.d.c == null ? ffcu.a : feaf0.d.c), true);
                return;
            }
            case 6: {
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback2 = this.b;
                if(connectivityManager$NetworkCallback2 != null) {
                    this.a.g.unregisterNetworkCallback(connectivityManager$NetworkCallback2);
                    this.b = null;
                }
                this.a.k(this.f, 2);
                this.f = null;
                return;
            }
            case 7: {
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback3 = this.b;
                if(connectivityManager$NetworkCallback3 != null) {
                    this.a.g.unregisterNetworkCallback(connectivityManager$NetworkCallback3);
                    this.b = null;
                }
                this.a.k(this.f, 4);
                this.f = null;
            }
        }
    }
}

