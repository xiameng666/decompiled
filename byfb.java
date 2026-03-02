import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;

public final class byfb implements gmbg {
    final byfc a;

    public byfb(byfc byfc0) {
        this.a = byfc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.a.i(new Status(8, throwable0.getMessage()), null, ApiMetadata.b);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        CredentialTransferCapabilities credentialTransferCapabilities0 = (CredentialTransferCapabilities)object0;
        ibuq.f(credentialTransferCapabilities0, "result");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.a.a.i(Status.b, credentialTransferCapabilities0, apiMetadata0);
    }
}

