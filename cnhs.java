import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;

public final class cnhs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DeviceOrientationRequestInternal deviceOrientationRequestInternal0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        int v1 = 1;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    deviceOrientationRequestInternal0 = (DeviceOrientationRequestInternal)baua.m(parcel0, v2, DeviceOrientationRequestInternal.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeviceOrientationRequestUpdateData(v1, deviceOrientationRequestInternal0, iBinder0, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceOrientationRequestUpdateData[v];
    }
}

