import java.security.KeyStore;
import java.security.KeyStoreException;

public final class dlmx {
    private final bboh a;

    public dlmx() {
        this.a = bboh.b("Pay", bbcu.cZ);
    }

    public final KeyStore a() {
        try {
            KeyStore keyStore0 = KeyStore.getInstance("AndroidKeyStore");
            ibuq.e(keyStore0, "getInstance(...)");
            keyStore0.load(null, null);
            return keyStore0;
        }
        catch(KeyStoreException keyStoreException0) {
            a.ae(this.a.j(), "Unable to load android keystore", keyStoreException0);
            return null;
        }
    }
}

