import java.io.Serializable;

final class ggfl implements Serializable {
    private final gged_interceptors a;

    public ggfl(gged_interceptors gged0) {
        this.a = gged0;
    }

    Object readResolve() {
        gged_interceptors gged0 = this.a;
        if(gged0.isEmpty()) {
            return ggfm.a;
        }
        return ggia.i(gged0, gged_interceptors.l(TimeRange.a)) ? ggfm.b : new ggfm(gged0);
    }
}

