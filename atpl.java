import android.app.Dialog;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;

public final class atpl implements View.OnClickListener {
    public final BankWarningDialogChimeraActivity a;

    public atpl(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0) {
        this.a = bankWarningDialogChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Close button clicked by user.");
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0 = this.a;
        bankWarningDialogChimeraActivity0.x = true;
        String s = bankWarningDialogChimeraActivity0.u;
        String s1 = "UNKNOWN";
        if(s == null) {
            s = "UNKNOWN";
        }
        String s2 = bankWarningDialogChimeraActivity0.v;
        if(s2 != null) {
            s1 = s2;
        }
        bankWarningDialogChimeraActivity0.k.c(hhbf.d, s, s1);
        Dialog dialog0 = bankWarningDialogChimeraActivity0.p;
        if(dialog0 == null) {
            ibuq.j("dialog");
            dialog0 = null;
        }
        dialog0.dismiss();
        bankWarningDialogChimeraActivity0.finish();
    }
}

