import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.GetMdocDataRequest;
import com.google.android.gms.mdocstore.NamespaceEntriesRequest;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqwu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProvisioningId provisioningId0 = null;
        String[] arr_s = null;
        NamespaceEntriesRequest[] arr_namespaceEntriesRequest = null;
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
                case 3: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_namespaceEntriesRequest = (NamespaceEntriesRequest[])baua.J(parcel0, v1, NamespaceEntriesRequest.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetMdocDataRequest(account0, provisioningId0, arr_s, arr_namespaceEntriesRequest);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetMdocDataRequest[v];
    }
}

