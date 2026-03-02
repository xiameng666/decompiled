import j..util.Map.-EL;
import j..util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class fxlp extends fxpd {
    public static final bboh a;
    private static final AtomicReference b;

    static {
        fxlp.a = bboh.c("EAlert", bbcu.g, "WearCoord");
        fxlp.b = new AtomicReference();
    }

    public fxlp(fced fced0) {
        super("WearCoordStage");
        fxlo fxlo0 = new fxlo(fced0);
        fxlp.b.set(fxlo0);
    }

    @Override  // fxpd
    public final void a() {
        synchronized(this) {
            fxlo fxlo0 = (fxlo)fxlp.b.get();
            if(huqb.L() || huqb.K()) {
                fxlo0.a("ealert_safety_info_support");
                fxlo0.a("ealert_support");
                evql evql0 = fxlo0.a.g("ealert_safety_info_support", 1);
                evql0.b(new fxlj(fxlo0));
                evql0.A(new fxlk());
                evql evql1 = fxlo0.a.g("ealert_support", 1);
                evql1.b(new fxlj(fxlo0));
                evql1.A(new fxll());
            }
            this.j();
        }
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        synchronized(this) {
            fxlo fxlo0 = (fxlo)fxlp.b.get();
            fxlo0.c("ealert_safety_info_support");
            fxlo0.c("ealert_support");
            fxlo0.b = Optional.empty();
            fxlo0.c.clear();
            fxlo0.d.clear();
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        return false;
    }

    public final Set e() {
        return (Set)Map.-EL.getOrDefault(((fxlo)fxlp.b.get()).c, "ealert_support", new HashSet());
    }
}

