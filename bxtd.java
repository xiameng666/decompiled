import java.util.concurrent.Callable;

public final class bxtd implements Callable {
    public final bxtn a;
    public final bxsf b;

    public bxtd(bxtn bxtn0, bxsf bxsf0) {
        this.a = bxtn0;
        this.b = bxsf0;
    }

    @Override
    public final Object call() {
        this.b.c(this.a.a);
        return null;
    }
}

