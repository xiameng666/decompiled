import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.InternalVisibilityConfig;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.SetSchemaAidlRequest;
import java.util.List;

public final class acjv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        List list0 = null;
        List list1 = null;
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
                    list0 = baua.y(parcel0, v4, AppSearchSchema.CREATOR);
                    break;
                }
                case 4: {
                    list1 = baua.y(parcel0, v4, InternalVisibilityConfig.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v4, UserHandle.CREATOR);
                    break;
                }
                case 8: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 9: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetSchemaAidlRequest(appSearchAttributionSource0, s, list0, list1, z, v1, userHandle0, v3, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetSchemaAidlRequest[v];
    }
}

