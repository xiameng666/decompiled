import java.util.HashMap;

public final class akh extends ako {
    public final HashMap a;

    public akh() {
        this.a = new HashMap();
    }

    @Override  // ako
    public final akk a(Object object0) {
        return (akk)this.a.get(object0);
    }

    @Override  // ako
    public final Object b(Object object0) {
        Object object1 = super.b(object0);
        this.a.remove(object0);
        return object1;
    }

    public final boolean c(Object object0) {
        return this.a.containsKey(object0);
    }
}

