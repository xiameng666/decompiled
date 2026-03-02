import java.util.concurrent.Callable;

public final class dvmf implements Callable {
    @Override
    public final Object call() {
        return Boolean.valueOf(true);
    }
}

