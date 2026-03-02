import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public final class cmnl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, ParcelableGeofence.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GeofencingRequest(list0, v1, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GeofencingRequest[v];
    }
}

