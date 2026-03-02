import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flin implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final gged_interceptors d;
    public final flqw e;

    public flin(flit flit0, AccountContext accountContext0, ConversationId conversationId0, gged_interceptors gged0, flqw flqw0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = gged0;
        this.e = flqw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        return ((fmev)object0) == null ? this.a.r.c(this.b, this.c, ByteString.b, this.d, this.e, true) : this.a.r.c(this.b, this.c, ((fmev)object0).n, this.d, this.e, true);
    }
}

