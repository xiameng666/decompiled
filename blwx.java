import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.List;

public final class blwx extends blwu {
    private final byte[] a;
    private final boolean b;
    private final blxn c;
    private final blxa d;

    public blwx(byte[] arr_b, blxb blxb0, blxa blxa0) {
        this.a = arr_b;
        this.b = blxb0.a.booleanValue();
        this.c = blxb0.c;
        this.d = blxa0;
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        PrfExtension prfExtension2;
        Object object1;
        PrfExtension prfExtension1;
        GoogleSessionIdExtension googleSessionIdExtension1;
        GoogleMultiAssertionExtension googleMultiAssertionExtension1;
        UserVerificationMethodExtension userVerificationMethodExtension1;
        int v1;
        CableAuthenticationExtension cableAuthenticationExtension1;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)object0;
        bmad bmad0 = new bmad();
        bmad0.d((this.d.a == null ? publicKeyCredentialRequestOptions0.c : this.d.a));
        bmad0.b(this.a);
        blxn blxn0 = this.c;
        if(blxn0 == null) {
            try {
                bmad0.d = blwq.a(publicKeyCredentialRequestOptions0, this.b);
            }
            catch(bxma bxma0) {
                throw new gmdd(bxma0);
            }
        }
        else {
            bmad0.d = blxn0.a;
            gfsx gfsx0 = blxn0.b;
            if(gfsx0.i()) {
                Pair pair0 = (Pair)gfsx0.d();
                bmad0.c(((Integer)pair0.first).intValue());
                bmad0.e = ((ByteString)pair0.second).toByteArray();
            }
        }
        List list0 = publicKeyCredentialRequestOptions0.d;
        if(list0 != null && !list0.isEmpty()) {
            bmad0.a = list0;
        }
        AuthenticationExtensions authenticationExtensions0 = publicKeyCredentialRequestOptions0.h;
        if(authenticationExtensions0 != null) {
            CableAuthenticationExtension cableAuthenticationExtension0 = authenticationExtensions0.b;
            int v = 1;
            AuthenticationExtensions authenticationExtensions1 = null;
            if(cableAuthenticationExtension0 == null) {
                v1 = 0;
                cableAuthenticationExtension1 = null;
            }
            else {
                cableAuthenticationExtension1 = cableAuthenticationExtension0;
                v1 = 1;
            }
            UserVerificationMethodExtension userVerificationMethodExtension0 = authenticationExtensions0.c;
            if(userVerificationMethodExtension0 == null) {
                userVerificationMethodExtension1 = null;
            }
            else {
                v1 = 1;
                userVerificationMethodExtension1 = userVerificationMethodExtension0;
            }
            GoogleMultiAssertionExtension googleMultiAssertionExtension0 = authenticationExtensions0.d;
            if(googleMultiAssertionExtension0 == null) {
                googleMultiAssertionExtension1 = null;
            }
            else {
                v1 = 1;
                googleMultiAssertionExtension1 = googleMultiAssertionExtension0;
            }
            GoogleSessionIdExtension googleSessionIdExtension0 = authenticationExtensions0.e;
            if(googleSessionIdExtension0 == null) {
                googleSessionIdExtension1 = null;
            }
            else {
                v1 = 1;
                googleSessionIdExtension1 = googleSessionIdExtension0;
            }
            PrfExtension prfExtension0 = authenticationExtensions0.j;
            if(prfExtension0 == null) {
                v = v1;
                object1 = null;
                prfExtension2 = null;
            }
            else {
                try {
                    int v2 = v1 | this.d.c;
                    prfExtension1 = 1 == this.d.c ? prfExtension0 : null;
                    blxj blxj0 = this.d.b;
                    if(blxj0 == null) {
                        v = v2;
                        object1 = null;
                    }
                    else {
                        gfsx gfsx1 = blxj0.a(prfExtension0);
                        if(gfsx1.i()) {
                            object1 = gfsx1.d();
                        }
                        else {
                            v = v2;
                            object1 = null;
                        }
                    }
                }
                catch(bxma bxma1) {
                    throw new gmdd(bxma1);
                }
                prfExtension2 = prfExtension1;
            }
            if(v != 0) {
                authenticationExtensions1 = new AuthenticationExtensions(null, cableAuthenticationExtension1, userVerificationMethodExtension1, googleMultiAssertionExtension1, googleSessionIdExtension1, null, null, null, null, prfExtension2, null, ((HmacSecretExtension)object1), null);
            }
            if(authenticationExtensions1 != null) {
                bmad0.b = authenticationExtensions1;
            }
        }
        return bmad0.a();
    }
}

