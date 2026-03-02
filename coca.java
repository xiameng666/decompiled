import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.LocationCollectionReason;
import com.google.android.gms.locationsharingreporter.LocationUploadRequest;

public final class coca implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = -1L;
        LocationCollectionReason locationCollectionReason0 = null;
        String s = null;
        String s1 = null;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = 0L;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v3 = baua.i(parcel0, v7);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 3: {
                    v4 = baua.i(parcel0, v7);
                    break;
                }
                case 4: {
                    v5 = baua.i(parcel0, v7);
                    break;
                }
                case 5: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 6: {
                    locationCollectionReason0 = (LocationCollectionReason)baua.m(parcel0, v7, LocationCollectionReason.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 10: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 11: {
                    v1 = baua.i(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationUploadRequest(v3, v2, v4, v5, v6, locationCollectionReason0, z, z1, s, s1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationUploadRequest[v];
    }
}

