import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public final class bqug implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        List list0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                case 4: {
                    list1 = baua.y(parcel0, v1, DataType.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BleDevice(s, s1, list0, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BleDevice[v];
    }
}

