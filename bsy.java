import java.util.Map.Entry;
import java.util.Map;

public final class bsy implements kar {
    public final Map a;

    public bsy(Map map0) {
        this.a = map0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        for(Object object1: this.a.entrySet()) {
            int v = ((btr)((Map.Entry)object1).getKey()).e;
            int v1 = ((bej)object0).b - v;
            if(((btr)((Map.Entry)object1).getKey()).f) {
                v1 = -v1;
            }
            ((bss)((Map.Entry)object1).getValue()).k(bok.b(v1), -1);
        }
    }
}

