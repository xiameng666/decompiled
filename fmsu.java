import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmsu implements fmsd {
    public final fmus a;

    public fmsu(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // fmsd
    public final void a(String s) {
        fmus fmus0 = this.a;
        ConversationView conversationView0 = (ConversationView)fmus0.a;
        if(conversationView0.k != null && !conversationView0.k.equals(s)) {
            fmus0.f.c(10023);
        }
        fmus0.p(s, conversationView0.j, true);
        conversationView0.j = null;
        conversationView0.k = null;
        iaea.s();
    }
}

