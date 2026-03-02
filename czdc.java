import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.ProviderGetServiceIdParams;
import com.google.android.gms.nearby.internal.connection.StringParams;
import j..util.Objects;

final class czdc implements azye {
    final ProviderGetServiceIdParams a;

    public czdc(czfc czfc0, ProviderGetServiceIdParams providerGetServiceIdParams0) {
        this.a = providerGetServiceIdParams0;
        Objects.requireNonNull(czfc0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cuwe cuwe0 = (cuwe)object0;
        try {
            czgi czgi0 = this.a.a;
            StringParams stringParams0 = new StringParams();
            stringParams0.a = cuwe0.e();
            czgi0.a(stringParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnections", "Failed to get serviceId from the provider.", remoteException0);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

