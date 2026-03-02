import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSilentVerificationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.SimpleTransactionAuthorizationExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

public final class bmgs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        FidoAppIdExtension fidoAppIdExtension0 = null;
        CableAuthenticationExtension cableAuthenticationExtension0 = null;
        UserVerificationMethodExtension userVerificationMethodExtension0 = null;
        GoogleMultiAssertionExtension googleMultiAssertionExtension0 = null;
        GoogleSessionIdExtension googleSessionIdExtension0 = null;
        GoogleSilentVerificationExtension googleSilentVerificationExtension0 = null;
        DevicePublicKeyExtension devicePublicKeyExtension0 = null;
        GoogleTunnelServerIdExtension googleTunnelServerIdExtension0 = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension0 = null;
        PrfExtension prfExtension0 = null;
        SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension0 = null;
        HmacSecretExtension hmacSecretExtension0 = null;
        PaymentExtension paymentExtension0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    fidoAppIdExtension0 = (FidoAppIdExtension)baua.m(parcel0, v1, FidoAppIdExtension.CREATOR);
                    break;
                }
                case 3: {
                    cableAuthenticationExtension0 = (CableAuthenticationExtension)baua.m(parcel0, v1, CableAuthenticationExtension.CREATOR);
                    break;
                }
                case 4: {
                    userVerificationMethodExtension0 = (UserVerificationMethodExtension)baua.m(parcel0, v1, UserVerificationMethodExtension.CREATOR);
                    break;
                }
                case 5: {
                    googleMultiAssertionExtension0 = (GoogleMultiAssertionExtension)baua.m(parcel0, v1, GoogleMultiAssertionExtension.CREATOR);
                    break;
                }
                case 6: {
                    googleSessionIdExtension0 = (GoogleSessionIdExtension)baua.m(parcel0, v1, GoogleSessionIdExtension.CREATOR);
                    break;
                }
                case 7: {
                    googleSilentVerificationExtension0 = (GoogleSilentVerificationExtension)baua.m(parcel0, v1, GoogleSilentVerificationExtension.CREATOR);
                    break;
                }
                case 8: {
                    devicePublicKeyExtension0 = (DevicePublicKeyExtension)baua.m(parcel0, v1, DevicePublicKeyExtension.CREATOR);
                    break;
                }
                case 9: {
                    googleTunnelServerIdExtension0 = (GoogleTunnelServerIdExtension)baua.m(parcel0, v1, GoogleTunnelServerIdExtension.CREATOR);
                    break;
                }
                case 10: {
                    googleThirdPartyPaymentExtension0 = (GoogleThirdPartyPaymentExtension)baua.m(parcel0, v1, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                }
                case 11: {
                    prfExtension0 = (PrfExtension)baua.m(parcel0, v1, PrfExtension.CREATOR);
                    break;
                }
                case 12: {
                    simpleTransactionAuthorizationExtension0 = (SimpleTransactionAuthorizationExtension)baua.m(parcel0, v1, SimpleTransactionAuthorizationExtension.CREATOR);
                    break;
                }
                case 13: {
                    hmacSecretExtension0 = (HmacSecretExtension)baua.m(parcel0, v1, HmacSecretExtension.CREATOR);
                    break;
                }
                case 14: {
                    paymentExtension0 = (PaymentExtension)baua.m(parcel0, v1, PaymentExtension.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AuthenticationExtensions(fidoAppIdExtension0, cableAuthenticationExtension0, userVerificationMethodExtension0, googleMultiAssertionExtension0, googleSessionIdExtension0, googleSilentVerificationExtension0, devicePublicKeyExtension0, googleTunnelServerIdExtension0, googleThirdPartyPaymentExtension0, prfExtension0, simpleTransactionAuthorizationExtension0, hmacSecretExtension0, paymentExtension0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthenticationExtensions[v];
    }
}

