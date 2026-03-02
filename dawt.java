import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.identity.DiscoveryCredential;
import com.google.android.gms.nearby.presence.identity.EncryptedIdentityMetadata;
import com.google.android.gms.nearby.presence.identity.IdentityTokenTag;

public final class dawt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 2L;
        long v2 = 0L;
        long v3 = 0L;
        byte[] arr_b = null;
        PresenceIdentity presenceIdentity0 = null;
        IdentityTokenTag identityTokenTag0 = null;
        EncryptedIdentityMetadata encryptedIdentityMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 2: {
                    presenceIdentity0 = (PresenceIdentity)baua.m(parcel0, v4, PresenceIdentity.CREATOR);
                    break;
                }
                case 3: {
                    identityTokenTag0 = (IdentityTokenTag)baua.m(parcel0, v4, IdentityTokenTag.CREATOR);
                    break;
                }
                case 4: {
                    encryptedIdentityMetadata0 = (EncryptedIdentityMetadata)baua.m(parcel0, v4, EncryptedIdentityMetadata.CREATOR);
                    break;
                }
                case 5: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 7: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryCredential(arr_b, presenceIdentity0, identityTokenTag0, encryptedIdentityMetadata0, v2, v3, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryCredential[v];
    }
}

