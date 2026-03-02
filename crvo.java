import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse.Filter;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.List;

public final class crvo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        MdpUpsellPlan[] arr_mdpUpsellPlan = null;
        Bundle bundle0 = null;
        Integer integer0 = null;
        Long long0 = null;
        PaymentForm[] arr_paymentForm = null;
        List list0 = null;
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
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_mdpUpsellPlan = (MdpUpsellPlan[])baua.J(parcel0, v1, MdpUpsellPlan.CREATOR);
                    break;
                }
                case 6: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 7: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 8: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 9: {
                    arr_paymentForm = (PaymentForm[])baua.J(parcel0, v1, PaymentForm.CREATOR);
                    break;
                }
                case 10: {
                    list0 = baua.y(parcel0, v1, MdpUpsellOfferResponse.Filter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpUpsellOfferResponse(s, s1, s2, s3, arr_mdpUpsellPlan, bundle0, integer0, long0, arr_paymentForm, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpUpsellOfferResponse[v];
    }
}

