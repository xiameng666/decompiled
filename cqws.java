import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.GetEncryptedMdocRequest;
import com.google.android.gms.mdocstore.NamespaceEntriesRequest;
import com.google.android.gms.mdocstore.RelyingPartyEncryptionConfig;
import com.google.android.gms.mdocstore.types.ProvisioningId;

public final class cqws implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProvisioningId provisioningId0 = null;
        NamespaceEntriesRequest[] arr_namespaceEntriesRequest = null;
        RelyingPartyEncryptionConfig relyingPartyEncryptionConfig0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 2: {
                    provisioningId0 = (ProvisioningId)baua.m(parcel0, v2, ProvisioningId.CREATOR);
                    break;
                }
                case 3: {
                    arr_namespaceEntriesRequest = (NamespaceEntriesRequest[])baua.J(parcel0, v2, NamespaceEntriesRequest.CREATOR);
                    break;
                }
                case 4: {
                    relyingPartyEncryptionConfig0 = (RelyingPartyEncryptionConfig)baua.m(parcel0, v2, RelyingPartyEncryptionConfig.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetEncryptedMdocRequest(account0, provisioningId0, arr_namespaceEntriesRequest, relyingPartyEncryptionConfig0, v1, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetEncryptedMdocRequest[v];
    }
}

