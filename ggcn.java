import java.util.Collection;
import java.util.List;

public abstract class ggcn extends ggcq implements gghp {
    protected abstract gghp b();

    @Override  // ggcq, ggla
    public final Collection c(Object object0) {
        throw null;
    }

    @Override  // ggcq, ggla
    public final Collection d(Object object0) {
        throw null;
    }

    @Override  // ggcq
    protected ggla e() {
        throw null;
    }

    @Override  // gghp
    public List g(Object object0) {
        return this.b().g(object0);
    }

    @Override  // gghp
    public final List h(Object object0) {
        return this.b().h(object0);
    }
}

