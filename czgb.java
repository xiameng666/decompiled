import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

public abstract class czgb extends wby implements czgc {
    public czgb() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            OnStartAdvertisingResultParams onStartAdvertisingResultParams0 = (OnStartAdvertisingResultParams)wbz.a(parcel0, OnStartAdvertisingResultParams.CREATOR);
            czgb.gr(parcel0);
            this.a(onStartAdvertisingResultParams0);
            return true;
        }
        return false;
    }
}

