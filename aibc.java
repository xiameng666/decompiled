import android.content.Context;

public final class aibc extends azts {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        aibc.c = azss0;
        aibb aibb0 = new aibb();
        aibc.d = aibb0;
        aibc.b = new azta_api("SmsRetrieverInternal.API", aibb0, azss0);
    }

    public aibc(Context context0) {
        super(context0, aibc.b, azsx.s, aztr_settings.a);
    }
}

