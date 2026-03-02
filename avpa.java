import com.google.android.gms.castauth.service.IdentityRegistrationTaskBoundService;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public final class avpa {
    public static final byte[][] a(X509Certificate[] arr_x509Certificate) {
        try {
            byte[][] arr2_b = new byte[arr_x509Certificate.length][];
            for(int v = 0; v < arr_x509Certificate.length; ++v) {
                arr2_b[v] = arr_x509Certificate[v].getEncoded();
            }
            return arr2_b;
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            a.ae(IdentityRegistrationTaskBoundService.a.i(), "Invalid certificate in keystore", certificateEncodingException0);
            return new byte[0][];
        }
    }
}

