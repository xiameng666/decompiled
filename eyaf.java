import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class eyaf extends exzl {
    public final oko a;
    public final okn b;
    private final omn c;

    public eyaf(omn omn0) {
        this.c = omn0;
        this.a = new eyad(this);
        this.b = new eyae(this);
    }

    @Override  // exzl
    public final Object a(exzk exzk0, ibrl ibrl0) {
        exzk0.getClass();
        exzn exzn0 = new exzn(this, exzk0);
        return oqj.d(this.c, false, true, exzn0, ibrl0);
    }

    @Override  // exzl
    public final Object b(long v, ibrl ibrl0) {
        exzu exzu0 = new exzu(v);
        return oqj.d(this.c, false, true, exzu0, ibrl0);
    }

    @Override  // exzl
    public final Object c(String s, ibrl ibrl0) {
        exzv exzv0 = new exzv(s);
        return oqj.d(this.c, true, false, exzv0, ibrl0);
    }

    @Override  // exzl
    public final Object d(exzk exzk0, ibrl ibrl0) {
        exzk0.getClass();
        exzz exzz0 = new exzz(this, exzk0);
        return oqj.d(this.c, false, true, exzz0, ibrl0);
    }

    @Override  // exzl
    public final Object e(long v, ibrl ibrl0) {
        exzm exzm0 = new exzm(v);
        return oqj.d(this.c, false, true, exzm0, ibrl0);
    }

    @Override  // exzl
    public final Object f(long v, byte[] arr_b, long v1, ibrl ibrl0) {
        exzt exzt0 = new exzt(arr_b, v1, v);
        return oqj.d(this.c, false, true, exzt0, ibrl0);
    }

    @Override  // exzl
    public final Object g(long v, boolean z, ibrl ibrl0) {
        eyaa eyaa0 = new eyaa(z, v);
        return oqj.d(this.c, false, true, eyaa0, ibrl0);
    }

    @Override  // exzl
    public final Object h(long v, String s, ibrl ibrl0) {
        exzr exzr0 = new exzr(s, v);
        return oqj.d(this.c, false, true, exzr0, ibrl0);
    }

    @Override  // exzl
    public final Object i(long v, Map map0, ibrl ibrl0) {
        exzy exzy0 = new exzy(map0, v);
        return oqj.d(this.c, false, true, exzy0, ibrl0);
    }

    @Override  // exzl
    public final Object j(long v, List list0, ibrl ibrl0) {
        exzo exzo0 = new exzo(list0, v);
        return oqj.d(this.c, false, true, exzo0, ibrl0);
    }

    @Override  // exzl
    public final Object k(long v, Map map0, ibrl ibrl0) {
        eyab eyab0 = new eyab(map0, v);
        return oqj.d(this.c, false, true, eyab0, ibrl0);
    }

    @Override  // exzl
    public final Object l(long v, Map map0, ibrl ibrl0) {
        exzq exzq0 = new exzq(map0, v);
        return oqj.d(this.c, false, true, exzq0, ibrl0);
    }

    @Override  // exzl
    public final Object m(long v, Map map0, ibrl ibrl0) {
        exzx exzx0 = new exzx(map0, v);
        return oqj.d(this.c, false, true, exzx0, ibrl0);
    }

    @Override  // exzl
    public final Object n(long v, Map map0, ibrl ibrl0) {
        exzw exzw0 = new exzw(map0, v);
        return oqj.d(this.c, false, true, exzw0, ibrl0);
    }

    @Override  // exzl
    public final icig o() {
        exzp exzp0 = new exzp();
        omn omn0 = this.c;
        olf olf0 = omn0.z();
        String[] arr_s = (String[])Arrays.copyOf(new String[]{"EnrolledDevice"}, 1);
        ibuq.f(arr_s, "tables");
        ibns ibns0 = olf0.c.f(arr_s);
        String[] arr_s1 = (String[])ibns0.a;
        ibuq.f(arr_s1, "resolvedTableNames");
        ibuq.f(((int[])ibns0.b), "tableIds");
        oli oli0 = null;
        icig icig0 = new icht(new onq(olf0.c, ((int[])ibns0.b), arr_s1, null));
        olm olm0 = olf0.j;
        if(olm0 != null) {
            ibuq.f(arr_s1, "resolvedTableNames");
            oli0 = new oli(olm0.h, arr_s1);
        }
        if(oli0 != null) {
            icig0 = icky.b(new icig[]{icig0, oli0});
        }
        return new oog(iciv.b(icig0), omn0, exzp0);
    }

    @Override  // exzl
    public final Object p(long v, ibrl ibrl0) {
        exzs exzs0 = new exzs(v);
        return oqj.d(this.c, false, true, exzs0, ibrl0);
    }

    @Override  // exzl
    public final Object q(long v, int v1, ibrl ibrl0) {
        eyac eyac0 = new eyac(v1, v);
        return oqj.d(this.c, false, true, eyac0, ibrl0);
    }

    public static final String r(int v) {
        return v - 1 == 0 ? "USER_INITIATED" : "LOCKSCREEN_REMOVED";
    }

    public static final int s(String s) {
        switch(s) {
            case "LOCKSCREEN_REMOVED": {
                return 2;
            }
            case "USER_INITIATED": {
                return 1;
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s);
            }
        }
    }
}

