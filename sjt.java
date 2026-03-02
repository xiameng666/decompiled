import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.CollapsableTextView;

public final class sjt implements View.OnClickListener {
    public final CollapsableTextView a;

    public sjt(CollapsableTextView collapsableTextView0) {
        this.a = collapsableTextView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.h ^= 1;
        this.a.l();
    }
}

