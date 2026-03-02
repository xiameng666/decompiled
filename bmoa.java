import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public interface bmoa extends IInterface {
    void a(bmnx arg1, BrowserPublicKeyCredentialCreationOptions arg2, ApiMetadata arg3);

    void b(bmnx arg1, PublicKeyCredentialCreationOptions arg2, String arg3, boolean arg4, ApiMetadata arg5);

    void c(bmnx arg1, PublicKeyCredentialRequestOptions arg2, String arg3, boolean arg4, ApiMetadata arg5);

    void d(bmnx arg1, PublicKeyCredentialCreationOptions arg2, String arg3, ApiMetadata arg4);

    void e(bmnx arg1, PublicKeyCredentialRequestOptions arg2, String arg3, ApiMetadata arg4);

    void f(bmnx arg1, HybridRequestData arg2, ApiMetadata arg3);

    void g(bmnx arg1, BrowserPublicKeyCredentialCreationOptions arg2, String arg3, boolean arg4, ApiMetadata arg5);

    void h(bmnx arg1, BrowserPublicKeyCredentialRequestOptions arg2, String arg3, boolean arg4, ApiMetadata arg5);

    void i(BrowserPublicKeyCredentialRequestOptions arg1, bmnx arg2, ApiMetadata arg3);

    void j(String arg1, azxs arg2, StateUpdate arg3, ApiMetadata arg4);

    void k(String arg1, azxs arg2, PublicKeyCredentialRequestOptions arg3, bmgd arg4, ApiMetadata arg5);

    void l(azxs arg1, byte[] arg2, byte[] arg3, bmfv arg4, ApiMetadata arg5);
}

