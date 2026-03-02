import java.util.concurrent.Callable;

public final class dvmg implements Callable {
    @Override
    public final Object call() {
        return Boolean.valueOf(false);
    }
}

