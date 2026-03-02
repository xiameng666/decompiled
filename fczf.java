import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class fczf implements Runnable {
    final NodeParcelable a;
    final fczl b;

    public fczf(fczl fczl0, NodeParcelable nodeParcelable0) {
        this.a = nodeParcelable0;
        Objects.requireNonNull(fczl0);
        this.b = fczl0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.d(this.a);
    }
}

