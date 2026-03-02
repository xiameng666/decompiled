import java.util.List;
import java.util.concurrent.Callable;

public final class bvry implements Callable {
    public final List a;
    public final gqpf b;
    public final String c;

    public bvry(List list0, gqpf gqpf0, String s) {
        this.a = list0;
        this.b = gqpf0;
        this.c = s;
    }

    @Override
    public final Object call() {
        ggdy ggdy0 = new ggdy();
        long v = 0L;
        ggqk ggqk0 = ((gged_interceptors)this.a).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            bvsc bvsc0 = (bvsc)((gmcd)object0).get();
            if(bvsc0.a) {
                ++v;
            }
            ggdy0.k(bvsc0.b);
        }
        return bvsd.a((this.b.c == null ? gqpm.a : this.b.c)).s(Long.valueOf(v)) ? bvsc.c() : bvsc.b(this.c, ggdy0);
    }
}

