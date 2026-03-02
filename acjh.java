import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.GetSchemaAidlRequest;

public final class acjh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        long v1 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        String s1 = null;
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
                    userHandle0 = (UserHandle)baua.m(parcel0, v2, UserHandle.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetSchemaAidlRequest(appSearchAttributionSource0, s, s1, userHandle0, v1, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetSchemaAidlRequest[v];
    }
}

