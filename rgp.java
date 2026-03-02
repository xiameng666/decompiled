import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class rgp extends CertPath {
    private final List a;

    public rgp(List list0) {
        super("X.509");
        if(list0.size() < 3) {
            throw new CertificateException("At least 3 certificates are required");
        }
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            if(rgu.a(((X509Certificate)listIterator0.previous()))) {
                switch(listIterator0.nextIndex()) {
                    case -1: {
                        break;
                    }
                    case 0: {
                        X509Certificate x509Certificate0 = (X509Certificate)ibpo.W(list0);
                        if(!ibuq.m(x509Certificate0.getIssuerX500Principal(), x509Certificate0.getSubjectX500Principal())) {
                            throw new CertificateException("Root certificate not found");
                        }
                        this.a = list0;
                        return;
                    }
                    default: {
                        throw new CertificateException("Attestation extension on unexpected certificate");
                    }
                }
                break;
            }
        }
        throw new CertificateException("Attestation extension not found");
    }

    @Override
    public final List getCertificates() {
        return ibpo.aI(this.a);
    }

    @Override
    public final byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final byte[] getEncoded(String s) {
        ibuq.f(s, "encoding");
        throw new UnsupportedOperationException();
    }

    @Override
    public final Iterator getEncodings() {
        throw new UnsupportedOperationException();
    }
}

