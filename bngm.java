import android.app.Dialog;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

public abstract class bngm extends fyfx implements bngo {
    protected ViewOptions ag;
    protected Boolean ah;
    protected blza ai;

    public final void y() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            dialog0.setOnShowListener(new bngl(this));
        }
    }
}

