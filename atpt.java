import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;
import java.util.concurrent.TimeUnit;

public final class atpt extends CountDownTimer {
    final BankWarningDialogChimeraActivity a;

    public atpt(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0, long v) {
        this.a = bankWarningDialogChimeraActivity0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0 = this.a;
        TextView textView0 = bankWarningDialogChimeraActivity0.q;
        Button button0 = null;
        if(textView0 == null) {
            ibuq.j("textWaitToContinue");
            textView0 = null;
        }
        textView0.setVisibility(8);
        LinearLayout linearLayout0 = bankWarningDialogChimeraActivity0.r;
        if(linearLayout0 == null) {
            ibuq.j("riskAcceptanceContainer");
            linearLayout0 = null;
        }
        linearLayout0.setVisibility(0);
        CheckBox checkBox0 = bankWarningDialogChimeraActivity0.s;
        if(checkBox0 == null) {
            ibuq.j("checkboxUnderstandRisk");
            checkBox0 = null;
        }
        checkBox0.setChecked(false);
        Button button1 = bankWarningDialogChimeraActivity0.t;
        if(button1 == null) {
            ibuq.j("buttonContinueAnyway");
        }
        else {
            button0 = button1;
        }
        button0.setVisibility(8);
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
        long v1 = TimeUnit.MILLISECONDS.toSeconds(v) + 1L;
        this.a.a(((int)v1));
    }
}

