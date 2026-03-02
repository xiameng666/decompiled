import android.app.Dialog;
import android.os.Bundle;

public final class eyxf extends de {
    private final ibnn ag;

    public eyxf() {
        eyxb eyxb0 = new eyxb(new eyxa(this));
        ibnn ibnn0 = ibno.a(ibnp.c, eyxb0);
        ibuk ibuk0 = new ibuk(eywt.class);
        eyxc eyxc0 = new eyxc(ibnn0);
        eyxd eyxd0 = new eyxd(ibnn0);
        this.ag = new lsd(ibuk0, eyxc0, new eyxe(this, ibnn0), eyxd0);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        fyju fyju0 = eynz.a(this.requireContext());
        int v = new int[]{1, 2}[this.requireArguments().getInt("dialogType")];
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    fyju0.N(0x7F1529DA);  // string:screen_lock_set_up_failure_dialog_time_out_title "Setup timed out"
                    fyju0.C(0x7F1529DB);  // string:screen_lock_set_up_failure_failure_time_out_message "Try again now or set 
                                          // up Watch Unlock later in Settings"
                    fyju0.F(0x7F1507F2, new eyww(this));  // string:common_cancel "Cancel"
                    fyju0.L(0x7F1508F2, new eywx(this));  // string:common_try_again "Try again"
                    return fyju0.create();
                }
                case 1: {
                    fyju0.N(0x7F1529D9);  // string:screen_lock_set_up_failure_dialog_keyguard_failure_title "Can\'t complete 
                                          // setup"
                    fyju0.C(0x7F1529D7);  // string:screen_lock_set_up_failure_dialog_keyguard_failure_message "A screen lock 
                                          // is required for added security. To continue setup, set a screen lock on your watch."
                    fyju0.F(0x7F1507F2, new eywy(this));  // string:common_cancel "Cancel"
                    fyju0.L(0x7F1529D8, new eywz(this));  // string:screen_lock_set_up_failure_dialog_keyguard_failure_positive_button_label 
                                                          // "Continue setup"
                    return fyju0.create();
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        throw null;
    }

    public final eywt y() {
        return (eywt)this.ag.a();
    }
}

