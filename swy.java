import java.util.NoSuchElementException;

public final class swy {
    private final Object a;
    private final Object b;

    public swy(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final Object a() {
        Object object0 = this.a;
        if(object0 != null) {
            return object0;
        }
        throw new NoSuchElementException("Trying to get absent `left` value");
    }

    public final Object b() {
        Object object0 = this.b;
        if(object0 != null) {
            return object0;
        }
        throw new NoSuchElementException("Trying to get absent `right` value");
    }

    public final boolean c() {
        return this.b != null;
    }
}

