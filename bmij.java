import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.List;

public final class bmij implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0 = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0 = null;
        byte[] arr_b = null;
        List list0 = null;
        Double double0 = null;
        List list1 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria0 = null;
        Integer integer0 = null;
        TokenBinding tokenBinding0 = null;
        String s = null;
        AuthenticationExtensions authenticationExtensions0 = null;
        String s1 = null;
        ResultReceiver resultReceiver0 = null;
        List list2 = null;
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
                    list0 = baua.y(parcel0, v1, PublicKeyCredentialParameters.CREATOR);
                    break;
                }
                case 6: {
                    double0 = baua.o(parcel0, v1);
                    break;
                }
                case 7: {
                    list1 = baua.y(parcel0, v1, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                }
                case 8: {
                    authenticatorSelectionCriteria0 = (AuthenticatorSelectionCriteria)baua.m(parcel0, v1, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                }
                case 9: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 10: {
                    tokenBinding0 = (TokenBinding)baua.m(parcel0, v1, TokenBinding.CREATOR);
                    break;
                }
                case 11: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 12: {
                    authenticationExtensions0 = (AuthenticationExtensions)baua.m(parcel0, v1, AuthenticationExtensions.CREATOR);
                    break;
                }
                case 13: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 14: {
                    resultReceiver0 = (ResultReceiver)baua.m(parcel0, v1, ResultReceiver.CREATOR);
                    break;
                }
                case 15: {
                    list2 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, arr_b, list0, double0, list1, authenticatorSelectionCriteria0, integer0, tokenBinding0, s, authenticationExtensions0, s1, resultReceiver0, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredentialCreationOptions[v];
    }
}

