import java.util.HashMap;

public final class ciyr {
    private static final gful_cronetEngineProvider a;
    private final HashMap b;

    static {
        ciyr.a = gfus.a(((gful_cronetEngineProvider)new ciyq()));
    }

    public ciyr() {
        this.b = new HashMap();
    }

    public final ciyp a(hfke hfke0) {
        ciyp ciyp1;
        synchronized(this) {
            HashMap hashMap0 = this.b;
            if(!hashMap0.containsKey(hfke0)) {
                return new ciyg(hfke0);
            }
            ciyp1 = (ciyp)((gful_cronetEngineProvider)hashMap0.get(hfke0)).mr();
        }
        return ciyp1;
    }

    public static ciyr b() {
        return (ciyr)ciyr.a.mr();
    }

    public final void c(gful_cronetEngineProvider gful0) {
        synchronized(this) {
            if(!((ciyp)gful0.mr()).b().a.isEmpty()) {
                hfke hfke0 = (hfke)ggfp.G(((ciyp)gful0.mr()).b().a).om().next();
                HashMap hashMap0 = this.b;
                if(!hashMap0.containsKey(hfke0)) {
                    hashMap0.put(hfke0, gful0);
                }
            }
        }
    }
}

