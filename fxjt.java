import android.content.Context;
import java.security.SecureRandom;
import java.util.function.Supplier;

public final class fxjt {
    protected static final bboh a;
    public static long b;
    public static fxjt c;
    protected final Context d;
    protected final SecureRandom e;
    protected fxpk f;
    public fxle g;
    protected fxlp h;
    protected fxpp i;
    protected fxhk j;

    static {
        fxjt.a = bboh.b("EAlert", bbcu.g);
        fxjt.b = 0L;
    }

    public fxjt(Context context0) {
        SecureRandom secureRandom0 = new SecureRandom();
        super();
        this.d = context0;
        this.e = secureRandom0;
    }

    public final void a() {
        fxpk fxpk0 = this.f;
        if(fxpk0 != null) {
            fxpk0.d(1);
        }
    }

    public static Supplier b() {
        return fxjt.c != null && fxjt.c.h != null ? new fxjz() : new fxjy();
    }
}

