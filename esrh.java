import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class esrh {
    public int a;
    private Cipher b;

    public esrh() {
        this.b = null;
        this.a = 0;
    }

    final Cipher a() {
        Cipher cipher0 = this.b;
        batl.s(cipher0);
        return cipher0;
    }

    public final void b(RSAPrivateKey rSAPrivateKey0, int v) {
        try {
            Cipher cipher0 = Cipher.getInstance("RSA/ECB/NOPADDING");
            this.b = cipher0;
            cipher0.init(1, rSAPrivateKey0);
            this.a = v;
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException exception0) {
            throw new GeneralSecurityException(((GeneralSecurityException)exception0).toString());
        }
    }
}

