import j..util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class ggps extends ggkb {
    final ggpv a;

    public ggps(ggpv ggpv0) {
        Objects.requireNonNull(ggpv0);
        this.a = ggpv0;
        super();
    }

    @Override  // ggkb
    public final Map a() {
        return this.a;
    }

    @Override  // ggkb
    public final boolean isEmpty() {
        return !this.iterator().hasNext();
    }

    @Override
    public final Iterator iterator() {
        ggpv ggpv0 = this.a;
        ggpw ggpw0 = ggpv0.a;
        TimeRange ggmr0 = ggpw0.a;
        if(ggmr0.x()) {
            return gggw.a;
        }
        ggbl ggbl0 = (ggbl)MoreObjects.firstNonNull(((ggbl)ggpw0.b.b.floorKey(ggmr0.b)), ggmr0.b);
        return new ggpt(ggpv0, ggpw0.b.b.tailMap(ggbl0, true).values().iterator());
    }

    @Override  // ggkb
    public final boolean retainAll(Collection collection0) {
        gfti gfti0 = new gfti(new gftf(collection0));
        return this.a.a(gfti0);
    }

    @Override  // ggkb
    public final int size() {
        return gghd.c(this.iterator());
    }
}

