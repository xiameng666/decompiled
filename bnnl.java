import dagger.Reusable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Reusable
public final class bnnl {
    public static final bboh a;
    public final ayvf b;
    private final cmlc c;

    static {
        bnnl.a = bboh.b("CheckboxGuardedCounters", bbcu.eD);
    }

    public bnnl(ayvf ayvf0, cmkz cmkz0, Executor executor0) {
        this.b = ayvf0;
        this.c = new cmlc(cmkz0, executor0);
    }

    public final void a(kar kar0) {
        if(!hsww.a.b().h()) {
            ((ggtj)((ggtj)((ggtj)bnnl.a.h()).o(10, TimeUnit.MINUTES)).ar(4523)).x("Clearcut Counters collection is disabled.");
            return;
        }
        bnnj bnnj0 = new bnnj(this, kar0);
        this.c.a(bnnj0).A(new bnnk());
    }
}

