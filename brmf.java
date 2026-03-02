import java.util.Map.Entry;
import java.util.Map;

public final class brmf implements bqss {
    @Override  // bqss
    public final Object a(Object object0, Object object1) {
        String s = (String)object0;
        ggeo ggeo0 = (ggeo)object1;
        ggek ggek0 = new ggek();
        try {
            Map map0 = brrt.b(s);
        }
        catch(IllegalArgumentException unused_ex) {
            return ggnf.a;
        }
        for(Object object2: map0.entrySet()) {
            ggek0.i(Integer.valueOf(((String)((Map.Entry)object2).getKey())), Long.valueOf(((String)((Map.Entry)object2).getValue())));
        }
        return ggek0.b();
    }
}

