import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;

public final class daop implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Message message0 = null;
        DistanceImpl distanceImpl0 = null;
        BleSignalImpl bleSignalImpl0 = null;
        NearbyDevice nearbyDevice0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    message0 = (Message)baua.m(parcel0, v3, Message.CREATOR);
                    break;
                }
                case 4: {
                    distanceImpl0 = (DistanceImpl)baua.m(parcel0, v3, DistanceImpl.CREATOR);
                    break;
                }
                case 5: {
                    bleSignalImpl0 = (BleSignalImpl)baua.m(parcel0, v3, BleSignalImpl.CREATOR);
                    break;
                }
                case 6: {
                    nearbyDevice0 = (NearbyDevice)baua.m(parcel0, v3, NearbyDevice.CREATOR);
                    break;
                }
                case 7: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new Update(v1, v2, message0, distanceImpl0, bleSignalImpl0, nearbyDevice0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Update[v];
    }
}

