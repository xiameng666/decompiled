import java.util.concurrent.atomic.AtomicReference;

public final class fkrc implements glzn {
    public final fkre a;
    public final AtomicReference b;
    public final int c;

    public fkrc(fkre fkre0, AtomicReference atomicReference0, int v) {
        this.a = fkre0;
        this.b = atomicReference0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        flad flad0 = (flad)this.b.get();
        if(flad0 != null) {
            if(((fktz)object0).b) {
                synchronized(flad0.a) {
                    flad0.e();
                }
                return gdtf.j(gmbx.a, new fkqq(this.a, ((fktz)object0), flad0, this.c), gmap.a);
            }
            return gdtf.j(flad0.d(), new fkqq(this.a, ((fktz)object0), flad0, this.c), gmap.a);
        }
        return gmbx.a;
    }
}

