import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.ArrayList;

public final class ahmx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        String s = null;
        Double double0 = null;
        String s1 = null;
        ArrayList arrayList0 = null;
        TokenBinding tokenBinding0 = null;
        AuthenticationExtensions authenticationExtensions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    double0 = baua.o(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    arrayList0 = baua.y(parcel0, v1, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                }
                case 6: {
                    tokenBinding0 = (TokenBinding)baua.m(parcel0, v1, TokenBinding.CREATOR);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    authenticationExtensions0 = (AuthenticationExtensions)baua.m(parcel0, v1, AuthenticationExtensions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(s != null) {
            try {
                return new PublicKeyCredentialRequestOptions(hfsf0, double0, s1, arrayList0, tokenBinding0, UserVerificationRequirement.a(s), authenticationExtensions0);
            }
            catch(bmji bmji0) {
                throw new IllegalArgumentException(bmji0);
            }
        }
        return new PublicKeyCredentialRequestOptions(hfsf0, double0, s1, arrayList0, tokenBinding0, null, authenticationExtensions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredentialRequestOptions[v];
    }
}

