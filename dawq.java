import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.identity.BroadcastCredential;
import com.google.android.gms.nearby.presence.identity.IdentityToken;

public final class dawq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 2L;
        long v2 = 0L;
        long v3 = 0L;
        byte[] arr_b = null;
        PresenceIdentity presenceIdentity0 = null;
        IdentityToken identityToken0 = null;
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
                    identityToken0 = (IdentityToken)baua.m(parcel0, v4, IdentityToken.CREATOR);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new BroadcastCredential(arr_b, presenceIdentity0, identityToken0, v2, v3, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BroadcastCredential[v];
    }
}

