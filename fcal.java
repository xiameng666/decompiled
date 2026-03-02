import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import com.google.android.wallet.ui.common.InfoMessageView;

public final class fcal extends gdbm {
    public final InfoMessageView a;
    public final InfoMessageView b;
    public gcqy c;

    public fcal(Context context0) {
        super(context0);
        LayoutInflater.from(context0).inflate(0x7F0E0DA2, this, true);  // layout:wallet_row_setupwizard_creatable_v2
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.a = (InfoMessageView)this.findViewById(0x1020014);
        this.b = (InfoMessageView)this.findViewById(0x1020015);
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.getResources().getString(0x7F153524, new Object[]{this.a.g()});  // string:wallet_creatable_instrument_selected "%1$s selected"
    }
}

