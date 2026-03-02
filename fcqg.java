import java.util.concurrent.atomic.AtomicLong;

public final class fcqg implements glzn {
    public final fcrb a;
    public final glzn b;
    public final giay c;

    public fcqg(fcrb fcrb0, glzn glzn0, giay giay0) {
        this.a = fcrb0;
        this.b = glzn0;
        this.c = giay0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0 = this.b.a(object0);
        gmbu.t(gmcd0, new fcra(this.c, new AtomicLong(System.currentTimeMillis()), this.a.j), this.a.h);
        return gmcd0;
    }
}

