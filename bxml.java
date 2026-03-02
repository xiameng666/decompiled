import java.util.concurrent.Callable;

public final class bxml implements Callable {
    public final bxmu a;

    public bxml(bxmu bxmu0) {
        this.a = bxmu0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.a.j(this.a.b));
    }
}

