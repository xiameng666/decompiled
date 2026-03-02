import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.WalletFrameworkConfig;
import com.google.android.gms.pay.WalletFrameworkIntentArgs;

public final class dllj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        WalletFrameworkConfig walletFrameworkConfig0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                walletFrameworkConfig0 = (WalletFrameworkConfig)baua.m(parcel0, v1, WalletFrameworkConfig.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new WalletFrameworkIntentArgs(walletFrameworkConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WalletFrameworkIntentArgs[v];
    }
}

