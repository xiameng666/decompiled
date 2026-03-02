import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

public final class crvj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Bundle bundle0 = null;
        Integer integer0 = null;
        Long long0 = null;
        PaymentForm[] arr_paymentForm = null;
        String s4 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 6: {
                    integer0 = baua.q(parcel0, v2);
                    break;
                }
                case 7: {
                    long0 = baua.r(parcel0, v2);
                    break;
                }
                case 8: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 9: {
                    arr_paymentForm = (PaymentForm[])baua.J(parcel0, v2, PaymentForm.CREATOR);
                    break;
                }
                case 10: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpPurchaseOfferRequest(s, s1, s2, s3, bundle0, integer0, long0, v1, arr_paymentForm, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpPurchaseOfferRequest[v];
    }
}

