import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.aidl.PutDocumentsFromFileAidlRequest;
import com.google.android.gms.appsearch.stats.SchemaMigrationStats;

public final class acjr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        AppSearchAttributionSource appSearchAttributionSource0 = null;
        String s = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        UserHandle userHandle0 = null;
        SchemaMigrationStats schemaMigrationStats0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    appSearchAttributionSource0 = (AppSearchAttributionSource)baua.m(parcel0, v3, AppSearchAttributionSource.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v3, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 4: {
                    userHandle0 = (UserHandle)baua.m(parcel0, v3, UserHandle.CREATOR);
                    break;
                }
                case 5: {
                    schemaMigrationStats0 = (SchemaMigrationStats)baua.m(parcel0, v3, SchemaMigrationStats.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PutDocumentsFromFileAidlRequest(appSearchAttributionSource0, s, parcelFileDescriptor0, userHandle0, schemaMigrationStats0, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PutDocumentsFromFileAidlRequest[v];
    }
}

