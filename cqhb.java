import java.util.Set;

public final class cqhb implements cqgt {
    private final Set a;

    public cqhb(Set set0) {
        this.a = set0;
    }

    @Override  // cqgt
    public final gmcd a(cqgz cqgz0, flad flad0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: this.a) {
            ggdy0.i(((cqhc)object0).a());
        }
        gged_interceptors gged0 = ggdy0.h();
        return gmbu.a(gged0).a(new cqha(gged0), gmap.a);
    }
}

