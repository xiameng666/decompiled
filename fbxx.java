import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;

public final class fbxx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        double f = 0.0;
        double f1 = 0.0;
        Account account0 = null;
        Bundle bundle0 = null;
        WalletCustomTheme walletCustomTheme0 = null;
        int v4 = 1;
        int v5 = 1;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 2: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 3: {
                    account0 = (Account)baua.m(parcel0, v6, Account.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v6);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 6: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 7: {
                    walletCustomTheme0 = (WalletCustomTheme)baua.m(parcel0, v6, WalletCustomTheme.CREATOR);
                    break;
                }
                case 8: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 9: {
                    f = baua.b(parcel0, v6);
                    break;
                }
                case 10: {
                    f1 = baua.b(parcel0, v6);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 12: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new ApplicationParameters(v4, account0, bundle0, z, v5, walletCustomTheme0, v1, f, f1, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ApplicationParameters[v];
    }
}

