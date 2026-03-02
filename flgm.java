import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flgm implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final String d;
    public final boolean e;

    public flgm(flit flit0, AccountContext accountContext0, ConversationId conversationId0, String s, boolean z) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = s;
        this.e = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        return glzd.g(this.a.p(this.b, this.c), new flhc(this.a, this.b, this.c, this.d, ((Boolean)object0), this.e), this.a.b);
    }
}

