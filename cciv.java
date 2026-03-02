import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class cciv extends de {
    public static final bboh ag;
    public cjbx ah;
    public final ibnn ai;
    private final ibnn aj;

    static {
        cciv.ag = bboh.a("AdvancedProtectionOptInDialogFragment");
    }

    public cciv() {
        this.aj = new ibnz(new ccir(this));
        this.ai = new ibnz(new ccis(this));
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        Bundle bundle1 = this.getArguments();
        boolean z = bundle1 == null ? false : bundle1.getBoolean("is_2g_supported", false);
        if(this.y()) {
            this.ah = cjbx.b(this, new cciu(this));
        }
        Context context0 = this.requireContext();
        CharSequence charSequence0 = ibzk.t(eibo.a(context0, (z ? 0x7F15005B : 0x7F15005D), ibpo.g(new eibn[]{new eibf(null), new eibj(ccit.a(context0)), new eibl()})));  // string:aapm_opt_in_dialog_with_2g_message_client "<p>Device protection helps keep 
                                                                                                                                                                           // your device and data safe</p> <b>Keep in mind</b> <ul> <li>Apps on your device can 
                                                                                                                                                                           // see if device protection is on</li> <li>On devices where 2G protection is available, 
                                                                                                                                                                           // 2G connections will be blocked except for emergency calling</li> <li>Some websites 
                                                                                                                                                                           // may not load as expected</li> </ul>"
        fyju fyju0 = new fyju(ccit.a(this.requireContext()));
        fyju0.z(0x7F0804CA);  // drawable:gs_android_security_privacy_vd_theme_48
        fyju0.N(0x7F150059);  // string:aapm_opt_in_dialog_title_client "Turn on device protection?"
        fyju0.D(charSequence0);
        fyju0.L(0x7F1508F4, null);  // string:common_turn_on "Turn on"
        fyju0.F(0x1040000, null);
        Dialog dialog0 = fyju0.create();
        ((iw)dialog0).setOnShowListener(new ccio(((iw)dialog0), this));
        return dialog0;
    }

    public final boolean y() {
        return ((Boolean)this.aj.a()).booleanValue();
    }
}

