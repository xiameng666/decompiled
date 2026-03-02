import j..util.Objects;
import java.util.HashMap;
import java.util.Map;

final class fuvq {
    public final Map a;
    public String b;
    public long c;
    final fuvs d;

    public fuvq(fuvs fuvs0) {
        Objects.requireNonNull(fuvs0);
        this.d = fuvs0;
        super();
        this.a = new HashMap();
        this.b = null;
        this.c = -1L;
    }

    final void a(fuvo fuvo0, long v) {
        String s = this.b;
        if(s != null) {
            fuvp fuvp0 = (fuvp)this.a.get(s);
            fuvp0.a += v - this.c;
            ++fuvp0.b;
        }
        Map map0 = this.a;
        if(!map0.containsKey(fuvo0.a())) {
            map0.put(fuvo0.a(), new fuvp());
        }
        this.b = fuvo0.a();
        this.c = v;
    }
}

