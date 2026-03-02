import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.SeInfo;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;
import com.google.android.gms.tapandpay.firstparty.TransmissionFailureUiInfo;

public final class esne implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PassInfo[] arr_passInfo = null;
        TransmissionFailureUiInfo transmissionFailureUiInfo0 = null;
        String s = null;
        String s1 = null;
        SeInfo seInfo0 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 2: {
                    arr_passInfo = (PassInfo[])baua.J(parcel0, v5, PassInfo.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    transmissionFailureUiInfo0 = (TransmissionFailureUiInfo)baua.m(parcel0, v5, TransmissionFailureUiInfo.CREATOR);
                    break;
                }
                case 6: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 9: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 10: {
                    seInfo0 = (SeInfo)baua.m(parcel0, v5, SeInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransmissionEvent(v1, arr_passInfo, z, v2, transmissionFailureUiInfo0, v4, s, s1, v3, seInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransmissionEvent[v];
    }
}

