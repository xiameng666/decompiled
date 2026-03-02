import java.util.concurrent.Callable;

public final class dvmh implements Callable {
    @Override
    public final Object call() {
        return Boolean.valueOf(true);
    }
}

