import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class ggqa extends gfxn {
    ggbl a;
    final ggbl b;
    final ggqb c;
    final gghb d;

    public ggqa(ggqb ggqb0, ggbl ggbl0, gghb gghb0) {
        this.b = ggbl0;
        this.d = gghb0;
        Objects.requireNonNull(ggqb0);
        this.c = ggqb0;
        super();
        this.a = ggbl0;
    }

    @Override  // gfxn
    protected final Object a() {
        ggbj ggbj0 = ggbj.a;
        if(this.a == ggbj0) {
            this.c();
            return null;
        }
        gghb gghb0 = this.d;
        if(gghb0.hasNext()) {
            TimeRange ggmr0 = (TimeRange)gghb0.next();
            TimeRange ggmr1 = new TimeRange(ggmr0.c, this.a);
            this.a = ggmr0.b;
            ggbl ggbl0 = ggmr1.b;
            if(this.c.a.b.k(ggbl0)) {
                return new AbstractMap.SimpleImmutableEntry(ggbl0, ggmr1);
            }
        }
        else if(this.c.a.b.k(ggbj0)) {
            TimeRange ggmr2 = new TimeRange(ggbj0, this.a);
            this.a = ggbj0;
            return new AbstractMap.SimpleImmutableEntry(ggbj0, ggmr2);
        }
        this.c();
        return null;
    }
}

