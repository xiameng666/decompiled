import android.content.Context;

public final class cizn {
    public static final int a;
    private static volatile gfsi b;
    private static cdpa c;

    static {
        gfus.a(((gful_cronetEngineProvider)new cizm()));
    }

    public static cdpa a(Context context0) {
        cdpa cdpa1;
        synchronized(cizn.class) {
            cdpa cdpa0 = cizn.c;
            if(cdpa0 != null) {
                return cdpa0;
            }
            if(cizn.b == null) {
                return cdpa.b;
            }
            cdpa1 = (cdpa)cizn.b.apply(context0);
            cizn.c = cdpa1;
        }
        return cdpa1;
    }

    public static void b(gfsi gfsi0) {
        synchronized(cizn.class) {
            if(!cizn.c()) {
                cizn.b = gfsi0;
            }
        }
    }

    public static boolean c() {
        return cizn.b != null;
    }
}

