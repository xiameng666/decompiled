import java.nio.charset.StandardCharsets;
import java.text.Normalizer.Form;
import java.text.Normalizer;

public final class bmmw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return Normalizer.normalize(((String)object0), Normalizer.Form.NFC).getBytes(StandardCharsets.UTF_8);
    }
}

