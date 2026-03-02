import android.app.Dialog;
import android.os.Bundle;

public class kd extends de {
    public kd() {
    }

    public kd(int v) {
        super(v);
    }

    @Override  // de
    public Dialog onCreateDialog(Bundle bundle0) {
        return new kc(this.getContext(), this.getTheme());
    }

    @Override  // de
    public final void setupDialog(Dialog dialog0, int v) {
        if((dialog0 instanceof kc)) {
            switch(v) {
                case 1: 
                case 2: {
                    break;
                }
                case 3: {
                    dialog0.getWindow().addFlags(24);
                    break;
                }
                default: {
                    return;
                }
            }
            ((kc)dialog0).j();
            return;
        }
        super.setupDialog(dialog0, v);
    }
}

