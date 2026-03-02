import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.featurestatus.internal.binder.ContextualCard;
import com.google.android.gms.libs.featurestatus.internal.binder.ContextualCardResult;
import com.google.android.gms.libs.featurestatus.internal.binder.ErrorDetails;

public final class ccqw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ContextualCard contextualCard0 = null;
        ErrorDetails errorDetails0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    contextualCard0 = (ContextualCard)baua.m(parcel0, v1, ContextualCard.CREATOR);
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
        return new ContextualCardResult(contextualCard0, errorDetails0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContextualCardResult[v];
    }
}

