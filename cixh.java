import java.util.concurrent.Callable;

public final class cixh implements Callable {
    public final gged_interceptors a;

    public cixh(gged_interceptors gged0) {
        this.a = gged0;
    }

    @Override
    public final Object call() {
        int v = 0;
        while(true) {
            gged_interceptors gged0 = this.a;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            boolean z = ((Boolean)gmbu.r(((gmcd)gged0.get(v)))).booleanValue();
            ++v;
            if(z) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}

