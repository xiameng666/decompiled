import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class txl {
    private final Map a;

    public txl(txk txk0) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(txk0.a));
    }

    public final boolean a(Class class0) {
        return this.a.containsKey(class0);
    }
}

