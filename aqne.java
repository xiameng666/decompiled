import java.util.concurrent.Callable;

public final class aqne implements Callable {
    public final aqvd a;
    public final aqnb b;

    public aqne(aqnb aqnb0, aqvd aqvd0) {
        this.b = aqnb0;
        this.a = aqvd0;
    }

    @Override
    public final Object call() {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.b.c;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            aqni aqni0 = (aqni)gged0.get(v);
            if(!aqni0.b(this.a).c) {
                ggdy0.i(aqni0.c());
            }
        }
        return ggdy0.h();
    }
}

