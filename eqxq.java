import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.quickstart.QuickStartSourceEventData;
import java.util.List;

public final class eqxq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        String s = null;
        List list0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    list0 = baua.y(parcel0, v3, BootstrapAccount.CREATOR);
                    break;
                }
                case 4: {
                    list1 = baua.y(parcel0, v3, FallbackAccount.CREATOR);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new QuickStartSourceEventData(v1, s, list0, list1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuickStartSourceEventData[v];
    }
}

