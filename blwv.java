import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.List;

public final class blwv extends blwu {
    public boolean a;
    private final byte[] b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final blxn f;
    private final blxa g;

    public blwv(byte[] arr_b, boolean z, blxb blxb0, blxa blxa0) {
        boolean z1 = false;
        this.a = false;
        this.b = arr_b;
        this.d = z;
        this.c = blxb0.a.booleanValue();
        this.f = blxb0.c;
        if(blxb0.b != null && blxb0.b.booleanValue()) {
            z1 = true;
        }
        this.e = z1;
        this.g = blxa0;
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        boolean z4;
        boolean z3;
        byte[] arr_b1;
        List list2;
        boolean z2;
        boolean z1;
        AuthenticationExtensions authenticationExtensions2;
        AuthenticationExtensions authenticationExtensions1;
        Object object1;
        gfsx gfsx0;
        UserVerificationMethodExtension userVerificationMethodExtension1;
        boolean z;
        CableAuthenticationExtension cableAuthenticationExtension1;
        byte[] arr_b = this.b;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)object0;
        batl.b(arr_b != null);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0 = publicKeyCredentialCreationOptions0.a;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0 = publicKeyCredentialCreationOptions0.b;
        List list0 = publicKeyCredentialCreationOptions0.d;
        List list1 = publicKeyCredentialCreationOptions0.f;
        Integer integer0 = null;
        if(list1 == null) {
            list1 = null;
        }
        AuthenticationExtensions authenticationExtensions0 = publicKeyCredentialCreationOptions0.k;
        if(authenticationExtensions0 == null) {
            authenticationExtensions2 = null;
        }
        else {
            CableAuthenticationExtension cableAuthenticationExtension0 = authenticationExtensions0.b;
            if(cableAuthenticationExtension0 == null) {
                z = false;
                cableAuthenticationExtension1 = null;
            }
            else {
                cableAuthenticationExtension1 = cableAuthenticationExtension0;
                z = true;
            }
            UserVerificationMethodExtension userVerificationMethodExtension0 = authenticationExtensions0.c;
            if(userVerificationMethodExtension0 == null) {
                userVerificationMethodExtension1 = null;
            }
            else {
                z = true;
                userVerificationMethodExtension1 = userVerificationMethodExtension0;
            }
            blxa blxa0 = this.g;
            PrfExtension prfExtension0 = authenticationExtensions0.j;
            if(prfExtension0 == null) {
                object1 = null;
                authenticationExtensions1 = z ? new AuthenticationExtensions(null, cableAuthenticationExtension1, userVerificationMethodExtension1, null, null, null, null, null, null, null, null, ((HmacSecretExtension)object1), null) : null;
            }
            else {
                blxj blxj0 = blxa0.b;
                if(blxj0 == null) {
                    object1 = null;
                }
                else {
                    if(blxj0.a) {
                        blxj0.b = true;
                        gfsx0 = gfsx.m(bmic.a(null, null, null, 1));
                    }
                    else {
                        gfsx0 = gfqx.a;
                    }
                    if(gfsx0.i()) {
                        object1 = gfsx0.d();
                        z = true;
                    }
                    else {
                        object1 = null;
                    }
                }
                if(blxa0.c) {
                    authenticationExtensions1 = new AuthenticationExtensions(null, cableAuthenticationExtension1, userVerificationMethodExtension1, null, null, null, null, null, null, prfExtension0, null, ((HmacSecretExtension)object1), null);
                }
                else {
                    authenticationExtensions1 = z ? new AuthenticationExtensions(null, cableAuthenticationExtension1, userVerificationMethodExtension1, null, null, null, null, null, null, null, null, ((HmacSecretExtension)object1), null) : null;
                }
            }
            authenticationExtensions2 = authenticationExtensions1 == null ? null : authenticationExtensions1;
        }
        try {
            z1 = this.d;
            ResidentKeyRequirement residentKeyRequirement0 = blwt.c(publicKeyCredentialCreationOptions0);
            if(residentKeyRequirement0 == null) {
                z1 = false;
            }
            else {
                int v = residentKeyRequirement0.ordinal();
                switch(v) {
                    case 0: {
                        z1 = false;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    default: {
                        if(v != 2) {
                            throw bxma.f(8, "Reached invalid state processing resident key requirement.");
                        }
                        if(!z1) {
                            throw bxma.f(34017, "Authenticator does not support resident keys.");
                        }
                        z1 = true;
                    }
                }
            }
        }
        catch(bxma bxma0) {
            throw new gmdd(bxma0);
        }
        this.a = z1;
        blxn blxn0 = this.f;
        if(blxn0 == null) {
            try {
                z2 = blwq.a(publicKeyCredentialCreationOptions0, this.c);
            }
            catch(bxma bxma1) {
                throw new gmdd(bxma1);
            }
            z3 = arr_b != null;
            list2 = list1;
            arr_b1 = null;
            z4 = z2;
        }
        else {
            gfsx gfsx1 = blxn0.b;
            z2 = blxn0.a;
            if(gfsx1.i()) {
                Pair pair0 = (Pair)gfsx1.d();
                integer0 = (Integer)pair0.first;
                batl.b(bmac.i.contains(integer0));
                list2 = list1;
                arr_b1 = ((ByteString)pair0.second).toByteArray();
                z3 = arr_b != null;
                z4 = z2;
                z2 = true;
            }
            else {
                z3 = arr_b != null;
                list2 = list1;
                arr_b1 = null;
                z4 = z2;
            }
        }
        if(!this.a && !this.e && !z2) {
            throw new gmdd(bxma.f(17, "Falling back to U2F to create non-discoverable credential on FIDO_2_0 authenticator."));
        }
        batl.l(z3);
        return new bmah(arr_b, publicKeyCredentialRpEntity0, publicKeyCredentialUserEntity0, list0, list2, authenticationExtensions2, z1, z4, arr_b1, integer0);
    }
}

