import android.content.Context;

public final class bcyf extends azts implements bcxu {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        bcyf.b = azss0;
        bcye bcye0 = new bcye();
        bcyf.c = bcye0;
        bcyf.a = new azta_api("Settings.API", bcye0, azss0);
    }

    public bcyf(Context context0) {
        super(context0, bcyf.a, azsx.s, aztr_settings.a);
    }
}

