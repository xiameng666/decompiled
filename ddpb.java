import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;

public abstract class ddpb extends wby implements ddpc {
    public ddpb() {
        super("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                OnShareTargetDiscoveredParams onShareTargetDiscoveredParams0 = (OnShareTargetDiscoveredParams)wbz.a(parcel0, OnShareTargetDiscoveredParams.CREATOR);
                ddpb.gr(parcel0);
                this.a(onShareTargetDiscoveredParams0);
                return true;
            }
            case 2: {
                OnShareTargetLostParams onShareTargetLostParams0 = (OnShareTargetLostParams)wbz.a(parcel0, OnShareTargetLostParams.CREATOR);
                ddpb.gr(parcel0);
                this.d(onShareTargetLostParams0);
                return true;
            }
            case 3: {
                OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams0 = (OnShareTargetDistanceChangedParams)wbz.a(parcel0, OnShareTargetDistanceChangedParams.CREATOR);
                ddpb.gr(parcel0);
                this.c(onShareTargetDistanceChangedParams0);
                return true;
            }
            case 4: {
                OnShareTargetUpdatedParams onShareTargetUpdatedParams0 = (OnShareTargetUpdatedParams)wbz.a(parcel0, OnShareTargetUpdatedParams.CREATOR);
                ddpb.gr(parcel0);
                this.e(onShareTargetUpdatedParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

