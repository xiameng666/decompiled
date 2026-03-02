import java.util.LinkedHashMap;
import java.util.Set;

public final class cac {
    public final LinkedHashMap a;

    public cac() {
        this(16);
    }

    public cac(int v) {
        this.a = new LinkedHashMap(v, 0.75f, true);
    }

    public final Object a(Object object0, Object object1) {
        ibuq.f(object0, "key");
        ibuq.f(object1, "value");
        return this.a.put(object0, object1);
    }

    public final Object b(Object object0) {
        ibuq.f(object0, "key");
        return this.a.remove(object0);
    }

    public final Set c() {
        Set set0 = this.a.entrySet();
        ibuq.e(set0, "<get-entries>(...)");
        return set0;
    }

    public final boolean d() {
        return this.a.isEmpty();
    }
}

