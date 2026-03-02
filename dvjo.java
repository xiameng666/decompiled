import java.util.concurrent.Callable;

public final class dvjo implements Callable {
    public final dvjq a;

    public dvjo(dvjq dvjq0) {
        this.a = dvjq0;
    }

    @Override
    public final Object call() {
        return this.a.a.c.a();
    }
}

