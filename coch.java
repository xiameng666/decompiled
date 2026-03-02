import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.LocationCollectionReason;
import com.google.android.gms.locationsharingreporter.LocationShare;
import com.google.android.gms.locationsharingreporter.PeriodicLocationUploadRequest;

public final class coch implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        LocationCollectionReason locationCollectionReason0 = null;
        LocationShare locationShare0 = null;
        String s = null;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    locationCollectionReason0 = (LocationCollectionReason)baua.m(parcel0, v3, LocationCollectionReason.CREATOR);
                    break;
                }
                case 2: {
                    locationShare0 = (LocationShare)baua.m(parcel0, v3, LocationShare.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PeriodicLocationUploadRequest(locationCollectionReason0, locationShare0, v1, v2, z, s, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PeriodicLocationUploadRequest[v];
    }
}

