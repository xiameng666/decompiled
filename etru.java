import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;

public final class etru implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Bitmap bitmap0 = null;
        String s1 = null;
        WalletCardIntent[] arr_walletCardIntent = null;
        CardIconMessage[] arr_cardIconMessage = null;
        String s2 = null;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v3, Bitmap.CREATOR);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_walletCardIntent = (WalletCardIntent[])baua.J(parcel0, v3, WalletCardIntent.CREATOR);
                    break;
                }
                case 5: {
                    arr_cardIconMessage = (CardIconMessage[])baua.J(parcel0, v3, CardIconMessage.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new QuickAccessWalletCard(s, bitmap0, s1, arr_walletCardIntent, arr_cardIconMessage, v1, v2, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuickAccessWalletCard[v];
    }
}

