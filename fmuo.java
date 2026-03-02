import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmuo implements MenuItem.OnMenuItemClickListener {
    final fmus a;

    public fmuo(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        fmus fmus0 = this.a;
        if(fmus0.n != null && menuItem0.getItemId() == fmus0.n.getItemId()) {
            View view0 = fmus0.a;
            if(view0 != null) {
                fmus0.f.c(108);
                if(((ConversationView)view0).r == null) {
                    ((ConversationView)view0).r = new fmvl(((ConversationView)view0).getContext());
                }
                if(fmus0.ao == null) {
                    fmus0.ao = new fmvn(((ConversationView)view0).r, fmus0.N, fmus0.c.c);
                    fmvn fmvn0 = fmus0.ao;
                    fmvn0.a = new fmur(fmus0);
                }
                ((ConversationView)view0).r.b.a();
                return true;
            }
        }
        return false;
    }
}

