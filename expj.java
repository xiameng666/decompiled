import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Set;

public final class expj {
    public static final Set a() {
        ArrayList arrayList0 = new ArrayList(ibpo.q(expm.a, 10));
        for(Object object0: expm.a) {
            byte[] arr_b = ((String)object0).getBytes(ibyo.a);
            ibuq.e(arr_b, "getBytes(...)");
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            Certificate certificate0 = expk.c.generateCertificate(byteArrayInputStream0);
            ibuq.d(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList0.add(new TrustAnchor(((X509Certificate)certificate0), null));
        }
        return ibpo.ay(arrayList0);
    }
}

