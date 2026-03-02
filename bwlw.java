import j..time.Instant;
import java.util.List;

public final class bwlw implements glzn {
    public final bwmx a;
    public final List b;
    public final String c;
    public final gmcd d;

    public bwlw(bwmx bwmx0, List list0, String s, gmcd gmcd0) {
        this.a = bwmx0;
        this.b = list0;
        this.c = s;
        this.d = gmcd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        aga aga0 = bxca.a(this.b);
        long v = Instant.now().toEpochMilli();
        bxbw.a(((fkno)object0), aga0, this.a.r, v, this.c);
        return this.d;
    }
}

