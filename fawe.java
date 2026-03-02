import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

public final class fawe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        LoyaltyWalletObject loyaltyWalletObject0 = null;
        OfferWalletObject offerWalletObject0 = null;
        GiftCardWalletObject giftCardWalletObject0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    loyaltyWalletObject0 = (LoyaltyWalletObject)baua.m(parcel0, v2, LoyaltyWalletObject.CREATOR);
                    break;
                }
                case 3: {
                    offerWalletObject0 = (OfferWalletObject)baua.m(parcel0, v2, OfferWalletObject.CREATOR);
                    break;
                }
                case 4: {
                    giftCardWalletObject0 = (GiftCardWalletObject)baua.m(parcel0, v2, GiftCardWalletObject.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateWalletObjectsRequest(loyaltyWalletObject0, offerWalletObject0, giftCardWalletObject0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateWalletObjectsRequest[v];
    }
}

