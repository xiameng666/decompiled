import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

public final class fbis implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 1;
        boolean z = false;
        WalletCustomTheme walletCustomTheme0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    walletCustomTheme0 = (WalletCustomTheme)baua.m(parcel0, v2, WalletCustomTheme.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetClientTokenRequest(walletCustomTheme0, z, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetClientTokenRequest[v];
    }
}

