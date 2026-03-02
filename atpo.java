import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;

public final class atpo implements View.OnClickListener {
    public final BankWarningDialogChimeraActivity a;

    public atpo(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0) {
        this.a = bankWarningDialogChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Continue anyway button clicked after risk acceptance.");
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0 = this.a;
        bankWarningDialogChimeraActivity0.x = true;
        icbb.b(lpt.a(bankWarningDialogChimeraActivity0), null, null, new atps(bankWarningDialogChimeraActivity0, null), 3);
        String s = bankWarningDialogChimeraActivity0.u;
        String s1 = "UNKNOWN";
        if(s == null) {
            s = "UNKNOWN";
        }
        String s2 = bankWarningDialogChimeraActivity0.v;
        if(s2 != null) {
            s1 = s2;
        }
        bankWarningDialogChimeraActivity0.k.c(hhbf.c, s, s1);
    }
}

