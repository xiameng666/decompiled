import android.content.Context;

public final class aitf extends azts implements aisa {
    public static final int a;
    private static final aite b;
    private static final azta_api c;
    private static final azss d;

    static {
        azss azss0 = new azss();
        aitf.d = azss0;
        aite aite0 = new aite();
        aitf.b = aite0;
        aitf.c = new azta_api("RestoreCredential.API", aite0, azss0);
    }

    public aitf(Context context0) {
        ibuq.f(context0, "context");
        super(context0, aitf.c, azsx.s, aztr_settings.a);
    }
}

