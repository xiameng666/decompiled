import java.util.HashMap;
import java.util.Map;

public final class atmn {
    public static final baun a;
    public final Map b;
    private final aqjk c;

    static {
        atmn.a = aqql.a("DenylistedInfoRequestProcessor");
    }

    public atmn(aqjk aqjk0) {
        this.b = new HashMap();
        this.c = aqjk0;
    }

    public final void a(aqfo aqfo0) {
        batl.s(aqfo0);
        for(Object object0: aqfo0.i) {
            this.b.put(((aqfh)object0).b, ((aqfh)object0));
            ggdy ggdy0 = new ggdy();
            ggdy0.k(((aqfh)object0).c);
            ggdy0.k(((aqfh)object0).d);
            gged_interceptors gged0 = ggdy0.h();
            atmn.a.h("Excluding keys with backup manager for package: " + ((aqfh)object0).b, new Object[0]);
            this.c.a.excludeKeysFromRestore(((aqfh)object0).b, gged0);
        }
    }
}

