import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

final class fdrk {
    public final Map a;
    public final Random b;

    public fdrk(Random random0) {
        this.a = new HashMap();
        this.b = random0;
    }

    final Object a(fdrq fdrq0) {
        fdrj fdrj0 = fdrj.a(fdrq0);
        return this.a.get(fdrj0);
    }

    final Object b(String s, long v, boolean z) {
        fdrj fdrj0 = new fdrj(s, v, z);
        return this.a.get(fdrj0);
    }

    final Object c(fdrq fdrq0) {
        fdrj fdrj0 = fdrj.a(fdrq0);
        return this.a.remove(fdrj0);
    }

    final Collection d() {
        return this.a.values();
    }

    final void e(fdrq fdrq0, Object object0) {
        Map map0 = this.a;
        fdrj fdrj0 = fdrj.a(fdrq0);
        if(map0.containsKey(fdrj0)) {
            throw new IllegalArgumentException("Channel already exists: " + fdrq0.toString());
        }
        map0.put(fdrj0, object0);
    }
}

