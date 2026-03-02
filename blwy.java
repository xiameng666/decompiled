import com.google.android.gms.fido.client.dataoperation.converters.DisplayableCtap2Credential;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.UnsignedExtensionOutputs;

public final class blwy extends blwu {
    private static final bboh a;
    private final byte[] b;
    private final blxa c;

    static {
        blwy.a = bnaa.e("Ctap2SignResponseConverter");
    }

    public blwy(byte[] arr_b, blxa blxa0) {
        this.b = arr_b;
        this.c = blxa0;
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        blxj blxj0;
        blzx blzx0 = ((blzu)object0).a;
        bboh bboh0 = blwy.a;
        ((ggtj)bboh0.h()).B("Sign Ctap2 Response: %s", ((blzu)object0));
        if(blzx0 != blzx.a) {
            ((ggtj)bboh0.j()).B("AuthenticatorGetAssertion failed: %s", ((blzu)object0).a);
            int v = (int)(((Integer)new blxh().kt(blzx0)));
            if(blzx0 == blzx.M) {
                throw new gmdd(bxma.f(v, "Failed authentication with current pin token."));
            }
            bmih bmih0 = new bmih();
            bmih0.c = bmhw.a(v);
            return bmih0.a();
        }
        blzv blzv0 = ((blzu)object0).b;
        if(!(blzv0 instanceof bmal)) {
            throw new IllegalArgumentException("Ctap2Response does not contain correct ResponseData.");
        }
        ((ggtj)bboh0.h()).B("AuthenticatorAssertionResponseData: %s", ((bmal)blzv0));
        byte[] arr_b = ((bmal)blzv0).i.e();
        bmgw bmgw0 = new bmgw();
        bmgw0.d(arr_b);
        bmgw0.e(((bmal)blzv0).k);
        byte[] arr_b1 = ((bmal)blzv0).j;
        bmgw0.b(arr_b1);
        bmgw0.c(this.b);
        bmbq bmbq0 = ((bmal)blzv0).l;
        if(bmbq0 != null) {
            bmgw0.f(bmbq0.d);
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse0 = bmgw0.a();
        bmih bmih1 = new bmih();
        bmih1.c = authenticatorAssertionResponse0;
        bmih1.b(arr_b);
        bmih1.a = bbmu.c(arr_b);
        blxa blxa0 = this.c;
        if(blxa0 == null) {
            blxj0 = null;
        }
        else {
            blxj0 = blxa0.b;
            if(blxj0 != null) {
                try {
                    gfsx gfsx0 = blxj0.b(arr_b1);
                    if(gfsx0.i()) {
                        ((ggtj)bboh0.h()).x("hmac-secret: Generated outputs.");
                        bmih1.d = new AuthenticationExtensionsClientOutputs(null, null, null, ((AuthenticationExtensionsPrfOutputs)gfsx0.d()), null);
                    }
                }
                catch(bxma bxma0) {
                    throw new gmdd(bxma0);
                }
            }
        }
        if(hsvg.g()) {
            UnsignedExtensionOutputs unsignedExtensionOutputs0 = ((bmal)blzv0).n;
            if(unsignedExtensionOutputs0 != null && blxj0 == null) {
                AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs0 = unsignedExtensionOutputs0.a;
                if(authenticationExtensionsPrfOutputs0 != null) {
                    bmih1.d = new AuthenticationExtensionsClientOutputs(null, null, null, authenticationExtensionsPrfOutputs0, null);
                }
            }
        }
        return new DisplayableCtap2Credential(bmih1.a(), gfsx.l(((bmal)blzv0).l));
    }
}

