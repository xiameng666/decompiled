import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class svn extends srp {
    public final Key b;

    public svn(srk srk0, Key key0) {
        super(srk0, new svm(key0));
        this.b = key0;
    }

    @Override  // srp
    protected final iebr a(srk srk0) {
        if(srk0 == srk.b) {
            try {
                return new svl(Cipher.getInstance("AES/ECB/NoPadding"));
            }
            catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
                throw new UnsupportedOperationException("Algorithm not supported");
            }
        }
        throw new stt("Encryption algorithm not supported: $encryptionAlgorithm");
    }
}

