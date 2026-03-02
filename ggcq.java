import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class ggcq extends ggcs implements ggla {
    @Override  // ggla
    public final boolean A(Object object0, Object object1) {
        throw null;
    }

    @Override  // ggla
    public final boolean C() {
        return this.e().C();
    }

    @Override  // ggla
    public boolean D(ggla ggla0) {
        return this.e().D(ggla0);
    }

    @Override  // ggla
    public boolean E(Object object0, Object object1) {
        throw null;
    }

    @Override  // ggla
    public void F(Object object0, Iterable iterable0) {
        throw null;
    }

    @Override  // ggla
    public Collection c(Object object0) {
        throw null;
    }

    @Override  // ggla
    public Collection d(Object object0) {
        throw null;
    }

    protected abstract ggla e();

    @Override  // ggla
    public final boolean equals(Object object0) {
        return object0 == this || this.e().equals(object0);
    }

    @Override  // ggla
    public final int hashCode() {
        return this.e().hashCode();
    }

    @Override  // ggla
    public final int i() {
        throw null;
    }

    @Override  // ggcs
    protected Object oi() {
        throw null;
    }

    @Override  // ggla
    public void s() {
        throw null;
    }

    @Override  // ggla
    public final boolean u(Object object0) {
        throw null;
    }

    @Override  // ggla
    public boolean v(Object object0, Object object1) {
        return this.e().v(object0, object1);
    }

    @Override  // ggla
    public Collection w() {
        return this.e().w();
    }

    @Override  // ggla
    public Collection x() {
        throw null;
    }

    @Override  // ggla
    public Map y() {
        return this.e().y();
    }

    @Override  // ggla
    public Set z() {
        return this.e().z();
    }
}

