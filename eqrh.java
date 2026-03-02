import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import java.util.ArrayList;

public final class eqrh implements bnbv {
    @Override  // bnbv
    public final evql b(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        bmgw bmgw0 = new bmgw();
        bmgw0.d(new byte[]{0});
        bmgw0.f(new byte[]{0});
        bmgw0.b(new byte[]{0});
        bmgw0.c(new byte[]{0});
        bmgw0.e(new byte[]{0});
        AuthenticatorAssertionResponse authenticatorAssertionResponse0 = bmgw0.a();
        bmih bmih0 = new bmih();
        bmih0.c = authenticatorAssertionResponse0;
        bmih0.a = "id";
        PublicKeyCredential publicKeyCredential0 = bmih0.a();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(publicKeyCredential0);
        return evrg.d(new TargetDirectTransferResult(Status.b, arrayList0));
    }

    @Override  // aztx
    public final azux ga() {
        azss azss0 = new azss();
        return new azux(new azta_api("Api", new azsy(this), azss0), null, null);
    }
}

