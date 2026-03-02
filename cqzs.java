import com.google.android.gms.mdocstore.types.X509CertificateChain;
import j..util.Objects;
import java.security.cert.CertificateException;

final class cqzs extends crac {
    public cqzs(craf craf0, evqp evqp0) {
        Objects.requireNonNull(craf0);
        super(evqp0);
    }

    @Override  // cqxw
    public final void k(X509CertificateChain x509CertificateChain0) {
        gged_interceptors gged0;
        try {
            gged0 = x509CertificateChain0.a();
        }
        catch(CertificateException certificateException0) {
            this.b.a(certificateException0);
            return;
        }
        this.b.b(gged0);
    }
}

