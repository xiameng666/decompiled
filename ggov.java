import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ggov extends gfyy implements Serializable {
    final Map b;
    private transient Map c;
    private static final long serialVersionUID;

    public ggov(Map map0) {
        this.b = map0;
    }

    @Override  // gfyy
    public final Object a(Object object0, Object object1) {
        return object0 == null || object1 == null ? null : super.a(object0, object1);
    }

    @Override  // gfyy
    public final Object b(Object object0, Object object1, Object object2) {
        gftb.check(object0);
        gftb.check(object1);
        gftb.check(object2);
        Map map0 = this.b;
        Map map1 = (Map)map0.get(object0);
        if(map1 == null) {
            map1 = ggcw.b();
            map0.put(object0, map1);
        }
        return map1.put(object1, object2);
    }

    @Override  // gfyy
    public final Object c(Object object0, Object object1) {
        if(object0 != null && object1 != null) {
            Map map0 = this.b;
            Map map1 = (Map)ggkm.h(map0, object0);
            if(map1 == null) {
                return null;
            }
            Object object2 = map1.remove(object1);
            if(map1.isEmpty()) {
                map0.remove(object0);
            }
            return object2;
        }
        return null;
    }

    @Override  // gfyy
    public final Iterator e() {
        return new ggoo(this);
    }

    @Override  // gfyy
    public final Set h() {
        return this.p().keySet();
    }

    @Override  // gfyy
    public final void i() {
        this.b.clear();
    }

    @Override  // ggpj
    public final int k() {
        int v = 0;
        for(Object object0: this.b.values()) {
            v += ((Map)object0).size();
        }
        return v;
    }

    public final boolean m(Object object0) {
        return object0 != null && ggkm.p(this.b, object0);
    }

    @Override  // ggpj
    public final Map p() {
        Map map0 = this.c;
        if(map0 == null) {
            map0 = new ggot(this);
            this.c = map0;
        }
        return map0;
    }
}

