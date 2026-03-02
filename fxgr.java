import android.content.Context;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public final class fxgr {
    public static final bboh a;
    public static fxgr b;
    public static final AtomicReference c;
    public static ibnf d;
    public final Context e;
    public final bbng f;
    public final Random g;
    public fxpk h;

    static {
        fxgr.a = bboh.b("EQMon", bbcu.g);
        fxgr.c = new AtomicReference();
        fxgr.d = new fxgc();
    }

    public fxgr(Context context0) {
        this.f = new fxpc();
        this.g = new SecureRandom();
        this.e = context0;
    }

    public static void a(gxoo gxoo0) {
        fxgr.c.set(gxoo0);
    }
}

