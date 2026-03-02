import java.util.Map;

public abstract class ttm {
    public final Map a;
    public String b;

    static {
    }

    public ttm(Map map0) {
        this.b = null;
        this.a = map0;
    }

    public abstract tur b();

    public final int d(byte b) {
        return (int)Integer.valueOf(twz.a(b));
    }

    public final tuc e() {
        byte[] arr_b = this.g(tuc.a);
        return arr_b == null ? null : new tuc(arr_b);
    }

    public final tuw f(tvi tvi0) {
        Map map0 = this.a;
        tvq tvq0 = (tvq)map0.get(tvq.a);
        tuw tuw0 = null;
        if(tvq0 != null) {
            String s = this.b;
            if(s != null) {
                Map map1 = (Map)tvq0.e.get(s);
                if(map1 != null) {
                    tuw0 = (tuw)map1.get(tvi0);
                }
            }
        }
        if(tuw0 == null) {
            tuw0 = (tuw)map0.get(tvi0);
        }
        if(tuw0 != null) {
            return tuw0;
        }
        throw new IllegalArgumentException("No such dgi " + tvi0.toString());
    }

    public final byte[] g(byte[] arr_b) {
        for(Object object0: this.a.values()) {
            tuw tuw0 = (tuw)object0;
            if((tuw0 instanceof tvb) && ((tvb)tuw0).j(arr_b)) {
                return ((tvb)tuw0).k(arr_b);
            }
        }
        return null;
    }
}

