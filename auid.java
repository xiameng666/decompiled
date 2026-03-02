import j..util.Objects;
import java.util.Set;

public final class auid extends augk {
    final auie a;

    public auid(auie auie0) {
        Objects.requireNonNull(auie0);
        this.a = auie0;
        super();
    }

    @Override  // augk
    protected final void b() {
        auie auie0 = this.a;
        if(((Boolean)auie0.a.mr()).booleanValue()) {
            auia auia0 = auie0.c;
            if(auia0 != null) {
                synchronized(auia0.c) {
                    auia0.c.clear();
                }
            }
        }
    }

    @Override  // augk
    protected final void d() {
        Set set0 = this.a.c.h;
        Set set1 = this.a.b.n;
        set0.clear();
        if(set1 != null) {
            set0.addAll(set1);
        }
    }
}

