import j..util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

final class ggpv extends AbstractMap {
    final ggpw a;

    public ggpv(ggpw ggpw0) {
        Objects.requireNonNull(ggpw0);
        this.a = ggpw0;
        super();
    }

    public final boolean a(gftc gftc0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: new ggps(this)) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(gftc0.a(map$Entry0)) {
                arrayList0.add(((TimeRange)map$Entry0.getKey()));
            }
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            TimeRange ggmr0 = (TimeRange)arrayList0.get(v1);
            this.a.b.e(ggmr0);
        }
        return !arrayList0.isEmpty();
    }

    @Override
    public final void clear() {
        this.a.b.e(this.a.a);
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final Set entrySet() {
        return new ggps(this);
    }

    @Override
    public final Object get(Object object0) {
        ggpq ggpq0;
        try {
            if((object0 instanceof TimeRange)) {
                ggpw ggpw0 = this.a;
                TimeRange ggmr0 = ggpw0.a;
                if(ggmr0.t(((TimeRange)object0)) && !((TimeRange)object0).x()) {
                    ggbl ggbl0 = ((TimeRange)object0).b;
                    if(ggbl0.a(ggmr0.b) == 0) {
                        Map.Entry map$Entry0 = ggpw0.b.b.floorEntry(ggbl0);
                        ggpq0 = map$Entry0 == null ? null : ((ggpq)map$Entry0.getValue());
                    }
                    else {
                        ggpq0 = (ggpq)ggpw0.b.b.get(ggbl0);
                    }
                    return ggpq0 == null || !((TimeRange)ggpq0.getKey()).w(ggmr0) || !((TimeRange)ggpq0.getKey()).k(ggmr0).equals(((TimeRange)object0)) ? null : ggpq0.getValue();
                }
            }
        }
        catch(ClassCastException unused_ex) {
        }
        return null;
    }

    @Override
    public final Set keySet() {
        return new ggpr(this, this);
    }

    @Override
    public final Object remove(Object object0) {
        Object object1 = this.get(object0);
        if(object1 != null) {
            TimeRange ggmr0 = (TimeRange)Objects.requireNonNull(object0);
            this.a.b.e(ggmr0);
            return object1;
        }
        return null;
    }

    @Override
    public final Collection values() {
        return new ggpu(this, this);
    }
}

