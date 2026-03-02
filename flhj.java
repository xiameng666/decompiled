import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

public final class flhj implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final ggeo d;
    public final flqw e;

    public flhj(flit flit0, AccountContext accountContext0, ConversationId conversationId0, ggeo ggeo0, flqw flqw0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = ggeo0;
        this.e = flqw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        List list0 = (List)this.d.get(this.c);
        return this.a.r.b(this.b, this.c, (((fmev)object0) == null ? ByteString.b : ((fmev)object0).n), list0, this.e);
    }
}

