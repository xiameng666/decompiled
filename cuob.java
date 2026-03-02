import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.nearby.common.ble.BleFilter;
import com.google.android.gms.nearby.common.ble.BleSettings;
import java.util.List;

public final class cuob implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        List list0 = null;
        WorkSource workSource0 = null;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v5, BleFilter.CREATOR);
                    break;
                }
                case 7: {
                    workSource0 = (WorkSource)baua.m(parcel0, v5, WorkSource.CREATOR);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new BleSettings(v1, v2, v4, list0, workSource0, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BleSettings[v];
    }
}

