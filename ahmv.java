import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

public final class ahmv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        String s = null;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0 = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0 = null;
        ArrayList arrayList0 = null;
        Double double0 = null;
        ArrayList arrayList1 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria0 = null;
        TokenBinding tokenBinding0 = null;
        AuthenticationExtensions authenticationExtensions0 = null;
        ArrayList arrayList2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    publicKeyCredentialRpEntity0 = (PublicKeyCredentialRpEntity)baua.m(parcel0, v1, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                }
                case 3: {
                    publicKeyCredentialUserEntity0 = (PublicKeyCredentialUserEntity)baua.m(parcel0, v1, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 5: {
                    arrayList0 = baua.y(parcel0, v1, PublicKeyCredentialParameters.CREATOR);
                    break;
                }
                case 6: {
                    double0 = baua.o(parcel0, v1);
                    break;
                }
                case 7: {
                    arrayList1 = baua.y(parcel0, v1, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                }
                case 8: {
                    authenticatorSelectionCriteria0 = (AuthenticatorSelectionCriteria)baua.m(parcel0, v1, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                }
                case 9: {
                    tokenBinding0 = (TokenBinding)baua.m(parcel0, v1, TokenBinding.CREATOR);
                    break;
                }
                case 10: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 11: {
                    authenticationExtensions0 = (AuthenticationExtensions)baua.m(parcel0, v1, AuthenticationExtensions.CREATOR);
                    break;
                }
                case 12: {
                    arrayList2 = baua.x(parcel0, v1);
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
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, hfsf0, arrayList0, double0, arrayList1, authenticatorSelectionCriteria0, tokenBinding0, AttestationConveyancePreference.a(s), authenticationExtensions0, arrayList2);
            }
            catch(bmgq bmgq0) {
                throw new IllegalArgumentException(bmgq0);
            }
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, hfsf0, arrayList0, double0, arrayList1, authenticatorSelectionCriteria0, tokenBinding0, null, authenticationExtensions0, arrayList2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredentialCreationOptions[v];
    }
}

