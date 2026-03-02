import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;

final class crlk implements Runnable {
    final AppMetadata a;
    final crih b;

    public crlk(crih crih0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.F();
        this.b.a.E();
        this.b.a.G();
        batl.q(this.a.a);
        this.b.a.j(this.a);
    }
}

