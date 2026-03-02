import java.util.Map;
import java.util.Set;

public final class dtwy implements ibts {
    public final Map a;
    public final hgkq b;
    public final Set c;
    public final Set d;

    public dtwy(Map map0, hgkq hgkq0, Set set0, Set set1) {
        this.a = map0;
        this.b = hgkq0;
        this.c = set0;
        this.d = set1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gtxg)object0), "it");
        String s = fshl.a(((gtxg)object0)).g;
        hgkq hgkq0 = (hgkq)this.a.get(s);
        if(hgkq0 == null) {
            hgkq0 = this.b;
        }
        if(hgkq0 != null && hgkq0.c) {
            this.c.add(((gtxg)object0));
            return ibom.a;
        }
        this.d.add(((gtxg)object0));
        return ibom.a;
    }
}

