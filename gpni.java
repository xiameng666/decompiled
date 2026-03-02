import java.util.logging.Level;

public final class gpni extends gguy {
    private final gged_interceptors a;

    public gpni(String s, gged_interceptors gged0) {
        super(s);
        this.a = gged0;
    }

    @Override  // ggtx
    public final void b(ggtu ggtu0) {
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.a;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            ggtx ggtx0 = (ggtx)gged0.get(v);
            if(ggtu0.h() || ggtx0.c(ggtu0.g())) {
                ggtx0.b(ggtu0);
            }
        }
    }

    @Override  // ggtx
    public final boolean c(Level level0) {
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.a;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            if(((ggtx)gged0.get(v)).c(level0)) {
                return true;
            }
        }
        return false;
    }
}

