import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.SearchAidlRequest;

public final class acju implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        String s1 = null;
        SearchSpec searchSpec0 = null;
        UserHandle userHandle0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    appSearchAttributionSource0 = (AppSearchAttributionSource)baua.m(parcel0, v2, AppSearchAttributionSource.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    searchSpec0 = (SearchSpec)baua.m(parcel0, v2, SearchSpec.CREATOR);
                    break;
                }
                case 5: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v2, UserHandle.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SearchAidlRequest(appSearchAttributionSource0, s, s1, searchSpec0, userHandle0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SearchAidlRequest[v];
    }
}

