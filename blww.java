import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.UnsignedExtensionOutputs;
import java.util.Arrays;
import java.util.List;

public final class blww extends blwu {
    private static final bboh a;
    private final AttestationConveyancePreference b;
    private final byte[] c;
    private final boolean d;
    private final blxa e;
    private final String[] f;

    static {
        blww.a = bnaa.e("Ctap2RegisterResponseConverter");
    }

    public blww(AttestationConveyancePreference attestationConveyancePreference0, byte[] arr_b, boolean z, List list0, blxa blxa0) {
        this.b = attestationConveyancePreference0;
        this.c = arr_b;
        this.d = z;
        this.e = blxa0;
        this.f = !hsub.h() || list0 == null ? null : ((String[])list0.toArray(new String[0]));
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        Object object3;
        gfsx gfsx0;
        AuthenticatorAttestationResponse authenticatorAttestationResponse0;
        blzx blzx0 = ((blzu)object0).a;
        if(blzx0 != blzx.a) {
            ((ggtj)blww.a.j()).B("AuthenticatorMakeCredential failed: %s", blzx0);
            int v = (int)(((Integer)new blxh().kt(blzx0)));
            if(blzx0 == blzx.M) {
                throw new gmdd(bxma.f(v, "Failed authentication with current pin token."));
            }
            AuthenticatorErrorResponse authenticatorErrorResponse0 = bmhw.a(v);
            bmih bmih0 = new bmih();
            bmih0.c = authenticatorErrorResponse0;
            return bmih0.a();
        }
        blzv blzv0 = ((blzu)object0).b;
        if(!(blzv0 instanceof bmap)) {
            throw new IllegalArgumentException("Ctap2Response does not contain correct ResponseData.");
        }
        bmap bmap0 = (bmap)blzv0;
        bboh bboh0 = blww.a;
        ((ggtj)bboh0.h()).B("AuthenticatorMakeCredentialResponseData: %s", bmap0);
        byte[] arr_b = Arrays.copyOf(bmap0.j, bmap0.j.length);
        if(arr_b.length < 37) {
            bmhb bmhb0 = new bmhb();
            bmhb0.b(ErrorCode.j);
            bmhb0.a = "authData is malformed.";
            AuthenticatorErrorResponse authenticatorErrorResponse1 = bmhb0.a();
            bmih bmih1 = new bmih();
            bmih1.c = authenticatorErrorResponse1;
            return bmih1.a();
        }
        if((arr_b[0x20] & 0x40) == 0) {
            bmhb bmhb1 = new bmhb();
            bmhb1.b(ErrorCode.j);
            bmhb1.a = "authData does not contain credentialId.";
            AuthenticatorErrorResponse authenticatorErrorResponse2 = bmhb1.a();
            bmih bmih2 = new bmih();
            bmih2.c = authenticatorErrorResponse2;
            return bmih2.a();
        }
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 55, glwy.d(((byte)0), ((byte)0), arr_b[53], arr_b[54]) + 55);
        try {
            String s = bmap0.k;
            byte[] arr_b2 = Arrays.copyOf(bmap0.l, bmap0.l.length);
            if(this.b == null || this.b.equals(AttestationConveyancePreference.a)) {
                Arrays.fill(arr_b, 37, 53, 0);
                arr_b2 = hhrs.o(new hhro[0]).s();
                s = AttestationConveyancePreference.a.d;
            }
            bmbm bmbm0 = new bmbm(arr_b, s, arr_b2);
            bmgz bmgz0 = new bmgz();
            bmgz0.d(arr_b1);
            bmgz0.b(bmbm0.a());
            bmgz0.c(this.c);
            if(hsub.h()) {
                String[] arr_s = this.f;
                if(arr_s != null) {
                    bmgz0.e(arr_s);
                }
            }
            authenticatorAttestationResponse0 = bmgz0.a();
        }
        catch(hhrh | hhrm | hhrl exception0) {
            throw new RuntimeException(exception0);
        }
        bmih bmih3 = new bmih();
        bmih3.c = authenticatorAttestationResponse0;
        bmih3.a = bbmu.c(arr_b1);
        bmih3.b(arr_b1);
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs0 = new AuthenticationExtensionsCredPropsOutputs(this.d);
        blxa blxa0 = this.e;
        Object object1 = null;
        if(blxa0 == null) {
            object3 = null;
        }
        else {
            try {
                blxj blxj0 = blxa0.b;
                if(blxj0 != null) {
                    if(blxj0.b) {
                        hhrs hhrs0 = blxj.c(arr_b);
                        if(hhrs0 == null) {
                            throw bxma.f(8, "hmac-secret output not found during registration.");
                        }
                        try {
                            gfsx0 = gfsx.m(new AuthenticationExtensionsPrfOutputs(hhrs0.i().a, null));
                        }
                        catch(hhrr hhrr0) {
                            throw bxma.g(8, hhrr0);
                        }
                    }
                    else {
                        gfsx0 = gfqx.a;
                    }
                    if(gfsx0.i()) {
                        ((ggtj)bboh0.h()).B("hmac-secret: %s", (((AuthenticationExtensionsPrfOutputs)gfsx0.d()).a ? "true" : "false"));
                        object1 = gfsx0.d();
                    }
                }
                Object object2 = object1;
                object1 = blxj0;
                object3 = object2;
            }
            catch(bxma bxma0) {
                throw new gmdd(bxma0);
            }
        }
        if(hsvg.g()) {
            UnsignedExtensionOutputs unsignedExtensionOutputs0 = bmap0.m;
            if(unsignedExtensionOutputs0 != null && object1 == null) {
                object3 = unsignedExtensionOutputs0.a;
            }
        }
        bmih3.d = new AuthenticationExtensionsClientOutputs(null, null, authenticationExtensionsCredPropsOutputs0, ((AuthenticationExtensionsPrfOutputs)object3), null);
        return bmih3.a();
    }
}

