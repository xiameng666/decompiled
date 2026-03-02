import java.util.concurrent.Callable;

public final class aqnd implements Callable {
    public final aqfx a;
    public final aqvd b;
    public final aqnb c;

    public aqnd(aqnb aqnb0, aqfx aqfx0, aqvd aqvd0) {
        this.c = aqnb0;
        this.a = aqfx0;
        this.b = aqvd0;
    }

    @Override
    public final Object call() {
        int v = 0;
        while(true) {
            gged_interceptors gged0 = this.c.c;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            aqni aqni0 = (aqni)gged0.get(v);
            ++v;
            if(aqni0.c().equals(this.a)) {
                return aqni0.d(this.b);
            }
        }
        return gfqx.a;
    }
}

