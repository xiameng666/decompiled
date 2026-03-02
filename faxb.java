import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;

public final class faxb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        CardInfo cardInfo0 = null;
        UserAddress userAddress0 = null;
        PaymentMethodToken paymentMethodToken0 = null;
        String s1 = null;
        Bundle bundle0 = null;
        String s2 = null;
        Bundle bundle1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    cardInfo0 = (CardInfo)baua.m(parcel0, v1, CardInfo.CREATOR);
                    break;
                }
                case 3: {
                    userAddress0 = (UserAddress)baua.m(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 4: {
                    paymentMethodToken0 = (PaymentMethodToken)baua.m(parcel0, v1, PaymentMethodToken.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    bundle1 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PaymentData(s, cardInfo0, userAddress0, paymentMethodToken0, s1, bundle0, s2, bundle1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaymentData[v];
    }
}

