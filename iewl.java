import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;

public interface iewl {
    AlgorithmParameters a(String arg1);

    KeyFactory b(String arg1);

    Signature c(String arg1);

    CertificateFactory d(String arg1);

    Cipher e(String arg1);

    Mac f(String arg1);

    SecretKeyFactory g(String arg1);

    SecureRandom h();
}

