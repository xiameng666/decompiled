import android.content.Context;
import android.view.View;
import androidx.preference.PreferenceGroup;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;

final class cqkm extends skr {
    public cqkm(PreferenceGroup preferenceGroup0) {
        super(preferenceGroup0);
    }

    @Override  // skr
    public final void G(oij oij0, int v) {
        super.G(oij0, v);
        if((this.n(v) instanceof RadioButtonPreferenceWithDropdown)) {
            View view0 = oij0.a;
            view0.setPadding(cqkm.K(view0.getContext()), view0.getPaddingTop(), cqkm.K(view0.getContext()), view0.getPaddingBottom());
        }
    }

    private static int K(Context context0) {
        return Math.round(context0.getResources().getDisplayMetrics().density * 16.0f);
    }

    @Override  // skr
    public final void h(uq uq0, int v) {
        this.G(((oij)uq0), v);
    }
}

