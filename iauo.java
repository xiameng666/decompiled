import java.text.MessageFormat;
import java.util.logging.Level;

final class iauo extends iakt {
    private final iaup a;

    public iauo(iaup iaup0, ibfr ibfr0) {
        gftb.z(iaup0, "tracer");
        this.a = iaup0;
        gftb.z(ibfr0, "time");
    }

    @Override  // iakt
    public final void a(int v, String s) {
        Level level0 = iauo.c(v);
        if(iaup.a.isLoggable(level0)) {
            iaup.a(this.a.c, level0, s);
        }
    }

    @Override  // iakt
    public final void b(int v, String s, Object[] arr_object) {
        Level level0 = iauo.c(v);
        this.a(v, (iaup.a.isLoggable(level0) ? MessageFormat.format(s, arr_object) : null));
    }

    public static Level c(int v) {
        switch(v - 1) {
            case 1: {
                return Level.FINER;
            }
            case 2: 
            case 3: {
                return Level.FINE;
            }
            default: {
                return Level.FINEST;
            }
        }
    }

    private final void d(int v) {
        if(v != 1) {
        }
    }
}

