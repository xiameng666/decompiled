import java.util.Map.Entry;
import java.util.Map;

public final class brni implements bqss {
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
            String s1 = (String)((Map.Entry)object2).getKey();
            CharSequence charSequence0 = (CharSequence)((Map.Entry)object2).getValue();
            ggek0.i(s1, ggfp.F(brnj.a.l(charSequence0)));
        }
        return ggek0.b();
    }
}

