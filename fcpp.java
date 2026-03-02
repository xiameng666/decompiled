import java.util.concurrent.Callable;

public final class fcpp implements Callable {
    public final fcpu a;

    public fcpp(fcpu fcpu0) {
        this.a = fcpu0;
    }

    @Override
    public final Object call() {
        return this.a.b.b(this.a.d.a.name);
    }
}

