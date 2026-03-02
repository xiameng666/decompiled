import java.util.concurrent.Executor;

public interface bqv extends blr {
    public static final bjr g;

    static {
        bqv.g = new bjr("camerax.core.thread.backgroundExecutor", Executor.class, null);
    }
}

