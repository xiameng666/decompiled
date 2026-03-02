import java.util.Collection;
import java.util.Set;

public abstract class ggnn extends ggge {
    @Override  // gfyy
    public final Collection d() {
        return this.j() ? ggna.a : new ggnm(this);
    }

    @Override  // gfyy
    public final Set g() {
        return this.j() ? ggnj.a : new ggnl(this);
    }

    public abstract ggpi n(int arg1);

    public abstract Object o(int arg1);

    public static ggnn u(gged_interceptors gged0, ggfp ggfp0, ggfp ggfp1) {
        return ((long)gged0.size()) > ((long)ggfp0.size()) * ((long)ggfp1.size()) / 2L ? new ggbs(gged0, ggfp0, ggfp1) : new ggon(gged0, ggfp0, ggfp1);
    }

    static final void v(Object object0, Object object1, Object object2, Object object3) {
        gftb.o(object2 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", object0, object1, object3, object2);
    }

    @Override  // ggge
    abstract Object writeReplace();
}

