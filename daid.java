import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

public final class daid implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        byte[] arr_b = null;
        String s = null;
        String s1 = null;
        NearbyDevice[] arr_nearbyDevice = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_nearbyDevice = (NearbyDevice[])baua.J(parcel0, v3, NearbyDevice.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new Message(v2, arr_b, s, s1, arr_nearbyDevice, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Message[v];
    }
}

