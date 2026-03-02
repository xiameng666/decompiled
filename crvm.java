import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.MdpMoney;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

public final class crvm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Bundle bundle0 = null;
        Integer integer0 = null;
        Long long0 = null;
        PaymentForm[] arr_paymentForm = null;
        String s1 = null;
        Long long1 = null;
        MdpMoney mdpMoney0 = null;
        String s2 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 3: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 4: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_paymentForm = (PaymentForm[])baua.J(parcel0, v1, PaymentForm.CREATOR);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                case 8: {
                    mdpMoney0 = (MdpMoney)baua.m(parcel0, v1, MdpMoney.CREATOR);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 10: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpUpsellOfferRequest(s, bundle0, integer0, long0, arr_paymentForm, s1, long1, mdpMoney0, s2, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpUpsellOfferRequest[v];
    }
}

