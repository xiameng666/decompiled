import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fldl implements glzm {
    public final fldt a;
    public final AccountContext b;
    public final ConversationId c;
    public final flqw d;

    public fldl(fldt fldt0, AccountContext accountContext0, ConversationId conversationId0, flqw flqw0) {
        this.a = fldt0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        return this.a.e.a(this.b, this.c, this.d, false);
    }
}

