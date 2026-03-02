import java.util.concurrent.Callable;

public final class gyje implements Callable {
    public final gyjj a;
    public final gxuf b;
    public final gyjd c;
    public final gyim d;

    public gyje(gyjj gyjj0, gxuf gxuf0, gyjd gyjd0, gyim gyim0) {
        this.a = gyjj0;
        this.b = gxuf0;
        this.c = gyjd0;
        this.d = gyim0;
    }

    @Override
    public final Object call() {
        this.b.b();
        this.a.d.set(1);
        this.c.b(this.d, this.a.f);
        return null;
    }
}

