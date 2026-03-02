import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.CarrierInfo;
import com.google.android.gms.esim.EsimTransferStartSessionRequest;
import java.util.List;

public final class bjot implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        List list0 = null;
        String s2 = null;
        String s3 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v3, CarrierInfo.CREATOR);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new EsimTransferStartSessionRequest(v1, v2, s, s1, z, list0, s2, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EsimTransferStartSessionRequest[v];
    }
}

