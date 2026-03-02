import android.util.Log;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public final class ggvo extends gguy {
    public static final Set a;
    public static final ggui b;
    public static final ggvm c;
    private final String d;
    private final Level e;
    private final Set f;
    private final ggui g;
    private final int h;

    static {
        Set set0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new ggsx[]{ggsj.a, ggto.a, ggtp.a})));
        ggvo.a = set0;
        ggui ggui0 = ggul.a(set0);
        ggvo.b = ggui0;
        ggvo.c = new ggvm("", true, 2, Level.ALL, set0, ggui0);
    }

    public ggvo(String s, String s1, boolean z, int v, Level level0, Set set0, ggui ggui0) {
        super(s1);
        this.d = ggvh.a(s, s1, z);
        this.h = 2;
        this.e = level0;
        this.f = set0;
        this.g = ggui0;
    }

    @Override  // ggtx
    public final void b(ggtu ggtu0) {
        ggvo.e(ggtu0, this.d, 2, this.e, this.f, this.g);
    }

    @Override  // ggtx
    public final boolean c(Level level0) {
        int v = ggvh.c(level0);
        return Log.isLoggable(this.d, v) || Log.isLoggable("all", v);
    }

    public static void e(ggtu ggtu0, String s, int v, Level level0, Set set0, ggui ggui0) {
        String s1;
        Boolean boolean0 = (Boolean)ggtu0.c().d(ggtp.a);
        if(boolean0 == null || !boolean0.booleanValue()) {
            ggus ggus0 = ggus.g(gguv.f(), ggtu0.c());
            boolean z = ggtu0.g().intValue() < level0.intValue();
            if(!z && !gguw.b(ggtu0, ggus0, set0)) {
                s1 = gguw.a(ggtu0);
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder();
                if(ggtw.a(2, ggtu0.b(), stringBuilder0)) {
                    stringBuilder0.append(" ");
                }
                if(z && ggtu0.d() != null) {
                    stringBuilder0.append("(REDACTED) ");
                    stringBuilder0.append(ggtu0.d().b);
                }
                else {
                    ggwq.c(ggtu0, stringBuilder0);
                    gguw.c(ggus0, ggui0, stringBuilder0);
                }
                s1 = stringBuilder0.toString();
            }
            Throwable throwable0 = (Throwable)ggtu0.c().d(ggsj.a);
            switch(ggvh.c(ggtu0.g())) {
                case 2: 
                case 3: {
                    break;
                }
                case 4: {
                    Log.i(s, s1, throwable0);
                    return;
                }
                case 5: {
                    Log.w(s, s1, throwable0);
                    return;
                }
                default: {
                    Log.e(s, s1, throwable0);
                }
            }
        }
    }
}

