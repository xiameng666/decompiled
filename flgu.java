import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class flgu implements Callable {
    public final flit a;
    public final gmcd b;
    public final AccountContext c;
    public final ConversationId d;

    public flgu(flit flit0, gmcd gmcd0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = gmcd0;
        this.c = accountContext0;
        this.d = conversationId0;
    }

    @Override
    public final Object call() {
        try {
            ConversationId conversationId0 = this.d;
            AccountContext accountContext0 = this.c;
            flit flit0 = this.a;
            flki flki0 = (flki)gmbu.r(this.b);
            switch(flki0.b) {
                case 0: {
                    throw null;
                }
                case 2: {
                    flvg flvg0 = new flvg(conversationId0, flki0.a);
                    flit0.f.a.b(accountContext0).D(flvg0.a, flvg0.b);
                    for(Object object0: flit0.n.values()) {
                        ((flws)object0).g(conversationId0);
                    }
                    return Boolean.valueOf(true);
                }
                default: {
                    return Boolean.valueOf(false);
                }
            }
        }
        catch(ExecutionException executionException0) {
            flbj.d("LiMsgController", "Fail to delete conversation on cloud.", executionException0);
            return Boolean.valueOf(false);
        }
    }
}

