import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class ggrv {
    public final ggtx b;

    protected ggrv(ggtx ggtx0) {
        ggwv.d(ggtx0, "backend");
        this.b = ggtx0;
    }

    public abstract ggsu f(Level arg1);

    public final ggsu h() {
        return this.f(Level.INFO);
    }

    public final ggsu i() {
        return this.f(Level.SEVERE);
    }

    public final ggsu j() {
        return this.f(Level.WARNING);
    }

    protected final String k() {
        return this.b.d();
    }

    public static void l(String s, ggtu ggtu0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Date date0 = new Date(TimeUnit.NANOSECONDS.toMillis(ggtu0.a()));
        stringBuilder0.append(new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ").format(date0));
        stringBuilder0.append(": logging error [");
        ggtw.a(1, ggtu0.b(), stringBuilder0);
        stringBuilder0.append("]: ");
        stringBuilder0.append(s);
        System.err.println(stringBuilder0);
        System.err.flush();
    }

    protected final boolean m(Level level0) {
        return this.b.c(level0);
    }
}

