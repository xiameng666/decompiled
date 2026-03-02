import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

public final class flhh implements Callable {
    public final flit a;
    public final ConversationId b;
    public final AccountContext c;

    public flhh(flit flit0, ConversationId conversationId0, AccountContext accountContext0) {
        this.a = flit0;
        this.b = conversationId0;
        this.c = accountContext0;
    }

    @Override
    public final Object call() {
        ConversationId conversationId0 = this.b;
        if(conversationId0.e() == ConversationId.IdType.a) {
            flen flen0 = this.a.u;
            ContactId contactId0 = conversationId0.c();
            flbj.a("LitContactCtrlr", "getContactAndForceSync called");
            flen0.b(this.c, contactId0, gftj.a).g();
        }
        return null;
    }
}

