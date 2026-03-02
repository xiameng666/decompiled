import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.DeviceBrandFilter;
import com.google.android.gms.dtdi.core.DeviceFilter;

public final class bhzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Integer integer0 = null;
        DeviceBrandFilter deviceBrandFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 3: {
                    deviceBrandFilter0 = (DeviceBrandFilter)baua.m(parcel0, v1, DeviceBrandFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeviceFilter(s, integer0, deviceBrandFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceFilter[v];
    }
}

