import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class alee {
    public final Map a;

    public alee() {
        this.a = new HashMap();
    }

    public final algz a(String s, int v) {
        for(Object object0: this.b(s, v)) {
            alij alij0 = (alij)object0;
            if((alij0 instanceof algz)) {
                return (algz)alij0;
            }
        }
        return null;
    }

    public final Set b(String s, int v) {
        Set set0 = new HashSet();
        Map map0 = this.a;
        for(Object object0: map0.keySet()) {
            aled aled0 = (aled)object0;
            if(s.hashCode() == aled0.a && v == aled0.c) {
                set0.addAll(((Collection)map0.get(aled0)));
            }
        }
        return set0;
    }

    public final void c(alij alij0) {
        Map map0 = this.a;
        for(Object object0: map0.values()) {
            ((Set)object0).remove(alij0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: map0.keySet()) {
            aled aled0 = (aled)object1;
            if(((Set)map0.get(aled0)).isEmpty()) {
                arrayList0.add(aled0);
            }
        }
        map0.keySet().removeAll(arrayList0);
    }
}

