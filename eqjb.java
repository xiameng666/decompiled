import java.util.Map;
import java.util.Set;

public final class eqjb {
    private static eqjb a;
    private final Map b;
    private final Set c;

    private eqjb() {
        this.b = new bxd();
        this.c = new bxf();
    }

    public final azyf a(azts azts0, String s) {
        azyf azyf0;
        synchronized(this) {
            Map map0 = this.b;
            if(map0.containsKey(s)) {
                return null;
            }
            azyf0 = azts0.iD(new Object(), s);
            azyd_linstner azyd0 = azyf0.listener_;
            batl.t(azyd0, "Key must not be null");
            map0.put(s, azyd0);
        }
        return azyf0;
    }

    public static eqjb b() {
        synchronized(eqjb.class) {
            if(eqjb.a == null) {
                eqjb.a = new eqjb();
            }
        }
        return eqjb.a;
    }

    public final evql c(azts azts0, String s) {
        evql evql2;
        synchronized(this) {
            Map map0 = this.b;
            azyd_linstner azyd0 = (azyd_linstner)map0.get(s);
            if(azyd0 == null) {
                return evrg.d(null);
            }
            Set set0 = this.c;
            if(set0.contains(azyd0)) {
                set0.remove(azyd0);
                map0.remove(s);
                return azts0.iJ(azyd0);
            }
            evql2 = evrg.d(null);
        }
        return evql2;
    }

    public final boolean d(String s) {
        return this.b.containsKey(s);
    }

    public final void e(azts azts0, azyl azyl0, azzi azzi0) {
        synchronized(this) {
            azyd_linstner azyd0 = azyl0.getListener();
            batl.t(azyd0, "Key must not be null");
            this.c.add(azyd0);
            azts0.iI(azyl0, azzi0).A((/* MISSING LAMBDA PARAMETER */) -> synchronized(this) {
                this.c.remove(azyd0);
                azts0.iJ(azyd0);
            });
        }
    }

    // Detected as a lambda impl.
    public final void f(azts azts0, azyd_linstner azyd0) {
        synchronized(this) {
            this.c.remove(azyd0);
            azts0.iJ(azyd0);
        }
    }
}

