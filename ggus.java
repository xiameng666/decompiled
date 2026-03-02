import java.util.Set;

public abstract class ggus {
    private static final ggus a;

    static {
        ggus.a = new ggum();
    }

    public abstract int a();

    public abstract Object b(ggsx arg1);

    public abstract Set c();

    public abstract void d(ggui arg1, Object arg2);

    public static ggus g(ggub ggub0, ggub ggub1) {
        int v = ggub1.b();
        if(v == 0) {
            return ggus.a;
        }
        return v <= 28 ? new gguq(ggub0, ggub1) : new ggur(ggub0, ggub1);
    }
}

