import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra;

public final class etsi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        WalletCardIntentExtra[] arr_walletCardIntentExtra = null;
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
                    arr_walletCardIntentExtra = (WalletCardIntentExtra[])baua.J(parcel0, v1, WalletCardIntentExtra.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WalletCardIntent(s, s1, arr_walletCardIntentExtra);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WalletCardIntent[v];
    }
}

