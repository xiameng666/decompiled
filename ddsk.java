import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;

public final class ddsk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ShareTarget shareTarget0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                shareTarget0 = (ShareTarget)baua.m(parcel0, v1, ShareTarget.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new OnShareTargetDiscoveredParams(shareTarget0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnShareTargetDiscoveredParams[v];
    }
}

