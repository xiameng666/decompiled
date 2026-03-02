import android.content.Context;

public final class ahxd extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ahxd.b = azss0;
        ahxc ahxc0 = new ahxc();
        ahxd.c = ahxc0;
        ahxd.a = new azta_api("SmsRetriever.API", ahxc0, azss0);
    }

    public ahxd(Context context0) {
        super(context0, ahxd.a, azsx.s, aztr_settings.a);
    }
}

