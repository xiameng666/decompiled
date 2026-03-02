import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetStorageStatsCall.PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall.Response;

public final class ekzy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        Status status0 = null;
        GetStorageStatsCall.PackageStats[] arr_getStorageStatsCall$PackageStats = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v4, Status.CREATOR);
                    break;
                }
                case 2: {
                    arr_getStorageStatsCall$PackageStats = (GetStorageStatsCall.PackageStats[])baua.J(parcel0, v4, GetStorageStatsCall.PackageStats.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetStorageStatsCall.Response(status0, arr_getStorageStatsCall$PackageStats, v1, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetStorageStatsCall.Response[v];
    }
}

