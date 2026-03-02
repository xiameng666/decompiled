import java.util.Iterator;

final class ggfc extends ggds {
    private final transient ggfd a;
    private static final long serialVersionUID;

    public ggfc(ggfd ggfd0) {
        this.a = ggfd0;
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        return this.a.B(object0);
    }

    @Override  // ggds
    public final Iterator iterator() {
        return this.om();
    }

    @Override  // ggds
    public final ggqj om() {
        return new ggey(this.a);
    }

    @Override  // ggds
    public final boolean oo() {
        throw null;
    }

    @Override
    public final int size() {
        return this.a.size;
    }

    @Override  // ggds
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override  // ggds
    public final int x(Object[] arr_object, int v) {
        ggqj ggqj0 = this.a.map.g().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            v = ((ggds)object0).x(arr_object, v);
        }
        return v;
    }
}

