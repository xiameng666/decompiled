import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.StorageStats;

public final class abxa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        RegisteredPackageInfo[] arr_registeredPackageInfo = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    arr_registeredPackageInfo = (RegisteredPackageInfo[])baua.J(parcel0, v4, RegisteredPackageInfo.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new StorageStats(arr_registeredPackageInfo, v1, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StorageStats[v];
    }
}

