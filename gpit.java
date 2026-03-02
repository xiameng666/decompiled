import java.util.concurrent.Callable;

public final class gpit implements Callable {
    public final gpiw a;
    public final gpiv b;

    public gpit(gpiw gpiw0, gpiv gpiv0) {
        this.a = gpiw0;
        this.b = gpiv0;
    }

    @Override
    public final Object call() {
        synchronized(this.a.a) {
            gphy gphy0 = this.a.c(this.b);
            this.a.e(gphy0);
        }
        return this.a.d(this.b);
    }
}

