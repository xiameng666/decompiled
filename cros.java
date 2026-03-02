import android.content.ComponentName;
import j..util.Objects;

final class cros implements Runnable {
    final ComponentName a;
    final croy b;

    public cros(croy croy0, ComponentName componentName0) {
        this.a = componentName0;
        Objects.requireNonNull(croy0);
        this.b = croy0;
        super();
    }

    @Override
    public final void run() {
        this.b.c.v(this.a);
    }
}

