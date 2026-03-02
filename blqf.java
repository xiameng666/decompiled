import java.util.List;
import java.util.concurrent.Callable;

public final class blqf implements Callable {
    public final gmcd a;
    public final gmcd b;
    public final ggeo c;

    public blqf(gmcd gmcd0, gmcd gmcd1, ggeo ggeo0) {
        this.a = gmcd0;
        this.b = gmcd1;
        this.c = ggeo0;
    }

    @Override
    public final Object call() {
        gged_interceptors gged0 = (gged_interceptors)gmbu.r(this.a);
        Object object0 = (gged_interceptors)gmbu.r(this.b);
        if(((gged_interceptors)object0).isEmpty()) {
            return object0;
        }
        ggek ggek0 = new ggek();
        ggdy ggdy0 = new ggdy();
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            foec foec0 = (foec)((List)object0).get(v1);
            ggek0.i(foec0.a, foec0);
            if(!this.c.containsKey(foec0.a)) {
                ggdy0.i(foec0);
            }
        }
        return ggch.f(ggch.j(gged0).l(new blqj(ggek0)).i(new blqk()).l(new blql()).n(), ggdy0.h()).n();
    }
}

