import android.content.Context;

public final class fcfo {
    @Deprecated
    public static final azta_api a;
    @Deprecated
    public static final fdjo b;
    @Deprecated
    public static final fdkg c;
    private static final azss d;
    private static final azsy e;

    static {
        fcfo.b = new fdjo();
        fcfo.c = new fdkg();
        azss azss0 = new azss();
        fcfo.d = azss0;
        fcfm fcfm0 = new fcfm();
        fcfo.e = fcfm0;
        fcfo.a = new azta_api("Wearable.API", fcfm0, azss0);
    }

    public static fced a(Context context0) {
        return new fced(context0, aztr_settings.a);
    }

    public static fcej b(Context context0) {
        return new fcej(context0, aztr_settings.a);
    }

    public static fcer c(Context context0) {
        return new fcer(context0, aztr_settings.a);
    }

    public static fcfe d(Context context0) {
        return new fcfe(context0, aztr_settings.a);
    }

    public static fcfg e(Context context0) {
        return new fcfg(context0, aztr_settings.a);
    }

    public static azts f(Context context0) {
        return new azts(context0, fcfo.a, fcfn.a, aztr_settings.a);
    }
}

