import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class aidp extends ahwu {
    final evqp a;

    public aidp(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // ahwu
    public final void b(String s) {
        azzf.b((s == null ? new Status(3006) : Status.b), s, this.a);
    }
}

