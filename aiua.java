import java.util.concurrent.Callable;

public final class aiua implements Callable {
    public final aivp a;
    public final long b;

    public aiua(aivp aivp0, long v) {
        this.a = aivp0;
        this.b = v;
    }

    @Override
    public final Object call() {
        aivq aivq0 = aivr.a();
        aivq0.b(this.b);
        aivq0.b = 2;
        aivq0.c = 2;
        aivr aivr0 = aivq0.a();
        return this.a.a(aivr0);
    }
}

