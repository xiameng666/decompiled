import android.content.Intent;
import android.net.NetworkInfo.State;
import android.net.NetworkInfo;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.16;

public final class dfyp implements Runnable {
    public final NearbySharingProvider.16 a;
    public final Intent b;

    public dfyp(NearbySharingProvider.16 nearbySharingProvider$160, Intent intent0) {
        this.a = nearbySharingProvider$160;
        this.b = intent0;
    }

    @Override
    public final void run() {
        Intent intent0 = this.b;
        boolean z = bata.b(intent0.getAction(), "android.net.wifi.STATE_CHANGE");
        NearbySharingProvider.16 nearbySharingProvider$160 = this.a;
        if(z) {
            NetworkInfo networkInfo0 = (NetworkInfo)intent0.getParcelableExtra("networkInfo");
            if(networkInfo0 != null && networkInfo0.getState() == NetworkInfo.State.DISCONNECTED) {
                nearbySharingProvider$160.a.Z.set(System.currentTimeMillis());
                dcvz.a.b().p("Wifi is disconnected", new Object[0]);
            }
        }
        else if(bata.b(intent0.getAction(), "android.net.wifi.WIFI_STATE_CHANGED") && intent0.getIntExtra("wifi_state", -1) == 3) {
            cunf cunf0 = dcvz.a;
            cunf0.b().p("Wifi is enabled", new Object[0]);
            dfzz dfzz0 = nearbySharingProvider$160.a;
            dfzi dfzi0 = (dfzi)dfzz0.ab.getAndSet(null);
            if(dfzi0 != null && dfzi0.a != null) {
                cunf0.b().p("Cancel alarm and run bandwidth upgrade.", new Object[0]);
                cumn cumn0 = dfzi0.m;
                if(cumn0 != null) {
                    cumn0.b();
                    dfzi0.m = null;
                }
                dfzz0.l.P(dfzi0.a);
            }
        }
    }
}

