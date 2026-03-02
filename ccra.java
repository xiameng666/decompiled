import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.featurestatus.internal.binder.ErrorDetails;
import com.google.android.gms.libs.featurestatus.internal.binder.FeatureOptInState;
import com.google.android.gms.libs.featurestatus.internal.binder.FeatureStatusResult;

public final class ccra implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        FeatureOptInState featureOptInState0 = null;
        ErrorDetails errorDetails0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    featureOptInState0 = (FeatureOptInState)baua.m(parcel0, v1, FeatureOptInState.CREATOR);
                    break;
                }
                case 2: {
                    errorDetails0 = (ErrorDetails)baua.m(parcel0, v1, ErrorDetails.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new FeatureStatusResult(featureOptInState0, errorDetails0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FeatureStatusResult[v];
    }
}

