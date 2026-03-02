import java.io.Serializable;
import java.nio.charset.StandardCharsets;

public final class ggyt implements ggyx, Serializable {
    @Override  // ggyx
    public final Object a(Object object0) {
        return new String(((byte[])object0), StandardCharsets.UTF_8);
    }
}

