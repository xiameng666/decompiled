import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public final class bnv implements Enumeration {
    final Enumeration a;
    final bnw b;

    public bnv(bnw bnw0) {
        this.b = bnw0;
        super();
        this.a = Collections.enumeration(bnw0.b);
    }

    @Override
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override
    public final Object nextElement() {
        return new HashMap(((Map)this.a.nextElement()));
    }
}

