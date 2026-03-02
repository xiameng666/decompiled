import android.content.Context;

public final class ahuo extends azts implements aztx {
    public final String a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        ahuo.c = azss0;
        ahun ahun0 = new ahun();
        ahuo.d = ahun0;
        ahuo.b = new azta_api("Auth.Api.Identity.CredentialSaving.API", ahun0, azss0);
    }

    public ahuo(Context context0, ahpx ahpx0) {
        super(context0, ahuo.b, ahpx0, aztr_settings.a);
        this.a = bxol.a();
    }
}

