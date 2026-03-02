import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.GetCredentialUserSelection;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;

public final class ahpz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        FidoCredentialDetails fidoCredentialDetails0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    internalSignInCredentialWrapper0 = (InternalSignInCredentialWrapper)baua.m(parcel0, v2, InternalSignInCredentialWrapper.CREATOR);
                    break;
                }
                case 3: {
                    fidoCredentialDetails0 = (FidoCredentialDetails)baua.m(parcel0, v2, FidoCredentialDetails.CREATOR);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetCredentialUserSelection(v1, internalSignInCredentialWrapper0, fidoCredentialDetails0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCredentialUserSelection[v];
    }
}

