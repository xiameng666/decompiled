import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public final class fvqp {
    public final fvsl a;
    public final fwyd b;
    public final fvrf c;
    public final fvqn d;
    private final fwzp e;
    private final Random f;
    private final fwzf g;
    private final int h;
    private long i;
    private long j;

    public fvqp(fwyd fwyd0, fwzp fwzp0, fvsl fvsl0, fvqn fvqn0, fvrf fvrf0) {
        Random random0 = new Random();
        super();
        this.i = -1L;
        this.j = -1L;
        this.b = fwyd0;
        this.e = fwzp0;
        this.g = fwzf.j;
        this.c = fvrf0;
        this.f = random0;
        this.a = fvsl0;
        this.h = (int)(fvsl0.a() / 6L);
        this.d = fvqn0;
    }

    public final fvuf a(long v, fvrb fvrb0) {
        if(v != this.i) {
            long v1 = v - this.b.a();
            this.e.c(this.g, 3, v1, fwzy.a);
            this.d.r(v);
            this.i = v;
            this.j = v1;
            new Date(v);
            return new fvuf(v1, fvrb0);
        }
        return new fvuf(((long)this.j), fvrb0);
    }

    public final fvuf b(Calendar calendar0, int v) {
        calendar0.getTime();
        fvsl fvsl0 = this.a;
        long v1 = fvsl.c(calendar0);
        int v2 = this.h;
        long v3 = fvsl0.b;
        long v4 = ((long)((6 - v) * v2)) + v3;
        if(v4 > v1) {
            v1 = v4;
        }
        else if(fvsl0.h(v1)) {
            v2 -= ((int)(v1 - v3)) % v2;
        }
        long v5 = (long)this.f.nextInt(v2);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(calendar0.getTime());
        fvsl.f(calendar1, v1 + v5);
        this.d.n();
        return this.a(calendar1.getTimeInMillis(), fvrb.a);
    }
}

