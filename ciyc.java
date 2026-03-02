public final class ciyc {
    public static final int a;
    private static final gful_cronetEngineProvider b;
    private static final gful_cronetEngineProvider c;
    private static final gful_cronetEngineProvider d;
    private static final gful_cronetEngineProvider e;
    private static final gful_cronetEngineProvider f;
    private static final gful_cronetEngineProvider g;
    private static final gful_cronetEngineProvider h;
    private static final gful_cronetEngineProvider i;
    private static final gful_cronetEngineProvider j;
    private static final gful_cronetEngineProvider k;
    private static final gful_cronetEngineProvider l;
    private static final gful_cronetEngineProvider m;

    static {
        ciyc.b = gfus.a(((gful_cronetEngineProvider)new cixv()));
        ciyc.c = gfus.a(((gful_cronetEngineProvider)new cixy()));
        ciyc.d = gfus.a(((gful_cronetEngineProvider)new cixz()));
        ciyc.e = gfus.a(((gful_cronetEngineProvider)new ciya()));
        ciyc.f = gfus.a(((gful_cronetEngineProvider)new ciyb()));
        ciyc.g = gfus.a(((gful_cronetEngineProvider)new cixo()));
        ciyc.h = gfus.a(((gful_cronetEngineProvider)new cixp()));
        ciyc.i = gfus.a(((gful_cronetEngineProvider)new cixq()));
        ciyc.j = gfus.a(((gful_cronetEngineProvider)new cixr()));
        ciyc.k = gfus.a(((gful_cronetEngineProvider)new cixs()));
        ciyc.l = gfus.a(((gful_cronetEngineProvider)new cixw()));
        ciyc.m = gfus.a(((gful_cronetEngineProvider)new cixx()));
    }

    public static ciyp a(hfke hfke0, String s) {
        int v = hfke0.a - 1;
        switch(v) {
            case 0: {
                return (ciyp)ciyc.c.mr();
            }
            case 1: {
                return (ciyp)ciyc.d.mr();
            }
            case 2: {
                return (ciyp)ciyc.b.mr();
            }
            case 5: {
                return (ciyp)ciyc.e.mr();
            }
            case 7: {
                return (ciyp)ciyc.k.mr();
            }
            case 8: {
                return (ciyp)ciyc.j.mr();
            }
            case 14: {
                return (ciyp)ciyc.i.mr();
            }
            case 16: {
                return (ciyp)new cixt(s).mr();
            }
            case 25: {
                return (ciyp)ciyc.m.mr();
            }
            case 26: {
                return (ciyp)ciyc.l.mr();
            }
            case 74: {
                return (ciyp)ciyc.f.mr();
            }
            case 75: {
                return (ciyp)new cixn(s).mr();
            }
            case 76: {
                return (ciyp)ciyc.b.mr();
            }
            case 80: {
                return (ciyp)ciyc.g.mr();
            }
            case 81: {
                return (ciyp)ciyc.h.mr();
            }
            case 83: {
                return (ciyp)new cixu(s).mr();
            }
            default: {
                throw new IllegalArgumentException(String.format("A new NccCheck implementation is required for Collection Basis %d. Please see go/new-ncc-check for instructions on how to implement this.", v));
            }
        }
    }
}

