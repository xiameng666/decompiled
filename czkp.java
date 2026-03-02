import java.util.Locale;

public final class czkp {
    public static gymd a(int v) {
        switch(v) {
            case 0: {
                return gymd.aS;
            }
            case 1: {
                return gymd.aR;
            }
            case 2: {
                return gymd.aT;
            }
            case 101: {
                return gymd.aU;
            }
            default: {
                return gymd.a;
            }
        }
    }

    public static String b(int v) {
        switch(v) {
            case 0: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)0), "INTERNAL_ERROR");
            }
            case 1: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)1), "P2P_UNSUPPORTED");
            }
            case 2: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)2), "BUSY");
            }
            case 101: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)101), "REFLECTION_ERROR");
            }
            default: {
                return String.format(Locale.ENGLISH, "[%d]%s", v, "UNKNOWN");
            }
        }
    }
}

