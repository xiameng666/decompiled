import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

public final class atnq implements atnm {
    private final atfv a;

    public atnq(SecretKey secretKey0) {
        this.a = new atfv(secretKey0);
    }

    @Override  // atnm
    public final atjz a(atjz atjz0) {
        return this.b(((atjv)atjz0));
    }

    public final atjv b(atjv atjv0) {
        try {
            return new atjv(atfx.a(this.a, atjv0.a));
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new atnt(generalSecurityException0);
        }
    }
}

