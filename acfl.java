import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Map;

public final class acfl {
    private final Map a;
    private final Map b;

    public acfl(Map map0, Map map1, Map map2) {
        this.a = (Map)Objects.requireNonNull(map0);
        this.b = (Map)Objects.requireNonNull(map1);
        Map map3 = (Map)Objects.requireNonNull(map2);
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.b);
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    @Override
    public final String toString() {
        return "{\n  successes: " + this.a + "\n  failures: " + this.b + "\n}";
    }
}

