import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.InvalidateNextPageTokenAidlRequest;

public final class acjo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        long v1 = 0L;
        long v2 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        UserHandle userHandle0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    appSearchAttributionSource0 = (AppSearchAttributionSource)baua.m(parcel0, v3, AppSearchAttributionSource.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v3, UserHandle.CREATOR);
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
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new InvalidateNextPageTokenAidlRequest(appSearchAttributionSource0, v1, userHandle0, v2, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InvalidateNextPageTokenAidlRequest[v];
    }
}

