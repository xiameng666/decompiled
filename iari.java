import java.util.concurrent.Callable;

public final class iari implements Callable {
    public final iarl a;
    public final int b;

    public iari(iarl iarl0, int v) {
        this.a = iarl0;
        this.b = v;
    }

    @Override
    public final Object call() {
        return this.a.b.a(this.b);
    }
}

