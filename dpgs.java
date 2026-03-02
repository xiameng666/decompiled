import j..util.Objects;
import java.util.Map.Entry;

public final class dpgs implements gftc {
    public final String a;

    public dpgs(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return ((dped)((Map.Entry)Objects.requireNonNull(((Map.Entry)object0))).getValue()).f.equals(this.a);
    }
}

