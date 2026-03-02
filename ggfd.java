import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ggfd extends gfzb implements Serializable {
    public final transient ggeo map;
    private static final long serialVersionUID;
    public final transient int size;

    public ggfd(ggeo ggeo0, int v) {
        this.map = ggeo0;
        this.size = v;
    }

    @Override  // gfyr
    public final boolean B(Object object0) {
        return object0 != null && super.B(object0);
    }

    @Override  // gfyr
    @Deprecated
    public final boolean D(ggla ggla0) {
        throw new UnsupportedOperationException();
    }

    @Override  // gfyr
    @Deprecated
    public final boolean E(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // gfyr
    @Deprecated
    public final void F(Object object0, Iterable iterable0) {
        throw null;
    }

    public abstract ggds a(Object arg1);

    @Override  // ggla
    public Collection c(Object object0) {
        throw null;
    }

    @Override  // ggla
    @Deprecated
    public Collection d(Object object0) {
        throw null;
    }

    @Override  // ggla
    public final int i() {
        return this.size;
    }

    @Override  // gfyr
    public final Collection j() {
        return new ggfa(this);
    }

    @Override  // gfyr
    public final Collection k() {
        return new ggfc(this);
    }

    @Override  // gfyr
    public final Iterator l() {
        return new ggex(this);
    }

    public ggds n() {
        return (ggds)super.w();
    }

    @Override  // gfyr
    public final Map o() {
        throw new AssertionError("should never be called");
    }

    public final ggds p() {
        return (ggds)super.x();
    }

    @Override  // gfyr
    public final Set q() {
        throw new AssertionError("unreachable");
    }

    public final ggfp r() {
        return this.map.w();
    }

    @Override  // ggla
    @Deprecated
    public final void s() {
        throw new UnsupportedOperationException();
    }

    @Override  // ggla
    public final boolean u(Object object0) {
        return this.map.containsKey(object0);
    }

    @Override  // gfyr
    @Deprecated
    public final boolean v(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // gfyr
    public Collection w() {
        return this.n();
    }

    @Override  // gfyr
    public final Collection x() {
        throw null;
    }

    @Override  // gfyr
    public Map y() {
        return this.map;
    }

    @Override  // gfyr
    public final Set z() {
        return this.r();
    }
}

