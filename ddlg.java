import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ddlg {
    public final ddlf a;
    public final cuuo b;
    public final Runnable c;
    public ScheduledFuture d;
    public boolean e;
    final ddli f;

    public ddlg(ddli ddli0, Runnable runnable0, long v) {
        Objects.requireNonNull(ddli0);
        this.f = ddli0;
        super();
        this.a = new ddlf(0, 0, ddlh.c, null, null, null, true, false);
        this.b = new cuuo(((int)hvqs.a.aT().bQ()), ((int)hvqs.a.aT().bO()));
        this.c = runnable0;
        this.d = ((cuuh)ddli0.a).g(runnable0, v, TimeUnit.MILLISECONDS);
    }

    final ddlh a() {
        return this.a.c;
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "SightedBlePeripheral<advertisement: %s, weightedAverage: %s>", this.a, this.b);
    }
}

