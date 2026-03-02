import com.google.android.chimera.android.Activity;
import java.util.function.Consumer;

public final class bxoh extends lsb implements lom {
    private static final Long a;
    private long b;
    private final Consumer c;
    private final long d;
    private long e;

    static {
        bxoh.a = (long)-1L;
    }

    public bxoh(Consumer consumer0) {
        this.b = -1L;
        this.e = 0L;
        this.c = consumer0;
        this.d = System.currentTimeMillis();
    }

    public static void a(xob xob0, Consumer consumer0) {
        bxoh bxoh0 = (bxoh)new lso(xob0, new bxog(consumer0)).a(bxoh.class);
        xob0.getLifecycle().c(bxoh0);
    }

    private final void b() {
        bxoj bxoj0 = new bxoj(this.d, System.currentTimeMillis(), this.e, null);
        this.c.accept(bxoj0);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lps0.getLifecycle().d(this);
        if((lps0 instanceof Activity)) {
            if(((Activity)lps0).isFinishing()) {
                this.b();
            }
        }
        else if(lps0.getLifecycle().a().equals(lpf.a)) {
            this.b();
        }
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        this.e += System.currentTimeMillis() - this.b;
        this.b = -1L;
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        if(this.b == -1L) {
            this.b = System.currentTimeMillis();
        }
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

