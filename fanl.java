import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.usonia.auth.internal.HomeGraphId;
import com.google.android.gms.usonia.auth.internal.OnStructureInfoUpdatedParams;
import com.google.android.gms.usonia.auth.internal.TrustedId;

public final class fanl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TrustedId[] arr_trustedId = null;
        HomeGraphId[] arr_homeGraphId = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_trustedId = (TrustedId[])baua.J(parcel0, v1, TrustedId.CREATOR);
                    break;
                }
                case 2: {
                    arr_homeGraphId = (HomeGraphId[])baua.J(parcel0, v1, HomeGraphId.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnStructureInfoUpdatedParams(arr_trustedId, arr_homeGraphId);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnStructureInfoUpdatedParams[v];
    }
}

