import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.BloomFilterData;
import com.google.android.gms.findmydevice.spot.ClockSyncMessageStreamData;
import com.google.android.gms.findmydevice.spot.ReportFastPairDeviceConnectionChangeRequest;

public final class bnjg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        byte[] arr_b = null;
        BloomFilterData bloomFilterData0 = null;
        byte[] arr_b1 = null;
        String s = null;
        ClockSyncMessageStreamData clockSyncMessageStreamData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    clockSyncMessageStreamData0 = (ClockSyncMessageStreamData)baua.m(parcel0, v1, ClockSyncMessageStreamData.CREATOR);
                    break;
                }
                case 6: {
                    bloomFilterData0 = (BloomFilterData)baua.m(parcel0, v1, BloomFilterData.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReportFastPairDeviceConnectionChangeRequest(arr_b, bloomFilterData0, arr_b1, s, clockSyncMessageStreamData0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReportFastPairDeviceConnectionChangeRequest[v];
    }
}

