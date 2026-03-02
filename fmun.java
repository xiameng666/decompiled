import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmun implements MenuItem.OnMenuItemClickListener {
    final fmus a;

    public fmun(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        fmus fmus0 = this.a;
        if(fmus0.m != null && menuItem0.getItemId() == fmus0.m.getItemId()) {
            if(fmus0.H) {
                fmus0.h();
                return true;
            }
            fmus0.f.c(106);
            ConversationView conversationView0 = (ConversationView)fmus0.a;
            if(conversationView0.p == null) {
                conversationView0.p = new fmqz(conversationView0.getContext());
            }
            if(fmus0.u == null) {
                fmus0.u = new fmrc(conversationView0.p, fmus0.h, fmus0.y);
                fmrc fmrc0 = fmus0.u;
                fmrc0.c = new fmum(fmus0);
                if(fmus0.G) {
                    fmus0.u.b();
                }
            }
            fmqz fmqz0 = conversationView0.p;
            View view0 = LayoutInflater.from(fmqz0.a).inflate(0x7F0E019E, null, false);  // layout:block_dialog_content_view
            ((fyju)fmqz0.b).Q(view0);
            ((TextView)view0.findViewById(0x7F0B0CCF)).setText(0x7F15053C);  // id:block_and_spam_dialog_body
            CheckBox checkBox0 = (CheckBox)view0.findViewById(0x7F0B0CCD);  // id:block_and_spam_check_box
            checkBox0.setText(0x7F15283B);  // string:report_as_spam "Report as spam"
            checkBox0.setOnCheckedChangeListener(new fmqy(fmqz0));
            fmqv fmqv0 = new fmqv(fmqz0);
            ((fyju)fmqz0.b).L(0x7F15053A, fmqv0);  // string:block "Block"
            fmqw fmqw0 = new fmqw(fmqz0);
            ((fyju)fmqz0.b).F(0x1040000, fmqw0);
            fmqx fmqx0 = new fmqx(fmqz0);
            ((fyju)fmqz0.b).J(fmqx0);
            fmqz0.b.a();
            return true;
        }
        return false;
    }
}

