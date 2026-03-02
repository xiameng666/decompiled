import java.util.Locale;

public final class czkg {
    public static gymd a(int v) {
        switch(v) {
            case 1: {
                return gymd.p;
            }
            case 2: {
                return gymd.s;
            }
            case 3: {
                return gymd.o;
            }
            case 4: {
                return gymd.r;
            }
            case 5: {
                return gymd.q;
            }
            default: {
                return gymd.a;
            }
        }
    }

    public static String b(int v) {
        switch(v) {
            case 1: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)1), "ADVERTISE_FAILED_DATA_TOO_LARGE");
            }
            case 2: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)2), "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS");
            }
            case 3: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)3), "ADVERTISE_FAILED_ALREADY_STARTED");
            }
            case 4: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)4), "ADVERTISE_FAILED_INTERNAL_ERROR");
            }
            case 5: {
                return String.format(Locale.ENGLISH, "[%d]%s", ((int)5), "ADVERTISE_FAILED_FEATURE_UNSUPPORTED");
            }
            default: {
                return String.format(Locale.ENGLISH, "[%d]%s", v, "UNKNOWN");
            }
        }
    }
}

