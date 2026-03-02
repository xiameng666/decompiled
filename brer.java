import java.util.concurrent.Callable;

abstract class brer implements Callable {
    public abstract void a();

    @Override
    public final Object call() {
        this.a();
        return null;
    }
}

