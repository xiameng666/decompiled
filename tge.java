import java.util.Map;

public abstract class tge {
    public final Map a;
    public String b;

    static {
    }

    public tge(Map map0) {
        this.b = null;
        this.a = map0;
    }

    public final int a(byte b) {
        return (int)Integer.valueOf(tjs.a(b));
    }

    public final tgu b() {
        byte[] arr_b = this.f(tgu.a);
        return arr_b == null ? null : new tgu(arr_b);
    }

    public abstract thj c();

    public final thp d(tib tib0) {
        Map map0 = this.a;
        tij tij0 = (tij)map0.get(tij.a);
        thp thp0 = null;
        if(tij0 != null) {
            String s = this.b;
            if(s != null) {
                Map map1 = (Map)tij0.e.get(s);
                if(map1 != null) {
                    thp0 = (thp)map1.get(tib0);
                }
            }
        }
        if(thp0 == null) {
            thp0 = (thp)map0.get(tib0);
        }
        if(thp0 != null) {
            return thp0;
        }
        throw new IllegalArgumentException("No such dgi " + tib0.toString());
    }

    public final boolean e(tib tib0) {
        Map map0 = this.a;
        tij tij0 = (tij)map0.get(tij.a);
        if(tij0 != null) {
            String s = this.b;
            if(s != null) {
                Map map1 = (Map)tij0.e.get(s);
                return map1 == null || !map1.containsKey(tib0) ? map0.containsKey(tib0) : true;
            }
        }
        return map0.containsKey(tib0);
    }

    public final byte[] f(byte[] arr_b) {
        for(Object object0: this.a.values()) {
            thp thp0 = (thp)object0;
            if((thp0 instanceof thu) && ((thu)thp0).a(arr_b)) {
                return ((thu)thp0).b(arr_b);
            }
        }
        return null;
    }
}

