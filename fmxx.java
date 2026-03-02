import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmxx implements Runnable {
    public final fmtq a;

    public fmxx(fmtq fmtq0) {
        this.a = fmtq0;
    }

    @Override
    public final void run() {
        ConversationView conversationView0 = (ConversationView)this.a.a.a;
        conversationView0.h(conversationView0.getHeight());
        this.a.a.d().k(new fmtt());
    }
}

