import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class epum {
    public static final baun a;
    public static final epum b;
    public final Map c;

    static {
        epum.a = epul.b("AccountSessionStore");
        epum.b = new epum();
    }

    private epum() {
        this.c = DesugarCollections.synchronizedMap(new HashMap());
    }

    public final void a(String s, int v) {
        epum.a.j("clearAccount(package_name=%s, session_id=%d)", new Object[]{s, v});
        this.c.remove(s);
    }
}

