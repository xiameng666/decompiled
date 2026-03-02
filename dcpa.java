import java.util.Locale;
import java.util.logging.Level;

public final class dcpa implements Runnable {
    public final dcpn a;
    public final int b;

    public dcpa(dcpn dcpn0, int v) {
        this.a = dcpn0;
        this.b = v;
    }

    @Override
    public final void run() {
        int v = this.b - 1;
        dcpn dcpn0 = this.a;
        cunr cunr0 = dcpn0.e();
        if(cunr0 == null) {
            Integer integer0 = v;
            String s = String.format(Locale.US, "Failed to log test code %d, due to clearcutLogger is null.", integer0);
            dcvz.a.b().h("Failed to log test code %d, due to clearcutLogger is null.", integer0);
            dcpn0.f.a(Level.INFO, s);
            return;
        }
        cunr0.c.c(v);
        dcvz.a.d().h("Successfully logged test code: %d", Integer.valueOf(v));
    }
}

