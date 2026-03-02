import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;

final class ggpt extends gfxn {
    final Iterator a;
    final ggpv b;

    public ggpt(ggpv ggpv0, Iterator iterator0) {
        this.a = iterator0;
        Objects.requireNonNull(ggpv0);
        this.b = ggpv0;
        super();
    }

    @Override  // gfxn
    protected final Object a() {
        while(true) {
            Iterator iterator0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            ggpq ggpq0 = (ggpq)object0;
            ggbl ggbl0 = ggpq0.a();
            TimeRange ggmr0 = this.b.a.a;
            if(ggbl0.a(ggmr0.c) >= 0) {
                this.c();
                return null;
            }
            if(ggpq0.b().a(ggmr0.b) > 0) {
                return new AbstractMap.SimpleImmutableEntry(((TimeRange)ggpq0.getKey()).k(ggmr0), ggpq0.getValue());
            }
        }
        this.c();
        return null;
    }
}

