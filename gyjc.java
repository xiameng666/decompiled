import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public abstract class gyjc {
    private final Map a;
    private final Set b;

    public gyjc() {
        this.a = new HashMap();
        this.b = DesugarCollections.synchronizedSet(new HashSet());
    }

    protected abstract gyjp a(gyhn arg1);

    protected abstract gyjp b(gyhn arg1, Set arg2);

    public final gyjp c(gyhn gyhn0) {
        gyjp gyjp0;
        batl.s(gyhn0);
        Map map0 = this.a;
        synchronized(map0) {
            gyjp0 = this.b(gyhn0, map0.keySet());
            if(gyjp0 == null) {
                Set set0 = this.b;
                synchronized(set0) {
                    gyjp gyjp1 = this.b(gyhn0, set0);
                    if(gyjp1 != null) {
                        set0.remove(gyjp1);
                    }
                    gyjp0 = gyjp1;
                }
            }
            if(gyjp0 == null) {
                gyjp0 = this.a(gyhn0);
            }
            if(gyjp0 != null) {
                Map map1 = this.a;
                Integer integer0 = (Integer)map1.get(gyjp0);
                if(integer0 == null) {
                    integer0 = (int)0;
                }
                map1.put(gyjp0, Integer.valueOf(((int)integer0) + 1));
            }
        }
        return gyjp0;
    }

    public final void d(gyjp gyjp0) {
        batl.s(gyjp0);
        this.b.add(gyjp0);
    }

    public final void e(gyjp gyjp0) {
        batl.s(gyjp0);
        Map map0 = this.a;
        __monitor_enter(map0);
        int v = FIN.finallyOpen$NT();
        boolean z = true;
        Integer integer0 = (Integer)map0.get(gyjp0);
        if(integer0 != null) {
            if(((int)integer0) > 1) {
                map0.put(gyjp0, Integer.valueOf(((int)integer0) - 1));
                z = false;
            }
            else {
                map0.remove(gyjp0);
            }
            FIN.finallyCodeBegin$NT(v);
            if(z) {
                gyjp0.close();
            }
            return;
        }
        throw new IllegalArgumentException("Unknown connection.");
    }

    public final void f(gyjp gyjp0) {
        batl.s(gyjp0);
        if(this.b.remove(gyjp0)) {
            gyjp0.close();
        }
    }
}

