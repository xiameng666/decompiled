import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;

public final class bqup implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataType dataType0 = null;
        Device device0 = null;
        Application application0 = null;
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    dataType0 = (DataType)baua.m(parcel0, v2, DataType.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    device0 = (Device)baua.m(parcel0, v2, Device.CREATOR);
                    break;
                }
                case 5: {
                    application0 = (Application)baua.m(parcel0, v2, Application.CREATOR);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataSource(dataType0, v1, device0, application0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataSource[v];
    }
}

