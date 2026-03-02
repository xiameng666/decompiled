import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

public final class faxd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CardRequirements cardRequirements0 = null;
        ShippingAddressRequirements shippingAddressRequirements0 = null;
        ArrayList arrayList0 = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0 = null;
        TransactionInfo transactionInfo0 = null;
        String s = null;
        byte[] arr_b = null;
        Bundle bundle0 = null;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    z2 = baua.D(parcel0, v1);
                    break;
                }
                case 3: {
                    cardRequirements0 = (CardRequirements)baua.m(parcel0, v1, CardRequirements.CREATOR);
                    break;
                }
                case 4: {
                    z3 = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    shippingAddressRequirements0 = (ShippingAddressRequirements)baua.m(parcel0, v1, ShippingAddressRequirements.CREATOR);
                    break;
                }
                case 6: {
                    arrayList0 = baua.v(parcel0, v1);
                    break;
                }
                case 7: {
                    paymentMethodTokenizationParameters0 = (PaymentMethodTokenizationParameters)baua.m(parcel0, v1, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                }
                case 8: {
                    transactionInfo0 = (TransactionInfo)baua.m(parcel0, v1, TransactionInfo.CREATOR);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 10: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 11: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 12: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PaymentDataRequest(z1, z2, cardRequirements0, z3, shippingAddressRequirements0, arrayList0, paymentMethodTokenizationParameters0, transactionInfo0, z, s, arr_b, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaymentDataRequest[v];
    }
}

