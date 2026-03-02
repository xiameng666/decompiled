import j..util.DesugarCollections;
import java.util.Map;

public final class adx {
    private final Map a;
    private final Map b;

    public adx(Map map0, Map map1, Map map2) {
        kay.i(map0);
        this.a = map0;
        kay.i(map1);
        this.b = map1;
        kay.i(map2);
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.b);
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final boolean c() {
        return this.b.isEmpty();
    }

    @Override
    public final String toString() {
        return "{\n  successes: " + this.a + "\n  failures: " + this.b + "\n}";
    }
}

