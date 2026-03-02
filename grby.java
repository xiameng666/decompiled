import java.util.concurrent.Callable;

public final class grby implements Callable {
    public final String a;
    public final grdf b;
    public final grce c;

    public grby(String s, grdf grdf0, grce grce0) {
        this.a = s;
        this.b = grdf0;
        this.c = grce0;
    }

    @Override
    public final Object call() {
        byte[] arr_b = grcj.d(this.a, this.b);
        return hfxt.a(this.c.a.b(arr_b));
    }
}

