import java.util.UUID;

public final class buzw implements buzv {
    private final buzr a;

    static {
        bboh.b("SessionLifecycleManager", bbcu.fK);
    }

    public buzw(buzr buzr0, bvag bvag0) {
        ibuq.f(buzr0, "_sessionId");
        ibuq.f(bvag0, "sessionLifecycleService");
        super();
        this.a = buzr0;
    }

    @Override  // buzv
    public final String a() {
        buzr buzr0 = this.a;
        fgvt fgvt0 = buzr0.a;
        if(fgvt0.a() - buzr0.d >= ibzw.h(buzr0.b)) {
            buzr0.c = UUID.randomUUID().toString();
            buzr0.d = fgvt0.a();
        }
        String s = buzr0.c;
        if(s == null) {
            ibuq.j("sessionId");
            return null;
        }
        return s;
    }
}

