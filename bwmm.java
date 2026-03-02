import j..util.Objects;
import java.util.HashSet;
import java.util.Set;

public final class bwmm {
    public final bwmx a;

    public bwmm(bwmx bwmx0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super();
    }

    public final Set a(bwud bwud0) {
        gged_interceptors gged0 = this.a.f().J(bwud0, 2);
        int v = ((ggna)gged0).c;
        Set set0 = new HashSet(v);
        for(int v1 = 0; v1 < v; ++v1) {
            bwnq bwnq0 = ((bwnr)gged0.get(v1)).c;
            if(bwnq0 == null) {
                bwnq0 = bwnq.a;
            }
            ((HashSet)set0).add(bwnq0.d);
        }
        return set0;
    }
}

