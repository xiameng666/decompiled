import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
import com.google.android.libraries.messaging.lighter.ui.composebox.LighterEditText;

public final class fmsi implements View.OnClickListener {
    public final ComposeBoxView a;
    public final fmsg b;

    public fmsi(ComposeBoxView composeBoxView0, fmsg fmsg0) {
        this.a = composeBoxView0;
        this.b = fmsg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        LighterEditText lighterEditText0 = this.a.g;
        String s = lighterEditText0.getText() == null ? null : lighterEditText0.getText().toString();
        this.b.b.a(s);
        lighterEditText0.setText("");
    }
}

