import android.util.Pair;
import java.util.concurrent.Callable;

public final class bmmr implements Callable {
    public final long a;

    public bmmr(long v) {
        this.a = v;
    }

    @Override
    public final Object call() {
        return Pair.create(Long.valueOf(this.a), Long.valueOf(0x3FL));
    }
}

