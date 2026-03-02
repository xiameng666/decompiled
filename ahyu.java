import android.content.Context;
import com.google.android.gms.common.Feature;

public final class ahyu extends azts implements ahxb {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ahyu.b = azss0;
        ahys ahys0 = new ahys();
        ahyu.c = ahys0;
        ahyu.a = new azta_api("SmsCodeAutofill.API", ahys0, azss0);
    }

    public ahyu(Context context0) {
        super(context0, ahyu.a, azsx.s, aztr_settings.a);
    }

    @Override  // ahxb
    public final evql b() {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{amjv.a};
        azzc0.a = new ahyr(this);
        azzc0.d = 0x61B;
        return this.jn(azzc0.a());
    }
}

