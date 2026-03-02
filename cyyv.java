import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.EndpointIdRotationResultParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import j..util.Objects;

final class cyyv extends czar {
    final OnEndpointIdRotationParams a;

    public cyyv(cyyy cyyy0, OnEndpointIdRotationParams onEndpointIdRotationParams0) {
        this.a = onEndpointIdRotationParams0;
        Objects.requireNonNull(cyyy0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cuus cuus0 = (cuus)object0;
        try {
            czfp czfp0 = this.a.a;
            EndpointIdRotationResultParams endpointIdRotationResultParams0 = new EndpointIdRotationResultParams();
            String s = this.a.b;
            batl.s(s);
            endpointIdRotationResultParams0.a = cuus0.e(s);
            czfp0.a(endpointIdRotationResultParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Failed to call onEndpointIdRotation.", remoteException0);
        }
    }
}

