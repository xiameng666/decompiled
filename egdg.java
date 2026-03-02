import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;

public final class egdg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CallingCardRequestStatus callingCardRequestStatus0 = null;
        Uri uri0 = null;
        String s = null;
        CallingCardMetadata callingCardMetadata0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    callingCardRequestStatus0 = (CallingCardRequestStatus)baua.m(parcel0, v2, CallingCardRequestStatus.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    callingCardMetadata0 = (CallingCardMetadata)baua.m(parcel0, v2, CallingCardMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetCallingCardResponse(callingCardRequestStatus0, v1, uri0, s, callingCardMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCallingCardResponse[v];
    }
}

