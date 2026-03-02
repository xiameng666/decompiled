import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class ewby implements HostnameVerifier {
    @Override  // javax.net.ssl.HostnameVerifier
    public final boolean verify(String s, SSLSession sSLSession0) {
        return true;
    }
}

