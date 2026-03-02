import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffke extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffke(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("flushBatchedData");
    }

    @Override  // ffee
    public final void a() {
        this.e.G.b(this.c);
        Status status0 = new Status(0);
        this.d.a(status0);
    }
}

