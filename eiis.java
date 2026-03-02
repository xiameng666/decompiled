import java.util.concurrent.Callable;

public final class eiis implements Callable {
    public final Callable a;

    public eiis(Callable callable0) {
        this.a = callable0;
    }

    @Override
    public final Object call() {
        return this.a.call();
    }
}

