import java.util.Map.Entry;
import java.util.Map;

public final class bqqt implements bqss {
    @Override  // bqss
    public final Object a(Object object0, Object object1) {
        String s = (String)object0;
        ggft ggft0 = (ggft)object1;
        try {
            Map map0 = bqqw.b.a(s);
        }
        catch(IllegalArgumentException unused_ex) {
            return ggbz.a;
        }
        ggfq ggfq0 = new ggfq();
        for(Object object2: map0.entrySet()) {
            Iterable iterable0 = bqqw.c.d().l(((CharSequence)((Map.Entry)object2).getValue()));
            ggfq0.k(((String)((Map.Entry)object2).getKey()), iterable0);
        }
        return ggfq0.a();
    }
}

