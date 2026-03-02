import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

public final class ggfm extends gfyu implements Serializable {
    public static final ggfm a;
    public static final ggfm b;
    public final transient gged_interceptors c;

    static {
        ggfm.a = new ggfm(ggna.a);
        ggfm.b = new ggfm(gged_interceptors.l(TimeRange.a));
    }

    public ggfm(gged_interceptors gged0) {
        this.c = gged0;
    }

    public static ggfm c(ggmt ggmt0) {
        if(((gfyu)ggmt0).g().isEmpty()) {
            return ggfm.a;
        }
        return ggmt0.h(TimeRange.a) ? ggfm.b : new ggfm(gged_interceptors.i(ggmt0.g()));
    }

    public static ggfm d(Iterable iterable0) {
        return ggfm.c(ggqi.d(iterable0));
    }

    public final ggfp e() {
        gged_interceptors gged0 = this.c;
        return gged0.isEmpty() ? ggnj.a : new ggnk(gged0, ggmq.a);
    }

    @Override  // ggmt
    public final ggmt f() {
        throw null;
    }

    @Override  // ggmt
    public final Set g() {
        return this.e();
    }

    @Override  // ggmt
    public final boolean h(TimeRange ggmr0) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new ggfl(this.c);
    }
}

