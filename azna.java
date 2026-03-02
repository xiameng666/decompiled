import j..util.Map.-EL;
import java.util.HashMap;
import java.util.Map;

public final class azna implements azme {
    @Override  // azme
    public final Map a(gged_interceptors gged0) {
        Map map0 = new HashMap();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            azjq azjq0 = (azjq)gged0.get(v);
            azmz azmz0 = new azmz();
            ((Map)Map.-EL.computeIfAbsent(map0, azjq0.a, azmz0)).put(azjq0.b, azjq0.c);
        }
        return map0;
    }
}

