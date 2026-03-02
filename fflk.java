import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class fflk extends ffee {
    final fdiy c;
    final fflv d;

    public fflk(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("flushLogs");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.d.D);
        this.d.D.c.h();
        Status status0 = new Status(0);
        this.c.a(status0);
    }
}

