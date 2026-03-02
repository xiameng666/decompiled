import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fbjz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        Account account0 = null;
        byte[] arr_b = null;
        BuyFlowConfig buyFlowConfig0 = null;
        String s = null;
        byte[] arr_b1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    buyFlowConfig0 = (BuyFlowConfig)baua.m(parcel0, v1, BuyFlowConfig.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetupWizardInstrumentManagerParams(account0, arr_b, buyFlowConfig0, s, arr_b1, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetupWizardInstrumentManagerParams[v];
    }
}

