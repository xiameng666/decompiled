import j..util.Objects;
import java.io.IOException;

final class arht implements gmbg {
    final long a;
    final asbg b;
    final arhv c;

    public arht(arhv arhv0, long v, asbg asbg0) {
        this.a = v;
        this.b = asbg0;
        Objects.requireNonNull(arhv0);
        this.c = arhv0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof IOException)) {
            arhv arhv0 = this.c;
            if(!arhv0.j.isEmpty() || !arhv0.h.isEmpty()) {
                arhs arhs0 = new arhs(this, this.b);
                arhv0.n.execute(arhs0);
                return;
            }
        }
        arhv.a.f("Streaming batch failed due to interruption the batchId is %d and the error is: %s", new Object[]{((long)this.a), throwable0});
        this.c.i.set(true);
        this.c.d.shutdownNow();
        this.c.e.shutdownNow();
        this.c.j.clear();
        this.c.h.clear();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        arhv.a.h("Streaming completed successfully for batchId: %d", new Object[]{((long)this.a)});
    }
}

