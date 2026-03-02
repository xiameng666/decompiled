import java.util.concurrent.Callable;

public final class flex implements Callable {
    public final flfv a;

    public flex(flfv flfv0) {
        this.a = flfv0;
    }

    @Override
    public final Object call() {
        synchronized(this.a) {
            this.a.n = false;
        }
        return null;
    }
}

