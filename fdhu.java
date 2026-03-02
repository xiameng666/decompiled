import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetCachedBackupsResponse;
import com.google.android.gms.wearable.internal.ParcelableBackupDevice;

public final class fdhu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ParcelableBackupDevice[] arr_parcelableBackupDevice = null;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_parcelableBackupDevice = (ParcelableBackupDevice[])baua.J(parcel0, v2, ParcelableBackupDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetCachedBackupsResponse(v1, z, arr_parcelableBackupDevice);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCachedBackupsResponse[v];
    }
}

