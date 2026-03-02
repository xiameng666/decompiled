import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmup implements MenuItem.OnMenuItemClickListener {
    final fmus a;

    public fmup(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        fmus fmus0 = this.a;
        if(fmus0.o != null && menuItem0.getItemId() == fmus0.o.getItemId()) {
            View view0 = fmus0.a;
            if(view0 != null) {
                if(!iaea.p()) {
                    return false;
                }
                flbj.a("ConvPresenter", "view is instance of ConversationView");
                fmys fmys0 = ((ConversationView)view0).s;
                if(fmys0 == null) {
                    ((ConversationView)view0).s = new fmys(((ConversationView)view0).getContext());
                    ((ConversationView)view0).addView(((ConversationView)view0).s, new FrameLayout.LayoutParams(-1, -1));
                }
                else {
                    fmys0.setVisibility(0);
                }
                ((ConversationView)view0).b();
                flbj.a("ConvPresenter", "settingsPagePresenter is null");
                return true;
            }
        }
        flbj.a("ConvPresenter", "SettingsMenuItem is null");
        return false;
    }
}

