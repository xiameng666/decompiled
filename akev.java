import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;

public final class akev implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    PersistentDeviceOwnerState persistentDeviceOwnerState0 = (PersistentDeviceOwnerState)baua.m(parcel0, v2, PersistentDeviceOwnerState.CREATOR);
                    break;
                }
                case 6: {
                    baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new FrpSnapshot(v1, z, z1, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FrpSnapshot[v];
    }
}

