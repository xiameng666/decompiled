import android.content.Context;

public final class ahky extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ahky.b = azss0;
        ahkx ahkx0 = new ahkx();
        ahky.c = ahkx0;
        ahky.a = new azta_api("EarlyUpdate.API", ahkx0, azss0);
    }

    public ahky(Context context0) {
        super(context0, ahky.a, null, aztr_settings.a);
    }
}

