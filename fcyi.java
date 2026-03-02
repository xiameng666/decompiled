import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import j..util.Optional;

public final class fcyi extends de {
    public Optional ag;
    public Optional ah;
    fcye ai;

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        if(this.ai == null) {
            xob xob0 = (xob)this.requireContext();
            this.ai = (fcye)new lso(xob0, lse.a(xob0.getApplication())).a(fcye.class);
        }
        View view0 = fczo.c(fczo.d(), LayoutInflater.from(this.requireContext())).inflate(0x7F0E0EB2, null);  // layout:wearable_bugreport_consent_retry_dialog
        fyju fyju0 = new fyju(this.requireContext(), 0x7F160298);  // style:BugreportConsentAlertDialog
        fyju0.Q(view0);
        fyju0.L(0x7F15362C, null);  // string:wearable_bugreport_retry_button_label "Retry"
        fyju0.F(0x7F153624, null);  // string:wearable_bugreport_cancel_button_label "Cancel"
        Dialog dialog0 = fyju0.create();
        if(((iw)dialog0).getWindow() != null) {
            Window window0 = ((iw)dialog0).getWindow();
            gftb.check(window0);
            window0.getAttributes().windowAnimations = 0x7F16029A;  // style:BugreportConsentAlertDialogAnimation
        }
        return dialog0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        iw iw0 = (iw)this.getDialog();
        if(iw0 != null) {
            iw0.b(-1).setOnClickListener(new fcyf(this, iw0));
            iw0.b(-2).setOnClickListener(new fcyg(this));
        }
    }
}

