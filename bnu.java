import java.util.Enumeration;
import java.util.HashMap;

final class bnu implements Enumeration {
    int a;

    public bnu() {
        this.a = 0;
    }

    @Override
    public final boolean hasMoreElements() {
        return this.a < 4;
    }

    @Override
    public final Object nextElement() {
        ++this.a;
        return new HashMap();
    }
}

