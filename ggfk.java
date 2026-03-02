import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ggfk {
    public final List a;

    public ggfk() {
        this.a = new ArrayList();
    }

    public final ggfm a() {
        ggdy ggdy0 = new ggdy(this.a.size());
        Collections.sort(this.a, ggmq.a);
        gghb gghb0 = gghd.r(this.a.iterator());
        while(gghb0.hasNext()) {
            TimeRange ggmr0;
            for(ggmr0 = (TimeRange)gghb0.next(); gghb0.hasNext(); ggmr0 = ggmr0.o(((TimeRange)gghb0.next()))) {
                TimeRange ggmr1 = (TimeRange)gghb0.a();
                if(!ggmr0.w(ggmr1)) {
                    break;
                }
                gftb.m(ggmr0.k(ggmr1).x(), "Overlapping ranges not permitted but found %s overlapping %s", ggmr0, ggmr1);
            }
            ggdy0.i(ggmr0);
        }
        gged_interceptors gged0 = ggdy0.h();
        if(!gged0.isEmpty()) {
            return ((ggna)gged0).c != 1 || !((TimeRange)gggq.r(gged0)).equals(TimeRange.a) ? new ggfm(gged0) : ggfm.b;
        }
        return ggfm.a;
    }

    public final void b(TimeRange ggmr0) {
        gftb.f(((boolean)(ggmr0.x() ^ 1)), "range must not be empty, but was %s", ggmr0);
        this.a.add(ggmr0);
    }

    public final void c(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.b(((TimeRange)object0));
        }
    }
}

