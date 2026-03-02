import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.mdocstore.types.X509CertificateChain;
import j..util.Objects;
import java.security.cert.CertificateException;

final class cqzr extends crac {
    final ProvisioningId a;

    public cqzr(craf craf0, evqp evqp0, ProvisioningId provisioningId0) {
        this.a = provisioningId0;
        Objects.requireNonNull(craf0);
        super(evqp0);
    }

    @Override  // cqxw
    public final void l(cqya cqya0, X509CertificateChain x509CertificateChain0) {
        try {
            evqp evqp0 = this.b;
            gged_interceptors gged0 = x509CertificateChain0.a();
            evqp0.b(new crap(this.a, cqya0, gged0));
        }
        catch(CertificateException certificateException0) {
            this.b.a(certificateException0);
        }
    }
}

