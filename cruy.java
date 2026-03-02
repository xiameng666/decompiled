import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;

public final class cruy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        CarrierSupportInfo carrierSupportInfo0 = null;
        Integer integer0 = null;
        Long long0 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 8: {
                    carrierSupportInfo0 = (CarrierSupportInfo)baua.m(parcel0, v4, CarrierSupportInfo.CREATOR);
                    break;
                }
                case 9: {
                    integer0 = baua.q(parcel0, v4);
                    break;
                }
                case 10: {
                    long0 = baua.r(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpCarrierPlanIdResponse(s, v2, s1, s2, v3, s3, v1, carrierSupportInfo0, integer0, long0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpCarrierPlanIdResponse[v];
    }
}

