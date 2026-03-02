import android.content.Context;
import android.os.Bundle;
import java.util.Locale;

public final class eped extends epeg {
    public static final baun a;
    public final epfc b;
    public final boolean c;
    private final acoa e;
    private int f;

    static {
        eped.a = new baun("constellation", new String[]{"phone_number_verification_opt_in"});
    }

    public eped(Context context0, epfc epfc0, boolean z) {
        super(context0);
        this.f = 0;
        this.b = epfc0;
        this.c = z;
        this.e = new acoa(context0);
    }

    @Override  // epeg
    protected final void a(boolean z) {
        new ccmp().a((z ? bbdg.dS : bbdg.dT));
        Bundle bundle0 = new Bundle();
        bundle0.putString("is_pnv_consent", "true");
        if(hydh.a.c().Y()) {
            bundle0.putString("device_pnv_consent_source", "AOB_SETUP_WIZARD");
            if(!gfta.c(hydh.f())) {
                bundle0.putString("device_pnv_consent_version", hydh.f());
            }
            else if(hydh.h()) {
                bundle0.putString("device_pnv_consent_version", "PHONE_VERIFICATION_REACHABILITY_INTL_SMS_CALLS");
            }
            else {
                bundle0.putString("device_pnv_consent_version", "PHONE_VERIFICATION_INTL_SMS_CALLS");
            }
            bundle0.putString("locale", Locale.getDefault().toLanguageTag());
            if(!gfta.c(hydh.e())) {
                bundle0.putString("message_id", hydh.e());
            }
            else if(hydh.h()) {
                bundle0.putString("message_id", "6098117144947550297");
            }
            else {
                bundle0.putString("message_id", "3830863627121899257");
            }
        }
        eped.a.d("onAccept in PhoneNumberVerificationOptIn", new Object[0]);
        int v = this.f;
        this.f = v + 1;
        this.e.c(acog.a(v, 1, 1, new int[]{0}, Long.valueOf(System.currentTimeMillis()), (z ? 1 : 2), bundle0, 0, Integer.toString(0xF1B18AD), null, null, null, null, null, null, null, 0)).z(new epec());
    }
}

