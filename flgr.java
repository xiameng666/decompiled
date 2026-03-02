import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flgr implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;

    public flgr(flit flit0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        flit flit0 = this.a;
        AccountContext accountContext0 = this.b;
        ConversationId conversationId0 = this.c;
        if(((Boolean)object0).booleanValue()) {
            flbj.a("LiMsgController", "Deleted conversation from cloud, deleting locally");
            flit0.x(accountContext0, conversationId0);
            return gmbu.i(((Boolean)object0));
        }
        flbj.c("LiMsgController", "Failed to delete conversation on cloud, not deleting locally");
        fmai fmai0 = fmaj.a();
        fmai0.g(10114);
        fmai0.n(accountContext0.c().f());
        fmai0.d(conversationId0);
        fmaj fmaj0 = fmai0.a();
        flit0.e.b(fmaj0);
        return gmbu.i(((Boolean)object0));
    }
}

