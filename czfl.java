import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

public abstract class czfl extends wby implements czfm {
    public czfl() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnEndpointFoundParams onEndpointFoundParams0 = (OnEndpointFoundParams)wbz.a(parcel0, OnEndpointFoundParams.CREATOR);
                czfl.gr(parcel0);
                this.c(onEndpointFoundParams0);
                return true;
            }
            case 3: {
                OnEndpointLostParams onEndpointLostParams0 = (OnEndpointLostParams)wbz.a(parcel0, OnEndpointLostParams.CREATOR);
                czfl.gr(parcel0);
                this.d(onEndpointLostParams0);
                return true;
            }
            case 4: {
                OnStoppedDiscoveryParams onStoppedDiscoveryParams0 = (OnStoppedDiscoveryParams)wbz.a(parcel0, OnStoppedDiscoveryParams.CREATOR);
                czfl.gr(parcel0);
                this.e(onStoppedDiscoveryParams0);
                return true;
            }
            case 5: {
                OnEndpointDistanceChangedParams onEndpointDistanceChangedParams0 = (OnEndpointDistanceChangedParams)wbz.a(parcel0, OnEndpointDistanceChangedParams.CREATOR);
                czfl.gr(parcel0);
                this.a(onEndpointDistanceChangedParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

