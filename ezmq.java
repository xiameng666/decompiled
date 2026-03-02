import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

public final class ezmq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        List list0 = null;
        int[] arr_v = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    list0 = baua.y(parcel0, v1, UdcCacheResponse.UdcSetting.CREATOR);
                    break;
                }
                case 3: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UdcCacheResponse(list0, arr_v, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UdcCacheResponse[v];
    }
}

