import java.util.List;
import java.util.concurrent.Callable;

public final class blkm implements Callable {
    public final List a;

    public blkm(List list0) {
        this.a = list0;
    }

    @Override
    public final Object call() {
        ggdy ggdy0 = new ggdy();
        for(Object object0: this.a) {
            ggdy0.k(((Iterable)gmbu.r(((gmcd)object0))));
        }
        return ggdy0.h();
    }
}

