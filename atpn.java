import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;

public final class atpn implements CompoundButton.OnCheckedChangeListener {
    public final BankWarningDialogChimeraActivity a;

    public atpn(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0) {
        this.a = bankWarningDialogChimeraActivity0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "<unused var>");
        Button button0 = this.a.t;
        if(button0 == null) {
            ibuq.j("buttonContinueAnyway");
            button0 = null;
        }
        button0.setVisibility((z ? 0 : 8));
    }
}

