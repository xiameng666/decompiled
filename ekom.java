import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.SafeBrowsingData;

public final class ekom implements Parcelable.Creator {
    public static void a(SafeBrowsingData safeBrowsingData0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, safeBrowsingData0.a, false);
        baub.t(parcel0, 3, safeBrowsingData0.b, v, false);
        baub.t(parcel0, 4, safeBrowsingData0.c, v, false);
        baub.q(parcel0, 5, safeBrowsingData0.d);
        baub.i(parcel0, 6, safeBrowsingData0.e, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        DataHolder dataHolder0 = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        byte[] arr_b = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v2, DataHolder.CREATOR);
                    break;
                }
                case 4: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v2, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeBrowsingData(s, dataHolder0, parcelFileDescriptor0, v1, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeBrowsingData[v];
    }
}

