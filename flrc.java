import j..util.Objects;
import java.util.Random;

public final class flrc implements gmbg {
    final flrd a;
    public final flva b;
    private final Random c;
    private int d;
    private long e;
    private final gmcu f;

    public flrc(flrd flrd0, flva flva0, gmcu gmcu0) {
        Objects.requireNonNull(flrd0);
        this.a = flrd0;
        super();
        this.c = new Random();
        this.d = 0;
        this.e = 0L;
        this.b = flva0;
        this.f = gmcu0;
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        long v = this.d == 0 ? this.b.a.a.f : Math.min(((long)(((double)this.e) * this.b.a.a.g)), this.b.a.a.e);
        long v1 = (long)this.c.nextInt(this.b.a.a.h);
        if(this.d < this.b.a.a.d && flrd.a(iapk.d(throwable0))) {
            long v2 = v + v1;
            ++this.d;
            this.e = v2;
            flrb flrb0 = new flrb(this, this);
            this.a.a.postDelayed(flrb0, v2);
            return;
        }
        this.f.r(throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.f.q(object0);
    }
}

