import j..util.Objects;
import java.util.Map;

final class czlr implements djco {
    final czlv a;
    final czly b;

    public czlr(czly czly0, czlv czlv0) {
        this.a = czlv0;
        Objects.requireNonNull(czly0);
        this.b = czly0;
        super();
    }

    @Override  // djco
    public final void a(djct djct0) {
        czkq.a.b().h("Ranging initialzed for %s", djct0.a);
    }

    @Override  // djco
    public final void b(djct djct0, djcm djcm0) {
        cuuq cuuq0 = cuuq.b(djct0.a.a);
        Map map0 = czly.a;
        if(map0.containsKey(cuuq0)) {
            cuuq0 = (cuuq)map0.get(cuuq0);
        }
        boolean z = this.b.c.c();
        ((cvge)this.a).a.d.W(new cvmw(((cvge)this.a).a, cuuq0, czly.a(djcm0.a), czly.a(djcm0.b), czly.a(djcm0.c), z));
    }

    @Override  // djco
    public final void c(djct djct0, int v) {
        czkq.a.b().i("Ranging suspended for %s, reason %d", djct0.a.a, Integer.valueOf(v));
    }

    @Override  // djco
    public final void d() {
    }
}

