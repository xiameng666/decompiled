import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall.Response;

public final class ekzr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        Status status0 = null;
        CorpusConfigParcelable[] arr_corpusConfigParcelable = null;
        AppIndexingErrorInfo[] arr_appIndexingErrorInfo = null;
        AppIndexingUserActionInfo[] arr_appIndexingUserActionInfo = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 2: {
                    arr_corpusConfigParcelable = (CorpusConfigParcelable[])baua.J(parcel0, v2, CorpusConfigParcelable.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_appIndexingErrorInfo = (AppIndexingErrorInfo[])baua.J(parcel0, v2, AppIndexingErrorInfo.CREATOR);
                    break;
                }
                case 5: {
                    arr_appIndexingUserActionInfo = (AppIndexingUserActionInfo[])baua.J(parcel0, v2, AppIndexingUserActionInfo.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAppIndexingPackageDetailsCall.Response(status0, arr_corpusConfigParcelable, v1, arr_appIndexingErrorInfo, arr_appIndexingUserActionInfo, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAppIndexingPackageDetailsCall.Response[v];
    }
}

