import java.util.concurrent.Callable;

public final class gykv implements Callable {
    public final gykt a;
    public final gyim b;

    public gykv(gykt gykt0, gyim gyim0) {
        this.a = gykt0;
        this.b = gyim0;
    }

    @Override
    public final Object call() {
        return this.a.b(this.b);
    }
}

