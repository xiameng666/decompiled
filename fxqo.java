import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class fxqo {
    private SecretKeySpec a;
    private Cipher b;
    private Cipher c;

    public fxqo(SecretKeySpec secretKeySpec0) {
        this.a = secretKeySpec0;
    }

    public final void a(SecretKeySpec secretKeySpec0) {
        try {
            this.a = secretKeySpec0;
            this.b = fxqo.d(1, secretKeySpec0);
            this.c = fxqo.d(2, this.a);
        }
        catch(GeneralSecurityException unused_ex) {
            this.b = null;
            this.c = null;
        }
    }

    public final byte[] b(byte[] arr_b) {
        try {
            if(this.c == null) {
                this.c = fxqo.d(2, this.a);
            }
            return this.c.doFinal(arr_b);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            this.c = null;
            throw generalSecurityException0;
        }
    }

    public final byte[] c(byte[] arr_b) {
        try {
            if(this.b == null) {
                this.b = fxqo.d(1, this.a);
            }
            return this.b.doFinal(arr_b);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            this.b = null;
            throw generalSecurityException0;
        }
    }

    private static Cipher d(int v, SecretKeySpec secretKeySpec0) {
        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher0.init(v, secretKeySpec0, new IvParameterSpec(new byte[16]));
        return cipher0;
    }
}

