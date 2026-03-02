import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.geofencer.manager.GeofenceInfo;
import com.google.android.gms.location.geofencer.manager.GeofenceRequest;

public final class cnft implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        Object object0 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            int v3 = (char)v2;
            switch(v3) {
                case 1: {
                    object0 = (GeofenceRequest)baua.m(parcel0, v2, GeofenceRequest.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    if(v3 == 3) {
                        z = baua.D(parcel0, v2);
                        break;
                    }
                    else {
                        baua.C(parcel0, v2);
                        continue;
                    }
                    object0 = (GeofenceRequest)baua.m(parcel0, v2, GeofenceRequest.CREATOR);
                    break;
                }
            }
        }
        baua.A(parcel0, v);
        ibuq.f(object0, "request");
        switch(v1) {
            case 0: {
                return new GeofenceInfo(((GeofenceRequest)object0), cned.a, z);
            }
            case 1: {
                return new GeofenceInfo(((GeofenceRequest)object0), cned.b, z);
            }
            case 2: {
                return new GeofenceInfo(((GeofenceRequest)object0), cned.c, z);
            }
            default: {
                if(v1 == 4) {
                    return new GeofenceInfo(((GeofenceRequest)object0), cned.d, z);
                }
                throw new AssertionError();
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GeofenceInfo[v];
    }
}

