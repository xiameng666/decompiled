import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.AddItemsConfig;
import com.google.android.gms.pay.NavigationConfig;
import com.google.android.gms.pay.OnboardingConfig;
import com.google.android.gms.pay.WalletFrameworkConfig;
import com.google.android.gms.pay.WalletListConfig;

public final class dllh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        NavigationConfig navigationConfig0 = null;
        WalletListConfig walletListConfig0 = null;
        OnboardingConfig onboardingConfig0 = null;
        AddItemsConfig addItemsConfig0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    navigationConfig0 = (NavigationConfig)baua.m(parcel0, v1, NavigationConfig.CREATOR);
                    break;
                }
                case 2: {
                    walletListConfig0 = (WalletListConfig)baua.m(parcel0, v1, WalletListConfig.CREATOR);
                    break;
                }
                case 3: {
                    onboardingConfig0 = (OnboardingConfig)baua.m(parcel0, v1, OnboardingConfig.CREATOR);
                    break;
                }
                case 4: {
                    addItemsConfig0 = (AddItemsConfig)baua.m(parcel0, v1, AddItemsConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WalletFrameworkConfig(navigationConfig0, walletListConfig0, onboardingConfig0, addItemsConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WalletFrameworkConfig[v];
    }
}

