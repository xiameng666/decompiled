import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class cyyf {
    public final Set a;
    private static final Map b;
    private final Map c;
    private final Map d;

    static {
        cyyf.b = new bxd();
    }

    private cyyf() {
        this.c = new bxd();
        this.a = new bxf();
        this.d = new bxd();
    }

    public final azyf a(azts azts0, Object object0, String s) {
        azyf azyf0;
        synchronized(this) {
            batl.s(object0);
            azyf0 = azts0.iD(object0, s);
            azyd_linstner azyd0 = azyf0.listener_;
            batl.t(azyd0, "Key must not be null");
            Map map0 = this.c;
            Set set0 = (Set)map0.get(s);
            if(set0 == null) {
                set0 = new bxf();
                map0.put(s, set0);
            }
            set0.add(azyd0);
        }
        return azyf0;
    }

    public static cyyf b(azts azts0, azsx azsx0) {
        cyyf cyyf0;
        synchronized(cyyf.class) {
            cyye cyye0 = new cyye(azts0, azsx0);
            Map map0 = cyyf.b;
            if(!map0.containsKey(cyye0)) {
                map0.put(cyye0, new cyyf());
            }
            cyyf0 = (cyyf)map0.get(cyye0);
        }
        return cyyf0;
    }

    public final evql c(azts azts0, azyr azyr0) {
        evql evql0;
        synchronized(this) {
            azyd_linstner azyd0 = azyr0.a.getListener();
            batl.t(azyd0, "Key must not be null");
            boolean z = this.a.add(azyd0);
            evql0 = azts0.iH(azyr0);
            evql0.A(new cyyd(this, azts0, azyd0, z));
        }
        return evql0;
    }

    public final evql d(azts azts0, String s) {
        evql evql1;
        synchronized(this) {
            bxf bxf0 = new bxf();
            Map map0 = this.c;
            Set set0 = (Set)map0.get(s);
            if(set0 == null) {
                return evrg.e(bxf0);
            }
            bxe bxe0 = new bxe(new bxf(set0));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                azyd_linstner azyd0 = (azyd_linstner)object0;
                if(this.a.contains(azyd0)) {
                    bxf0.add(this.e(azts0, azyd0));
                }
            }
            map0.remove(s);
            evql1 = evrg.e(bxf0);
        }
        return evql1;
    }

    public final evql e(azts azts0, azyd_linstner azyd0) {
        evql evql0;
        String s;
        synchronized(this) {
            this.a.remove(azyd0);
            Map map0 = this.c;
            for(Object object0: map0.keySet()) {
                s = (String)object0;
                Set set0 = (Set)map0.get(s);
                if(!set0.contains(azyd0)) {
                    continue;
                }
                set0.remove(azyd0);
                goto label_13;
            }
            s = null;
        label_13:
            if(s != null) {
                Map map1 = this.d;
                for(Object object1: map1.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    if(azyg.a(map$Entry0.getValue(), s).equals(azyd0)) {
                        map1.remove(map$Entry0.getKey());
                        break;
                    }
                }
            }
            evql0 = azts0.iJ(azyd0);
        }
        return evql0;
    }

    public final azyd_linstner f(String s) {
        azyd_linstner azyd0;
        synchronized(this) {
            azyd0 = azyg.a(this.h(s), "connection");
        }
        return azyd0;
    }

    public final azyf g(azts azts0, String s) {
        azyf azyf0;
        synchronized(this) {
            azyf0 = this.a(azts0, this.h(s), "connection");
        }
        return azyf0;
    }

    private final Object h(String s) {
        Map map0 = this.d;
        if(!map0.containsKey(s)) {
            map0.put(s, new Object());
        }
        return map0.get(s);
    }
}

