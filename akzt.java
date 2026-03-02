import java.util.concurrent.Executor;

public abstract class akzt {
    private final Executor a;

    protected akzt(Executor executor0) {
        this.a = executor0;
    }

    // Detected as a lambda impl.
    public abstract void b(akzu arg1, int arg2, int arg3);

    // Detected as a lambda impl.
    public abstract void c(akzu arg1, String arg2, byte[] arg3);

    final void h(akzu akzu0, int v, int v1) {
        akzr akzr0 = () -> ;;
        this.a.execute(akzr0);
    }

    final void i(akzu akzu0, String s, byte[] arr_b) {
        akzs akzs0 = () -> ;;
        this.a.execute(akzs0);
    }
}

