import java.util.Set;

public final class hfll implements gfsi {
    public final Set a;
    public final Set b;

    public hfll(Set set0, Set set1) {
        this.a = set0;
        this.b = set1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(((ggfp)object0).containsAll(this.a) && ((ggfp)object0).containsAll(this.b));
    }
}

