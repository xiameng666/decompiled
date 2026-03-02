import java.util.Locale;

public final class gphi {
    public static final int a;

    static {
        gftb.f(gfri.a.h("Content-Type"), "Only ASCII header keys are permitted: %s", "Content-Type");
        new gphh("Content-Type".toLowerCase(Locale.US));
        new iant("Content-Type", iaof_metadata.c);
        new iant("server", iaof_metadata.c);
    }

    public static int a(int v) {
        switch(v) {
            case 0: {
                return 200;
            }
            case 1: {
                return 0x1F3;
            }
            case 4: {
                return 504;
            }
            case 5: {
                return 404;
            }
            case 7: {
                return 403;
            }
            case 8: {
                return 429;
            }
            case 6: 
            case 10: {
                return 409;
            }
            case 3: 
            case 9: 
            case 11: {
                return 400;
            }
            case 12: {
                return 501;
            }
            case 14: {
                return 503;
            }
            case 16: {
                return 401;
            }
            default: {
                return 500;
            }
        }
    }
}

