import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.AuthenticationStatusParams;

public abstract class czek extends wby implements czel {
    public czek() {
        super("com.google.android.gms.nearby.internal.connection.IAuthenticationStatusResultListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            AuthenticationStatusParams authenticationStatusParams0 = (AuthenticationStatusParams)wbz.a(parcel0, AuthenticationStatusParams.CREATOR);
            czek.gr(parcel0);
            this.a(authenticationStatusParams0);
            return true;
        }
        return false;
    }
}

