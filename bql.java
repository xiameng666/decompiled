import java.util.concurrent.Executor;

public interface bql extends blr {
    public static final bjr Q;

    static {
        bql.Q = new bjr("camerax.core.io.ioExecutor", Executor.class, null);
    }
}

