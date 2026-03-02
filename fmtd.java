import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmtd implements fmoz {
    public final fmus a;

    public fmtd(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmus fmus0 = this.a;
        if(fmus0.G) {
            fmus0.r();
        }
        if(fmus0.G) {
            fmus0.q();
        }
        View view0 = fmus0.a;
        if(view0 != null) {
            if(fmus0.m == null) {
                fmus0.m = ((ConversationView)view0).m.d(0x7F15053A, fmus0.ab, 2);  // string:block "Block"
            }
            if(fmus0.n == null) {
                fmus0.n = ((ConversationView)view0).m.d(0x7F150D12, fmus0.ac, 2);  // string:delete_conversation_button "Delete"
            }
            if(iaea.p() && fmus0.o == null) {
                fmus0.o = ((ConversationView)view0).m.d(0x7F152A53, fmus0.ad, 20);  // string:settings_menu_item "Settings"
            }
            if(iaea.k() && fmus0.p == null) {
                fmus0.p = ((ConversationView)view0).m.d(0x7F1529FA, null, 10);  // string:send_feedback "Send feedback"
            }
        }
        fmus0.s();
        fmam.a().e("ConversationPresenter::start", fmus0.S);
        if(fmus0.b.e().equals(ConversationId.IdType.b)) {
            gfsx gfsx0 = ((fmev)object0).b;
            if(gfsx0.i() && !TextUtils.isEmpty(((CharSequence)gfsx0.d()))) {
                fmus0.g = (String)gfsx0.d();
            }
        }
        fmus0.U.set(true);
        fmus0.e();
    }
}

