import java.util.concurrent.Callable;

public final class bmmj implements Callable {
    public final bmmn a;
    public final blzd b;

    public bmmj(bmmn bmmn0, blzd blzd0) {
        this.a = bmmn0;
        this.b = blzd0;
    }

    @Override
    public final Object call() {
        return this.a.i.a(this.b);
    }
}

