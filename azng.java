import j..util.Map.-EL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class azng implements azme {
    private final long a;
    private final azmd b;

    public azng(long v, azmd azmd0) {
        this.a = v;
        this.b = azmd0;
    }

    @Override  // azme
    public final Map a(gged_interceptors gged0) {
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            azjq azjq0 = (azjq)gged0.get(v);
            azki azki0 = azjq0.b;
            aznh aznh0 = (aznh)hashMap0.get(azki0);
            if(aznh0 != null) {
                azii azii0 = this.b.c(aznh0.b, azjq0.c);
                hashMap0.put(azki0, new aznh(azjq0.a, azii0));
            }
            else if(this.a == 0L || ((long)hashMap0.size()) < this.a) {
                hashMap0.put(azki0, aznh.a(azjq0));
            }
        }
        Map map0 = new HashMap();
        for(Object object0: hashMap0.entrySet()) {
            ((Map)Map.-EL.computeIfAbsent(map0, ((aznh)((Map.Entry)object0).getValue()).a, new aznf())).put(((azki)((Map.Entry)object0).getKey()), ((aznh)((Map.Entry)object0).getValue()).b);
        }
        return map0;
    }
}

