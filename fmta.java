import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmta implements Runnable {
    public final View a;

    public fmta(View view0) {
        this.a = view0;
    }

    @Override
    public final void run() {
        ((View)((ConversationView)this.a).c).requestFocus();
    }
}

