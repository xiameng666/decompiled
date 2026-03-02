import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.InstallParams;

public final class ddpu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ShareTarget shareTarget0 = null;
        long v1 = 0L;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    shareTarget0 = (ShareTarget)baua.m(parcel0, v2, ShareTarget.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new InstallParams(shareTarget0, v1, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InstallParams[v];
    }
}

