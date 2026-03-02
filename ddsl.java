import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;

public final class ddsl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ShareTarget shareTarget0 = null;
        int v1 = 0;
        RangingData rangingData0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    shareTarget0 = (ShareTarget)baua.m(parcel0, v2, ShareTarget.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    rangingData0 = (RangingData)baua.m(parcel0, v2, RangingData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnShareTargetDistanceChangedParams(shareTarget0, v1, rangingData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnShareTargetDistanceChangedParams[v];
    }
}

