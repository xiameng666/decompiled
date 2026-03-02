import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;

public final class fumv implements View.OnClickListener {
    public final RowSecondaryToggle a;
    public final View.OnClickListener b;

    public fumv(RowSecondaryToggle rowSecondaryToggle0, View.OnClickListener view$OnClickListener0) {
        this.a = rowSecondaryToggle0;
        this.b = view$OnClickListener0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = this.a.k.isChecked() ^ 1;
        this.a.k.setChecked(((boolean)v));
        View.OnClickListener view$OnClickListener0 = this.b;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(view0);
        }
    }
}

