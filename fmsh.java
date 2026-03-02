import android.view.View.OnFocusChangeListener;
import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;

public final class fmsh implements View.OnFocusChangeListener {
    public final ComposeBoxView a;

    public fmsh(ComposeBoxView composeBoxView0) {
        this.a = composeBoxView0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if(z) {
            this.a.g.requestFocus();
        }
    }
}

