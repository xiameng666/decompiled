import android.os.PersistableBundle;
import java.util.Map.Entry;
import java.util.Map;

public final class sds implements sdv {
    public static final sds a;
    private final scx b;
    private final scx c;

    static {
        sds.a = new sds(scz.k, scz.k);
    }

    public sds() {
        this(scz.k, scz.k);
    }

    public sds(scx scx0, scx scx1) {
        this.b = scx0;
        this.c = scx1;
    }

    public final PersistableBundle a(Map map0) {
        ibuq.f(map0, "value");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("size", map0.size());
        int v = 0;
        for(Object object0: map0.entrySet()) {
            sde.c(persistableBundle0, "key_" + v, ((Map.Entry)object0).getKey(), this.b);
            sde.c(persistableBundle0, "item_" + v, ((Map.Entry)object0).getValue(), this.c);
            ++v;
        }
        return persistableBundle0;
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        return this.a(((Map)object0));
    }
}

