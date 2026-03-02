import j..util.Map.-EL;
import java.util.HashMap;
import java.util.Map;

public final class aznc implements azme {
    private final long a;
    private final azmd b;

    public aznc(long v, azmd azmd0) {
        this.a = v;
        this.b = azmd0;
    }

    @Override  // azme
    public final Map a(gged_interceptors gged0) {
        Map map0 = new HashMap();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            azjq azjq0 = (azjq)gged0.get(v);
            aznb aznb0 = new aznb();
            Map map1 = (Map)Map.-EL.computeIfAbsent(map0, azjq0.a, aznb0);
            azki azki0 = azjq0.b;
            azii azii0 = (azii)map1.get(azki0);
            if(azii0 != null) {
                map1.put(azki0, this.b.c(azii0, azjq0.c));
            }
            else if(this.a == 0L || ((long)map1.size()) < this.a) {
                map1.put(azki0, azjq0.c);
            }
        }
        return map0;
    }
}

