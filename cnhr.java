import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

public final class cnhr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DeviceOrientationRequest deviceOrientationRequest0 = DeviceOrientationRequestInternal.a;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                deviceOrientationRequest0 = (DeviceOrientationRequest)baua.m(parcel0, v1, DeviceOrientationRequest.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new DeviceOrientationRequestInternal(deviceOrientationRequest0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceOrientationRequestInternal[v];
    }
}

