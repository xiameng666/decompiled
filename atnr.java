import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

public final class atnr implements atnn {
    private final atfw a;

    public atnr(SecretKey secretKey0) {
        this.a = new atfw(secretKey0, new SecureRandom());
    }

    @Override  // atnn
    public final atjy a(atjy atjy0) {
        byte[] arr_b;
        if(!atjy0.c()) {
            atjv atjv0 = (atjv)atjy0.b;
            try {
                arr_b = atfy.a(this.a, atjv0.a);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new atnt(generalSecurityException0);
            }
            atjv atjv1 = new atjv(arr_b);
            return new atjy(atjy0.a, atjv1);
        }
        return atjy0;
    }
}

