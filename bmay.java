import java.util.concurrent.Callable;

public final class bmay implements Callable {
    public final bmaz a;
    public final byte[] b;

    public bmay(bmaz bmaz0, byte[] arr_b) {
        this.a = bmaz0;
        this.b = arr_b;
    }

    @Override
    public final Object call() {
        this.a.c.b();
        return this.a.c.a(this.b);
    }
}

