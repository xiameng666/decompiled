import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

public final class fbic implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        WalletCustomTheme walletCustomTheme0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    walletCustomTheme0 = (WalletCustomTheme)baua.m(parcel0, v1, WalletCustomTheme.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ExecuteBuyFlowRequest(arr_b, arr_b1, walletCustomTheme0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExecuteBuyFlowRequest[v];
    }
}

