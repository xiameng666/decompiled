import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.EndpointIdRotationResultParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import j..util.Objects;

final class cyzd extends czar {
    final OnEndpointIdRotationParams a;

    public cyzd(cyzi cyzi0, OnEndpointIdRotationParams onEndpointIdRotationParams0) {
        this.a = onEndpointIdRotationParams0;
        Objects.requireNonNull(cyzi0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cvxg cvxg0 = (cvxg)object0;
        try {
            czfp czfp0 = this.a.a;
            EndpointIdRotationResultParams endpointIdRotationResultParams0 = new EndpointIdRotationResultParams();
            String s = this.a.b;
            batl.s(s);
            endpointIdRotationResultParams0.a = cvxg0.g(s);
            czfp0.a(endpointIdRotationResultParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Failed to call onEndpointIdRotation.", remoteException0);
        }
    }
}

