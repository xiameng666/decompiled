import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

public final class akvt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RemoteDevice remoteDevice0 = null;
        Role[] arr_role = null;
        byte[] arr_b = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    remoteDevice0 = (RemoteDevice)baua.m(parcel0, v3, RemoteDevice.CREATOR);
                    break;
                }
                case 2: {
                    arr_role = (Role[])baua.J(parcel0, v3, Role.CREATOR);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 1000: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionInfo(v1, remoteDevice0, arr_role, v2, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionInfo[v];
    }
}

