import j..util.Objects;
import java.util.Iterator;
import java.util.Map;

public final class ggor extends ggke {
    final Object a;
    Map b;
    final ggov c;

    public ggor(ggov ggov0, Object object0) {
        Objects.requireNonNull(ggov0);
        this.c = ggov0;
        super();
        gftb.check(object0);
        this.a = object0;
    }

    final void a() {
        this.c();
        if(this.b != null && this.b.isEmpty()) {
            this.c.b.remove(this.a);
            this.b = null;
        }
    }

    @Override  // ggke
    public final Iterator b() {
        this.c();
        Map map0 = this.b;
        return map0 == null ? gggy.a : new ggop(this, map0.entrySet().iterator());
    }

    final void c() {
        if(this.b != null && (!this.b.isEmpty() || !this.c.b.containsKey(this.a))) {
            return;
        }
        this.b = (Map)this.c.b.get(this.a);
    }

    @Override  // ggke
    public final void clear() {
        this.c();
        Map map0 = this.b;
        if(map0 != null) {
            map0.clear();
        }
        this.a();
    }

    @Override
    public final boolean containsKey(Object object0) {
        this.c();
        return object0 != null && (this.b != null && ggkm.p(this.b, object0));
    }

    @Override
    public final Object get(Object object0) {
        this.c();
        if(object0 != null) {
            return this.b == null ? null : ggkm.h(this.b, object0);
        }
        return null;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        gftb.check(object0);
        gftb.check(object1);
        return this.b == null || this.b.isEmpty() ? this.c.b(this.a, object0, object1) : this.b.put(object0, object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.c();
        Map map0 = this.b;
        if(map0 == null) {
            return null;
        }
        Object object1 = ggkm.i(map0, object0);
        this.a();
        return object1;
    }

    @Override
    public final int size() {
        this.c();
        return this.b == null ? 0 : this.b.size();
    }
}

