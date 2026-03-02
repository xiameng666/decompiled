import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.GetAuthKeysNeedingCertificationRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqwq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProvisioningId provisioningId0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    provisioningId0 = (ProvisioningId)baua.m(parcel0, v1, ProvisioningId.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAuthKeysNeedingCertificationRequest(account0, provisioningId0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAuthKeysNeedingCertificationRequest[v];
    }
}

