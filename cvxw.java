import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import com.google.android.gms.nearby.connection.v3.UwbOptions;

public final class cvxw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        UwbSenderInfo[] arr_uwbSenderInfo = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v3);
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
                case 5: {
                    arr_uwbSenderInfo = (UwbSenderInfo[])baua.J(parcel0, v3, UwbSenderInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new UwbOptions(z, v1, v2, arr_b, arr_uwbSenderInfo);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UwbOptions[v];
    }
}

