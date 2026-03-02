import java.util.LinkedHashMap;

final class gqja {
    private final LinkedHashMap a;

    public gqja() {
        this.a = new gqiz(this);
    }

    public final Object a(Object object0) {
        Object object1;
        synchronized(this) {
            object1 = this.a.get(object0);
        }
        return object1;
    }

    public final void b(Object object0, Object object1) {
        synchronized(this) {
            this.a.put(object0, object1);
        }
    }
}

