import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class fuvy implements fvto {
    public static final ggfp a;
    public static final ggfp b;
    public static final ggfp c;
    public static final ggfp d;
    public static final gged_interceptors e;
    public final Object f;
    public final Map g;
    private final Object h;
    private final List i;
    private final fwvc j;

    static {
        fuvy.a = ggfp.O("vehicle", "automobile", "mb bluetooth", "himbox", "abarth", "alfa romeo", new String[]{"allroad", "aston martin", "bentley", "bmw", "bugatti", "cadillac", "chevrolet", "chevy", "chrysler", "citroen", "corvette", "daewoo", "daihatsu", "daimler", "datsun", "ferrari", "hummer", "hyundai", "infiniti", "innocenti", "maserati", "maybach", "mercedes", "mercury", "mitsubishi", "my rogue", "pontiac", "porsche", "prius", "santa fe", "ssangyong", "subaru", "suzuki", "volkswagen", "btc45", "atmobile", "rfbtaux", "deh-150", "bv7942", "deh-x6700", "avhx2700bs", "bv9973", "kdr540", "blue&me", "handsfreelink", "vauxhall", "automotive", "motorcycle", "toyota", "deh-x6600bt", "elantra", "altima"});
        fuvy.b = ggfp.O("car", "ktm", "kia", "fiat", "audi", "ford", new String[]{"jeep", "coupe", "lada", "opel", "himbox", "hb01", "iveco", "dodge", "josse", "motor", "motors", "lotus", "spectre", "royce", "saab", "skoda", "tesla", "honda", "rover", "lexus", "maxima", "mazda", "dacia", "buick", "jaguar", "volvo", "vw", "nissan", "uconnect", "gmc"});
        fuvy.c = ggfp.O("chromebook", "keyboard", "headphone", "earbud", "computer", "boombox", new String[]{"jambox", "bose mini soundlink", "bluebuds", "bose ae2w", "logitech adapter", "airwave", "rgb light"});
        fuvy.d = ggfp.O("watch", "home", "desk", "iphone", "buds", "ihome", new String[]{"soundbar", "ipod", "ledblue"});
        fuvy.e = gged_interceptors.u("surge", "charge hr", "zip", "flex", "up24", "one", "up2", "nexus 5", "nexus 6", "nexus 4");
    }

    public fuvy(fwvc fwvc0) {
        this.j = fwvc0;
        this.f = new Object();
        this.h = new Object();
        this.g = new HashMap();
        this.i = new ArrayList();
    }

    @Override  // fvto
    public final Map a() {
        Map map0;
        synchronized(this.f) {
            map0 = new HashMap();
            for(Object object1: this.g.values()) {
                fuvx fuvx0 = (fuvx)object1;
                if(fuvx0.a()) {
                    map0.put(Long.valueOf(fuvx0.c.a), fuvx0);
                }
            }
        }
        return map0;
    }

    public final void b(fvtn fvtn0) {
        synchronized(this.h) {
            this.i.add(fvtn0);
        }
    }

    public final void c(fvte fvte0) {
        try {
            if(this.j != null && this.j.a() != null && this.j.a().size() < this.g.size()) {
                goto label_1;
            }
        }
        catch(NullPointerException unused_ex) {
        }
        return;
    label_1:
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.j.a()) {
            hashSet0.add(Long.valueOf(((fwxv)object0).a));
        }
        ArrayList arrayList0 = new ArrayList();
        Map map0 = this.g;
        for(Object object1: map0.keySet()) {
            Long long0 = (Long)object1;
            if(!hashSet0.contains(long0) && (fvte0 == null || ((long)long0) != fvte0.a)) {
                arrayList0.add(long0);
            }
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Long long1 = (Long)arrayList0.get(v1);
            fvte fvte1 = ((fuvx)map0.get(long1)).c;
            fvte1.g();
            fuvx fuvx0 = new fuvx(fvte1, false);
            map0.put(long1, fuvx0);
            this.f(fuvx0);
        }
        map0.keySet().removeAll(arrayList0);
    }

    public final void d(fvte fvte0, int v) {
        boolean z = false;
        switch(v) {
            case 1: 
            case 4: {
                z = true;
                break;
            }
            case 2: 
            case 5: {
                break;
            }
            default: {
                return;
            }
        }
        fuvx fuvx0 = new fuvx(fvte0, z);
        this.g.put(Long.valueOf(fvte0.a), fuvx0);
        fvte0.g();
        this.f(fuvx0);
    }

    public static boolean e(String s, Iterable iterable0, Set set0) {
        if(s == null) {
            return false;
        }
        String[] arr_s = s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])| |_|-");
        for(int v = 0; v < arr_s.length; ++v) {
            if(set0.contains(arr_s[v].toLowerCase(Locale.US))) {
                return true;
            }
        }
        String s1 = s.toLowerCase(Locale.US);
        for(Object object0: iterable0) {
            if(s1.contains(((String)object0))) {
                return true;
            }
        }
        return false;
    }

    private final void f(fuvx fuvx0) {
        int v1;
        synchronized(this.h) {
            for(Object object1: this.i) {
                boolean z = fuvx0.b;
                if(fuvx0.a()) {
                    v1 = 1;
                }
                else {
                    v1 = fuvx0.a < 50 ? 3 : 2;
                }
                ((fvtn)object1).K(z, v1);
            }
        }
    }
}

