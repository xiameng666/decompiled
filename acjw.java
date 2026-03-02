import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.WriteSearchResultsToFileAidlRequest;

public final class acjw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
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
                    parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v2, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    searchSpec0 = (SearchSpec)baua.m(parcel0, v2, SearchSpec.CREATOR);
                    break;
                }
                case 6: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v2, UserHandle.CREATOR);
                    break;
                }
                case 7: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new WriteSearchResultsToFileAidlRequest(appSearchAttributionSource0, s, parcelFileDescriptor0, s1, searchSpec0, userHandle0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WriteSearchResultsToFileAidlRequest[v];
    }
}

