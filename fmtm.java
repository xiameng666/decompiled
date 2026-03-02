import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import com.google.android.libraries.messaging.lighter.ui.statusbar.TextStatusBarHolderView;

public final class fmtm implements flcd {
    public final fmus a;

    public fmtm(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // flcd
    public final void a(int v) {
        fmus fmus0 = this.a;
        switch(v) {
            case 0: 
            case 1: {
                ((ConversationView)fmus0.a).e();
                ((ConversationView)fmus0.a).i();
                fmus0.f.c(0x7F);
                return;
            }
            case 2: {
                ((ConversationView)fmus0.a).d();
                ((ConversationView)fmus0.a).e();
                return;
            }
            case 3: {
                ((ConversationView)fmus0.a).d();
                ((ConversationView)fmus0.a).n.a();
                ((ConversationView)fmus0.a).n.b(((ConversationView)fmus0.a).i);
                fmyw fmyw0 = new fmyw(((ConversationView)fmus0.a).getContext());
                fmyw0.a.setText("Offline");
                ((ConversationView)fmus0.a).i = fmyw0;
                ((ConversationView)fmus0.a).n.d(((ConversationView)fmus0.a).i);
                fmus0.f.c(130);
                return;
            }
            default: {
                ConversationView conversationView0 = (ConversationView)fmus0.a;
                conversationView0.d();
                fmti fmti0 = new fmti(fmus0);
                TextStatusBarHolderView textStatusBarHolderView0 = conversationView0.n;
                textStatusBarHolderView0.a();
                textStatusBarHolderView0.b(conversationView0.i);
                fmzb fmzb0 = new fmzb(conversationView0.getContext());
                fmzb0.a.setText("Could not get all messages");
                if(!TextUtils.isEmpty("Retry")) {
                    fmzb0.b.setText("Retry");
                    fmzb0.b.setVisibility(0);
                }
                conversationView0.i = fmzb0;
                new fmyz(conversationView0.i).a = fmti0;
                textStatusBarHolderView0.d(conversationView0.i);
                fmus0.f.c(0x80);
            }
        }
    }
}

