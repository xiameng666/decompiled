import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;

public final class egde implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CallingCardRequestStatus callingCardRequestStatus0 = null;
        CallingCardIdentifier callingCardIdentifier0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    callingCardRequestStatus0 = (CallingCardRequestStatus)baua.m(parcel0, v1, CallingCardRequestStatus.CREATOR);
                    break;
                }
                case 2: {
                    callingCardIdentifier0 = (CallingCardIdentifier)baua.m(parcel0, v1, CallingCardIdentifier.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateCallingCardResponse(callingCardRequestStatus0, callingCardIdentifier0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateCallingCardResponse[v];
    }
}

