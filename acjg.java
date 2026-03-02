import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.GetNextPageAidlRequest;

public final class acjg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        long v2 = 0L;
        long v3 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        UserHandle userHandle0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    appSearchAttributionSource0 = (AppSearchAttributionSource)baua.m(parcel0, v4, AppSearchAttributionSource.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v4, UserHandle.CREATOR);
                    break;
                }
                case 6: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetNextPageAidlRequest(appSearchAttributionSource0, s, v2, v1, userHandle0, v3, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetNextPageAidlRequest[v];
    }
}

