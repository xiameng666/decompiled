import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.AuthenticationStatusParams;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsResponderParams;
import j..util.Objects;

final class czdl implements azye {
    final ProviderAuthenticateAsResponderParams a;

    public czdl(czfc czfc0, ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams0) {
        this.a = providerAuthenticateAsResponderParams0;
        Objects.requireNonNull(czfc0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cuwe cuwe0 = (cuwe)object0;
        czdk czdk0 = new czdk(this, this.a);
        try {
            czel czel0 = this.a.a;
            AuthenticationStatusParams authenticationStatusParams0 = new AuthenticationStatusParams();
            byte[] arr_b = this.a.b;
            batl.s(arr_b);
            authenticationStatusParams0.a = cuwe0.b(arr_b, czdk0);
            czel0.a(authenticationStatusParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnections", "Failed to call authenticateAsResponder.", remoteException0);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

