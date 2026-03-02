import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.AuthenticationStatusParams;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.presence.PresenceDevice;
import j..util.Objects;

final class czdh implements azye {
    final ProviderAuthenticateAsInitiatorParams a;

    public czdh(czfc czfc0, ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0) {
        this.a = providerAuthenticateAsInitiatorParams0;
        Objects.requireNonNull(czfc0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cuwe cuwe0 = (cuwe)object0;
        ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0 = this.a;
        czdg czdg0 = new czdg(this, providerAuthenticateAsInitiatorParams0);
        try {
            czel czel0 = providerAuthenticateAsInitiatorParams0.a;
            AuthenticationStatusParams authenticationStatusParams0 = new AuthenticationStatusParams();
            PresenceDevice presenceDevice0 = providerAuthenticateAsInitiatorParams0.b;
            if(presenceDevice0 == null) {
                presenceDevice0 = providerAuthenticateAsInitiatorParams0.c;
                if(presenceDevice0 == null) {
                    presenceDevice0 = null;
                }
            }
            batl.s(presenceDevice0);
            byte[] arr_b = providerAuthenticateAsInitiatorParams0.d;
            batl.s(arr_b);
            authenticationStatusParams0.a = cuwe0.a(presenceDevice0, arr_b, czdg0);
            czel0.a(authenticationStatusParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnections", "Failed to call authenticateAsInitiator.", remoteException0);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

