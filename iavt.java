import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

final class iavt implements Runnable {
    final long a;
    final String b;
    final iawh c;

    public iavt(iawh iawh0, long v) {
        this.a = v;
        this.b = "CallOptions";
        Objects.requireNonNull(iawh0);
        this.c = iawh0;
        super();
    }

    @Override
    public final void run() {
        long v = TimeUnit.SECONDS.toNanos(1L);
        long v1 = Math.abs(this.a) / v;
        long v2 = TimeUnit.SECONDS.toNanos(1L);
        long v3 = Math.abs(this.a) % v2;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a < 0L) {
            stringBuilder0.append("ClientCall started after ");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" deadline was exceeded. Deadline has been exceeded for ");
        }
        else {
            stringBuilder0.append("Deadline ");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" was exceeded after ");
        }
        stringBuilder0.append(v1);
        stringBuilder0.append(String.format(Locale.US, ".%09d", v3));
        stringBuilder0.append("s");
        this.c.g(iapk.f.f(stringBuilder0.toString()), true);
    }
}

