import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.Trip.Destination;
import com.google.android.gms.semanticlocation.Trip.NameComponents;
import com.google.android.gms.semanticlocation.Trip.Origin;
import com.google.android.gms.semanticlocation.Trip;
import java.util.List;

public final class elws implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        Trip.Origin trip$Origin0 = null;
        List list0 = null;
        Trip.NameComponents trip$NameComponents0 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v2, Trip.Destination.CREATOR);
                    break;
                }
                case 3: {
                    trip$NameComponents0 = (Trip.NameComponents)baua.m(parcel0, v2, Trip.NameComponents.CREATOR);
                    break;
                }
                case 4: {
                    trip$Origin0 = (Trip.Origin)baua.m(parcel0, v2, Trip.Origin.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Trip(trip$Origin0, v1, list0, trip$NameComponents0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Trip[v];
    }
}

