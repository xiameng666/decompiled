import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zmh implements Callable {
    public final zmi a;

    public zmh(zmi zmi0) {
        this.a = zmi0;
    }

    @Override
    public final Object call() {
        HashMap hashMap0 = new HashMap();
        this.a.l(this.a.c, System.currentTimeMillis(), hashMap0, this.a.l);
        return gged_interceptors.i(hashMap0.values());
    }
}

