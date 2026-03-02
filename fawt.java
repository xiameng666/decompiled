import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;

public final class fawt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        String s2 = null;
        Address address0 = null;
        Address address1 = null;
        LoyaltyWalletObject[] arr_loyaltyWalletObject = null;
        OfferWalletObject[] arr_offerWalletObject = null;
        UserAddress userAddress0 = null;
        UserAddress userAddress1 = null;
        InstrumentInfo[] arr_instrumentInfo = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    address0 = (Address)baua.m(parcel0, v1, Address.CREATOR);
                    break;
                }
                case 7: {
                    address1 = (Address)baua.m(parcel0, v1, Address.CREATOR);
                    break;
                }
                case 8: {
                    arr_loyaltyWalletObject = (LoyaltyWalletObject[])baua.J(parcel0, v1, LoyaltyWalletObject.CREATOR);
                    break;
                }
                case 9: {
                    arr_offerWalletObject = (OfferWalletObject[])baua.J(parcel0, v1, OfferWalletObject.CREATOR);
                    break;
                }
                case 10: {
                    userAddress0 = (UserAddress)baua.m(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 11: {
                    userAddress1 = (UserAddress)baua.m(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 12: {
                    arr_instrumentInfo = (InstrumentInfo[])baua.J(parcel0, v1, InstrumentInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MaskedWallet(s, s1, arr_s, s2, address0, address1, arr_loyaltyWalletObject, arr_offerWalletObject, userAddress0, userAddress1, arr_instrumentInfo);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MaskedWallet[v];
    }
}

