import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.ArrayList;

public final class fawu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Cart cart0 = null;
        CountrySpecification[] arr_countrySpecification = null;
        ArrayList arrayList0 = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0 = null;
        ArrayList arrayList1 = null;
        String s4 = null;
        boolean z = true;
        boolean z1 = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    z2 = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    z3 = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    z4 = baua.D(parcel0, v1);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    cart0 = (Cart)baua.m(parcel0, v1, Cart.CREATOR);
                    break;
                }
                case 10: {
                    z5 = baua.D(parcel0, v1);
                    break;
                }
                case 11: {
                    z6 = baua.D(parcel0, v1);
                    break;
                }
                case 12: {
                    arr_countrySpecification = (CountrySpecification[])baua.J(parcel0, v1, CountrySpecification.CREATOR);
                    break;
                }
                case 13: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 14: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 15: {
                    arrayList0 = baua.y(parcel0, v1, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                }
                case 16: {
                    paymentMethodTokenizationParameters0 = (PaymentMethodTokenizationParameters)baua.m(parcel0, v1, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                }
                case 17: {
                    arrayList1 = baua.v(parcel0, v1);
                    break;
                }
                case 18: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MaskedWalletRequest(s, z2, z3, z4, s1, s2, s3, cart0, z5, z6, arr_countrySpecification, z, z1, arrayList0, paymentMethodTokenizationParameters0, arrayList1, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MaskedWalletRequest[v];
    }
}

