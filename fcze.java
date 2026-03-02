import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class fcze implements Runnable {
    final NodeParcelable a;
    final fczl b;

    public fcze(fczl fczl0, NodeParcelable nodeParcelable0) {
        this.a = nodeParcelable0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.c(this.a);
    }
}

