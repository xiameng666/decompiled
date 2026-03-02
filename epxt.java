import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

public final class epxt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v2 = 0;
        int v3 = 0;
        D2DDevice d2DDevice0 = null;
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    d2DDevice0 = (D2DDevice)baua.m(parcel0, v4, D2DDevice.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 11: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionRequest(d2DDevice0, s, s1, arr_b, s2, v1, z, z1, z2, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionRequest[v];
    }
}

