import java.util.Set;
import java.util.logging.Level;

public final class ggvm implements ggva {
    public final String a;
    public final boolean b;
    public final Level c;
    public final Set d;
    public final ggui e;
    public final int f;

    private ggvm() {
        this("", true, 2, Level.ALL, ggvo.a, ggvo.b);
    }

    public ggvm(String s, boolean z, int v, Level level0, Set set0, ggui ggui0) {
        this.a = s;
        this.b = z;
        this.f = 2;
        this.c = level0;
        this.d = set0;
        this.e = ggui0;
    }

    @Override  // ggva
    public final ggtx a(String s) {
        return new ggvo(this.a, s, this.b, 2, this.c, this.d, this.e);
    }
}

