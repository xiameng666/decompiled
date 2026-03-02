import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

public final class cnlb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        LocationRequest locationRequest0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    locationRequest0 = (LocationRequest)baua.m(parcel0, v2, LocationRequest.CREATOR);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v2, ClientIdentity.CREATOR);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 11: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 12: {
                    z3 = baua.D(parcel0, v2);
                    break;
                }
                case 13: {
                    baua.s(parcel0, v2);
                    break;
                }
                case 14: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationRequestInternal(locationRequest0, list0, z, z1, z2, z3, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationRequestInternal[v];
    }
}

