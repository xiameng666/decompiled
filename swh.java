import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class swh {
    public final Map a;
    public final Map b;
    public final List c;
    sxd d;

    public swh() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new ArrayList();
        this.d = sxd.a;
    }

    public final void a(svt svt0, stb stb0) {
        if(!swh.e(svt0)) {
            return;
        }
        swy swy0 = new swy(stb0, null);
        swh.f(this.a, svt0, swy0);
    }

    public final void b(svt svt0, ssp ssp0) {
        if(!swh.e(svt0)) {
            return;
        }
        this.b.put(svt0, ssp0);
    }

    public final void c(swe swe0) {
        this.d = new sxd(swe0);
    }

    public static boolean d(Map map0, ssr ssr0) {
        for(Object object0: map0.entrySet()) {
            if(Arrays.equals(((svt)((Map.Entry)object0).getKey()).e().a(), ssr0.a())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(svt svt0) {
        return !(svt0 instanceof swa) && !(svt0 instanceof sre);
    }

    public static final void f(Map map0, svt svt0, Object object0) {
        List list0 = (List)map0.get(svt0);
        if(list0 == null) {
            list0 = new ArrayList();
            map0.put(svt0, list0);
        }
        list0.add(object0);
    }
}

