import java.util.Iterator;
import java.util.Map.Entry;

final class ggfr extends ggfp {
    private final transient ggft a;

    public ggfr(ggft ggft0) {
        this.a = ggft0;
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        if((object0 instanceof Map.Entry)) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return this.a.A(object1, object2);
        }
        return false;
    }

    @Override  // ggfp
    public final Iterator iterator() {
        return this.om();
    }

    @Override  // ggfp
    public final ggqj om() {
        return new ggex(this.a);
    }

    @Override  // ggds
    public final boolean oo() {
        return false;
    }

    @Override
    public final int size() {
        return this.a.size;
    }

    @Override  // ggfp
    public Object writeReplace() {
        return super.writeReplace();
    }
}

