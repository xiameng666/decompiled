import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

final class azyt implements Runnable {
    final azyv a;

    public azyt(azyv azyv0) {
        Objects.requireNonNull(azyv0);
        this.a = azyv0;
        super();
    }

    @Override
    public final void run() {
        this.a.f.b(new ConnectionResult(4));
    }
}

