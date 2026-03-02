import android.app.Activity;
import android.content.Context;

public final class bmen extends azts {
    private static final azta_api a;
    private static final azss b;

    static {
        azss azss0 = new azss();
        bmen.b = azss0;
        bmen.a = new azta_api("Fido.FIDO2_PRIVILEGED_API", new bmnd(), azss0);
    }

    @Deprecated
    public bmen(Activity activity0) {
        azuw azuw0 = new azuw();
        super(activity0, bmen.a, azsx.s, azuw0);
    }

    @Deprecated
    public bmen(Context context0) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        super(context0, bmen.a, azsx.s, aztr0);
    }
}

