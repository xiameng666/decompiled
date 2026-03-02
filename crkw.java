import com.google.android.gms.measurement.internal.AppMetadata;

public final class crkw implements Runnable {
    public final AppMetadata a;
    public final crih b;

    public crkw(crih crih0, AppMetadata appMetadata0) {
        this.b = crih0;
        this.a = appMetadata0;
    }

    @Override
    public final void run() {
        this.b.a.F();
        this.b.a.ab(this.a);
    }
}

