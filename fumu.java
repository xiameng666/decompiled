import android.graphics.drawable.Drawable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;

public final class fumu implements CompoundButton.OnCheckedChangeListener {
    public final RowSecondaryToggle a;

    public fumu(RowSecondaryToggle rowSecondaryToggle0) {
        this.a = rowSecondaryToggle0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ibuq.f(compoundButton0, "buttonView");
        RowSecondaryToggle rowSecondaryToggle0 = this.a;
        if(z) {
            Drawable drawable0 = rowSecondaryToggle0.getContext().getDrawable(0x7F080507);  // drawable:gs_check_vd_theme_20
            rowSecondaryToggle0.k.i(drawable0);
            return;
        }
        rowSecondaryToggle0.k.i(null);
    }
}

