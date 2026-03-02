import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

public final class athl {
    public final KeyGenerator a;

    public athl(SecureRandom secureRandom0) {
        try {
            KeyGenerator keyGenerator0 = KeyGenerator.getInstance("AES");
            this.a = keyGenerator0;
            keyGenerator0.init(0x100, secureRandom0);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException("Impossible condition: JCE thinks it does not support AES key generation, but this has existed since Android API version 1.", noSuchAlgorithmException0);
        }
    }
}

