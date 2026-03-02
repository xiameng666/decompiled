import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class auip {
    public final Map a;
    public final Map b;
    public String c;

    public auip() {
        this(null);
    }

    public auip(auiq auiq0) {
        Map map0 = DesugarCollections.synchronizedMap(new HashMap());
        this.a = map0;
        Map map1 = DesugarCollections.synchronizedMap(new HashMap());
        this.b = map1;
        if(auiq0 != null) {
            map0.putAll(auiq0.b());
            map1.putAll(auiq0.a());
            this.c = auiq0.a;
        }
    }
}

