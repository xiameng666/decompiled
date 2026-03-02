import java.util.HashSet;
import java.util.Set;

public final class ObserverRegistry {
    public final Set a;

    public ObserverRegistry() {
        this.a = new HashSet();
    }

    public final void a(IFilterObserver gpyn0) {
        this.a.add(gpyn0);
    }

    public final void b(gpxm_Observation gpxm0) {
        for(Object object0: this.a) {
            ((IFilterObserver)object0).G(gpxm0);
        }
    }

    public final void c(double f, int v) {
        for(Object object0: this.a) {
            ((IFilterObserver)object0).aj(f, v);
        }
    }

    public final void d(long v, int v1) {
        for(Object object0: this.a) {
            ((IFilterObserver)object0).ak(v, v1);
        }
    }
}

