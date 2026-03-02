import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.gms.accountsettings.mg.ui.main.debug.DebugMenuView;

public final class aast implements DialogInterface.OnClickListener {
    public final DebugMenuView a;
    public final EditText b;

    public aast(DebugMenuView debugMenuView0, EditText editText0) {
        this.a = debugMenuView0;
        this.b = editText0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        aaln aaln0 = this.a.d();
        grxy grxy0 = grxx.a(((grxu)((ProtoLiteMessage)grxw.a).v_newBuilder()));
        grxy0.b(Integer.parseInt(this.b.getText().toString()));
        aaln0.n(grxy0.a(), this.a.f().b());
        this.a.d().i(this.a.f().b());
    }
}

