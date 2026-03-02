import j..util.Objects;
import java.util.concurrent.Callable;

final class tyd implements Callable {
    final tyi a;

    public tyd(tyi tyi0) {
        Objects.requireNonNull(tyi0);
        this.a = tyi0;
        super();
    }

    @Override
    public final Object call() {
        tyi tyi0 = this.a;
        synchronized(tyi0) {
            if(tyi0.f == null) {
                return null;
            }
            tyi0.h();
            if(tyi0.i()) {
                tyi0.f();
                tyi0.h = 0;
            }
        }
        return null;
    }
}

