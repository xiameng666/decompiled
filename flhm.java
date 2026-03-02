import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flhm implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final long d;

    public flhm(flit flit0, AccountContext accountContext0, ConversationId conversationId0, long v) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        return glzd.g(this.a.p(this.b, this.c), new flhl(this.a, this.c, this.b, ((Boolean)object0), this.d), this.a.b);
    }
}

