import java.util.function.Supplier;

public final class fxhf implements Supplier {
    public final Supplier a;

    public fxhf(Supplier supplier0) {
        this.a = supplier0;
    }

    @Override
    public final Object get() {
        long v = (long)(((Long)this.a.get()));
        return hfyf.k((v == -1L ? -1L : Math.max(0L, System.currentTimeMillis() - v)));
    }
}

