import java.util.HashMap;
import java.util.Map;

public final class fxjk {
    public final fxiz a;
    public final fxje[] b;
    public final fxjb c;
    public final fxje d;
    public final fxjd e;
    public final fxjm f;
    public final fxmt g;
    public final Map h;
    public static final int i;

    static {
        bboh.c("EAlert", bbcu.g, "Handler");
    }

    public fxjk(fxiz fxiz0, fxjb fxjb0, fxjm fxjm0, fxmt fxmt0) {
        fxjj fxjj0 = new fxjj(this);
        this.d = fxjj0;
        this.e = new fxjd(fxjj0, -1000000L);
        this.h = new HashMap();
        this.a = fxiz0;
        this.c = fxjb0;
        this.f = fxjm0;
        this.g = fxmt0;
        this.b = new fxje[]{new fxjf(this, huqb.a.s().c()), new fxjg(this, huqb.a.s().e()), new fxjh(this, huqb.a.s().g()), new fxji(this, huqb.a.s().i()), fxjj0};
    }
}

