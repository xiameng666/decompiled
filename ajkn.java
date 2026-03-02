import java.util.concurrent.Callable;

public final class ajkn implements Callable {
    public final ygd a;
    public final String b;

    public ajkn(ygd ygd0, String s) {
        this.a = ygd0;
        this.b = s;
    }

    @Override
    public final Object call() {
        return this.a.c(this.b);
    }
}

