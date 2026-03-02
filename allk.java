import android.app.AlertDialog;
import android.app.Dialog;
import androidx.preference.Preference;

public final class allk implements ohj {
    public final allq a;

    public allk(allq allq0) {
        this.a = allq0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        aljd aljd0 = aljd.y(this.a.ag, this.a.ai, true);
        aljd0.show(this.a.getParentFragmentManager(), "DisableBetterTogetherDialogFragment");
        this.a.getParentFragmentManager().aq();
        Dialog dialog0 = aljd0.getDialog();
        gftb.check(dialog0);
        AlertDialog alertDialog0 = (AlertDialog)dialog0;
        alertDialog0.getButton(-1).setAllCaps(false);
        alertDialog0.getButton(-2).setAllCaps(false);
        return true;
    }
}

