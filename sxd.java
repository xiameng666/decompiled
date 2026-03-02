import java.util.NoSuchElementException;

public final class sxd {
    public static final sxd a;
    public final Object b;

    static {
        sxd.a = new sxd(null);
    }

    public sxd(Object object0) {
        this.b = object0;
    }

    public static sxd a(Object object0) {
        return object0 == null ? sxd.a : new sxd(object0);
    }

    public final Object b() {
        Object object0 = this.b;
        if(object0 != null) {
            return object0;
        }
        throw new NoSuchElementException("Trying to get value from empty Optional");
    }

    public final Object c(Object object0) {
        return this.b == null ? object0 : this.b;
    }

    public final boolean d() {
        return this.b != null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            Object object1 = this.b;
            if(object1 == null && ((sxd)object0).b == null) {
                return true;
            }
            return object1 == null ? false : object1.equals(((sxd)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }
}

