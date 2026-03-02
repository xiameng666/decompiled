import android.app.Dialog;
import android.os.Bundle;

public final class eysh extends de {
    private final ibnn ag;

    public eysh() {
        ibuk ibuk0 = new ibuk(eysa.class);
        eyse eyse0 = new eyse(this);
        eysf eysf0 = new eysf(this);
        this.ag = new lsd(ibuk0, eyse0, new eysg(this), eysf0);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        int v = this.requireArguments().getInt("KEY_DEVICE_INDEX");
        eyqt eyqt0 = (eyqt)((eyqq)((eysa)this.ag.a()).i.b()).a.get(v);
        fyju fyju0 = eynz.a(this.requireContext());
        fyju0.N(0x7F153482);  // string:unenroll_dialog_title "Remove watch?"
        fyju0.D(this.getResources().getString(0x7F153481, new Object[]{eyqt0.a}));  // string:unenroll_dialog_message "You won\'t be able to use %1$s to unlock this phone, 
                                                                                    // but they\'ll stay connected. You can add your watch again at any time."
        fyju0.F(0x7F1507F2, null);  // string:common_cancel "Cancel"
        fyju0.L(0x7F1508C6, new eysc(eyqt0));  // string:common_remove "Remove"
        return fyju0.create();
    }
}

