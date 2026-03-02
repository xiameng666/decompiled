import java.nio.charset.StandardCharsets;
import java.text.Normalizer.Form;
import java.text.Normalizer;

public final class bmmt implements gfsi {
    public final long a;

    public bmmt(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = Normalizer.normalize(((String)object0), Normalizer.Form.NFC);
        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
        if(((long)s.length()) >= this.a && ((long)arr_b.length) <= 0x3FL) {
            return arr_b;
        }
        throw new IllegalArgumentException("Invalid pin for initializing authenticator.");
    }
}

