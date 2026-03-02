import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.ExpandablePreference;

public final class sjw implements View.OnClickListener {
    public final ExpandablePreference a;

    public sjw(ExpandablePreference expandablePreference0) {
        this.a = expandablePreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.d ^= 1;
        this.a.e = true;
        this.a.an();
        this.a.d();
    }
}

