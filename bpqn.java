import java.util.concurrent.Callable;

public final class bpqn implements Callable {
    public final gmcd a;
    public final gmcd b;

    public bpqn(gmcd gmcd0, gmcd gmcd1) {
        this.a = gmcd0;
        this.b = gmcd1;
    }

    @Override
    public final Object call() {
        ggdy ggdy0 = new ggdy();
        ggdy0.k(((Iterable)gmbu.r(this.a)));
        ggdy0.k(((Iterable)gmbu.r(this.b)));
        return ggdy0.h();
    }
}

