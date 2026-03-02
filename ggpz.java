import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class ggpz extends gfxn {
    ggbl a;
    final ggbl b;
    final ggqb c;
    final gghb d;

    public ggpz(ggqb ggqb0, ggbl ggbl0, gghb gghb0) {
        this.b = ggbl0;
        this.d = gghb0;
        Objects.requireNonNull(ggqb0);
        this.c = ggqb0;
        super();
        this.a = ggbl0;
    }

    @Override  // gfxn
    protected final Object a() {
        TimeRange ggmr1;
        if(!this.c.a.c.k(this.a)) {
            ggbh ggbh0 = ggbh.a;
            if(this.a != ggbh0) {
                gghb gghb0 = this.d;
                if(gghb0.hasNext()) {
                    TimeRange ggmr0 = (TimeRange)gghb0.next();
                    ggmr1 = new TimeRange(this.a, ggmr0.b);
                    this.a = ggmr0.c;
                    return new AbstractMap.SimpleImmutableEntry(ggmr1.b, ggmr1);
                }
                ggmr1 = new TimeRange(this.a, ggbh0);
                this.a = ggbh0;
                return new AbstractMap.SimpleImmutableEntry(ggmr1.b, ggmr1);
            }
        }
        this.c();
        return null;
    }
}

