import java.util.concurrent.Callable;

public final class zjq implements Callable {
    public final Runnable a;

    public zjq(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override
    public final Object call() {
        this.a.run();
        return null;
    }
}

