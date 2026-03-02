import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;

public final class egdd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CallingCardFileData callingCardFileData0 = null;
        int v1 = 0;
        CallingCardMetadata callingCardMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    callingCardFileData0 = (CallingCardFileData)baua.m(parcel0, v2, CallingCardFileData.CREATOR);
                    break;
                }
                case 3: {
                    callingCardMetadata0 = (CallingCardMetadata)baua.m(parcel0, v2, CallingCardMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateCallingCardRequest(v1, callingCardFileData0, callingCardMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateCallingCardRequest[v];
    }
}

