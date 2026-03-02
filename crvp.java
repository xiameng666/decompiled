import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.PaymentGatewayConfig;
import java.util.List;

public final class crvp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        List list0 = null;
        String s7 = null;
        List list1 = null;
        List list2 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v5);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v5);
                    break;
                }
                case 7: {
                    v3 = baua.i(parcel0, v5);
                    break;
                }
                case 8: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 9: {
                    s5 = baua.s(parcel0, v5);
                    break;
                }
                case 10: {
                    s6 = baua.s(parcel0, v5);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 12: {
                    list0 = baua.x(parcel0, v5);
                    break;
                }
                case 13: {
                    s7 = baua.s(parcel0, v5);
                    break;
                }
                case 14: {
                    list1 = baua.v(parcel0, v5);
                    break;
                }
                case 15: {
                    list2 = baua.y(parcel0, v5, PaymentGatewayConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpUpsellPlan(s, s1, s2, v2, s3, s4, v3, v4, s5, s6, v1, list0, s7, list1, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpUpsellPlan[v];
    }
}

