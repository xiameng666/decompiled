import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.SectionButtonPreference;

public final class skn implements View.OnClickListener {
    public final SectionButtonPreference a;

    public skn(SectionButtonPreference sectionButtonPreference0) {
        this.a = sectionButtonPreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibts ibts0 = this.a.a;
        if(ibts0 != null) {
            ibuq.c(view0);
            ibts0.a(view0);
        }
    }
}

