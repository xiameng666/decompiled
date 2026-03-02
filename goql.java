import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;

public final class goql implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        Thing thing0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    thing0 = (Thing)baua.m(parcel0, v1, Thing.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetIndexableResponse(status0, thing0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetIndexableResponse[v];
    }
}

