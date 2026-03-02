import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public final class atgd {
    private final Mac a;

    public atgd(SecretKey secretKey0) {
        try {
            Mac mac0 = Mac.getInstance("HmacSHA256");
            this.a = mac0;
            gftb.check(secretKey0);
            mac0.init(secretKey0);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException("Impossible condition: JCE thinks it does not supportHmacSHA256, but this has existed since Android API level 1.", noSuchAlgorithmException0);
        }
    }

    public final athu a(byte[] arr_b) {
        return new athu(this.a.doFinal(arr_b));
    }
}

