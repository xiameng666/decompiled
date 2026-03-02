import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

public final class bmik implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ByteString hfsf0 = null;
        byte[] arr_b = null;
        String s = null;
        String s1 = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse0 = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse0 = null;
        AuthenticatorErrorResponse authenticatorErrorResponse0 = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs0 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    authenticatorAttestationResponse0 = (AuthenticatorAttestationResponse)baua.m(parcel0, v1, AuthenticatorAttestationResponse.CREATOR);
                    break;
                }
                case 5: {
                    authenticatorAssertionResponse0 = (AuthenticatorAssertionResponse)baua.m(parcel0, v1, AuthenticatorAssertionResponse.CREATOR);
                    break;
                }
                case 6: {
                    authenticatorErrorResponse0 = (AuthenticatorErrorResponse)baua.m(parcel0, v1, AuthenticatorErrorResponse.CREATOR);
                    break;
                }
                case 7: {
                    authenticationExtensionsClientOutputs0 = (AuthenticationExtensionsClientOutputs)baua.m(parcel0, v1, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        if(arr_b != null) {
            hfsf0 = ByteString.copyFrom(arr_b);
        }
        return new PublicKeyCredential(s, s1, hfsf0, authenticatorAttestationResponse0, authenticatorAssertionResponse0, authenticatorErrorResponse0, authenticationExtensionsClientOutputs0, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredential[v];
    }
}

