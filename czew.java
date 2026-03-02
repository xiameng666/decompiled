import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotatedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointIdRotationParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;

public abstract class czew extends wby implements czex {
    public czew() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnConnectionInitiatedParams onConnectionInitiatedParams0 = (OnConnectionInitiatedParams)wbz.a(parcel0, OnConnectionInitiatedParams.CREATOR);
                czew.gr(parcel0);
                this.c(onConnectionInitiatedParams0);
                return true;
            }
            case 3: {
                OnConnectionResultParams onConnectionResultParams0 = (OnConnectionResultParams)wbz.a(parcel0, OnConnectionResultParams.CREATOR);
                czew.gr(parcel0);
                this.d(onConnectionResultParams0);
                return true;
            }
            case 4: {
                OnDisconnectedParams onDisconnectedParams0 = (OnDisconnectedParams)wbz.a(parcel0, OnDisconnectedParams.CREATOR);
                czew.gr(parcel0);
                this.e(onDisconnectedParams0);
                return true;
            }
            case 5: {
                OnBandwidthChangedParams onBandwidthChangedParams0 = (OnBandwidthChangedParams)wbz.a(parcel0, OnBandwidthChangedParams.CREATOR);
                czew.gr(parcel0);
                this.a(onBandwidthChangedParams0);
                return true;
            }
            case 6: {
                OnEndpointIdRotationParams onEndpointIdRotationParams0 = (OnEndpointIdRotationParams)wbz.a(parcel0, OnEndpointIdRotationParams.CREATOR);
                czew.gr(parcel0);
                this.g(onEndpointIdRotationParams0);
                return true;
            }
            case 7: {
                OnInternetConnectionChangedParams onInternetConnectionChangedParams0 = (OnInternetConnectionChangedParams)wbz.a(parcel0, OnInternetConnectionChangedParams.CREATOR);
                czew.gr(parcel0);
                this.h(onInternetConnectionChangedParams0);
                return true;
            }
            case 8: {
                OnEndpointIdRotatedParams onEndpointIdRotatedParams0 = (OnEndpointIdRotatedParams)wbz.a(parcel0, OnEndpointIdRotatedParams.CREATOR);
                czew.gr(parcel0);
                this.f(onEndpointIdRotatedParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

