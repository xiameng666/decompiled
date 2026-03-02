import android.media.ImageWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

final class awj {
    public ImageWriter a;
    public final AtomicBoolean b;
    public final Executor c;

    public awj(Executor executor0) {
        this.b = new AtomicBoolean(true);
        this.c = executor0;
    }

    public final void a() {
        this.b.set(false);
    }
}

