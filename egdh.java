import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;

public final class egdh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CallingCardIdentifier callingCardIdentifier0 = null;
        CallingCardFileData callingCardFileData0 = null;
        CallingCardMetadata callingCardMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    callingCardIdentifier0 = (CallingCardIdentifier)baua.m(parcel0, v1, CallingCardIdentifier.CREATOR);
                    break;
                }
                case 2: {
                    callingCardFileData0 = (CallingCardFileData)baua.m(parcel0, v1, CallingCardFileData.CREATOR);
                    break;
                }
                case 3: {
                    callingCardMetadata0 = (CallingCardMetadata)baua.m(parcel0, v1, CallingCardMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateCallingCardRequest(callingCardIdentifier0, callingCardFileData0, callingCardMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateCallingCardRequest[v];
    }
}

