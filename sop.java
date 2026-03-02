import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.HashMap;

final class sop implements Runnable {
    final soq a;

    public sop(soq soq0) {
        Objects.requireNonNull(soq0);
        this.a = soq0;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0;
        soq soq0;
        try {
            soq0 = this.a;
            bundle0 = null;
            soa soa0 = soq0.c.e;
            if(soa0 == null) {
                Log.e("P2pClient.Impl", "service was null before serviceIsReady check.");
            }
            else {
                Parcel parcel0 = soa0.hM(3, soa0.jo());
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                parcel0.recycle();
                bundle0 = bundle1;
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("P2pClient.Impl", "Service exception in serviceIsReady().", remoteException0);
        }
        sor sor0 = sor.a(bundle0);
        if(bundle0 == null) {
            Log.e("P2pClient.Impl", "serviceIsReady() returned null.");
        }
        else {
            int v = sor0.a;
            if(v == 2) {
                soq0.c.d = true;
                soq0.a = (HashMap)bundle0.getSerializable("experiment_config");
            }
            else if(v == 3) {
                Log.w("P2pClient.Impl", "Play P2P Service caller not allowlisted.");
            }
            else {
                Log.w("P2pClient.Impl", "serviceIsReady() call returned a FAILURE status: " + v);
            }
        }
        soo soo0 = new soo(this, sor0);
        this.a.c.a.post(soo0);
    }
}

