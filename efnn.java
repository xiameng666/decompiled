import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;

public final class efnn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        Account account0 = null;
        SecureElementStoredValue secureElementStoredValue0 = null;
        String s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    secureElementStoredValue0 = (SecureElementStoredValue)baua.m(parcel0, v3, SecureElementStoredValue.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ExecuteSdkOperationRequest(account0, v2, secureElementStoredValue0, s, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExecuteSdkOperationRequest[v];
    }
}

