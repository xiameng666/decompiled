import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class gyfz {
    public final long a;
    public int b;
    public int c;
    private final int d;

    public gyfz(long v, int v1) {
        this.a = v;
        this.d = v1;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ENGLISH;
        String s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH).format(new Date(this.a));
        return this.b == 0 ? String.format(locale0, "%s - %dms %d results with %s", s, ((long)(System.currentTimeMillis() - this.a)), ((int)this.c), higu.a(this.d)) : String.format(locale0, "%s - %dms %d results with %s", s, ((long)this.b), ((int)this.c), higu.a(this.d));
    }
}

