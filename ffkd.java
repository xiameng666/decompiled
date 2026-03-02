import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import j..util.Objects;

final class ffkd extends ffee {
    final ConnectionDelayConfig c;
    final fdiy d;
    final fflv e;

    public ffkd(fflv fflv0, ConnectionDelayConfig connectionDelayConfig0, fdiy fdiy0) {
        this.c = connectionDelayConfig0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("updateDelayConfig");
    }

    @Override  // ffee
    public final void a() {
        this.e.G.c(this.c);
        Status status0 = new Status(0);
        this.d.a(status0);
    }
}

