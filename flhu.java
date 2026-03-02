import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flhu implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final fmga c;

    public flhu(flit flit0, AccountContext accountContext0, fmga fmga0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmga0;
    }

    @Override
    public final void run() {
        AccountContext accountContext0 = this.b;
        flit flit0 = this.a;
        flit0.u.d(accountContext0, this.c.b).g();
        ConversationId conversationId0 = this.c.c;
        if(conversationId0.e() == ConversationId.IdType.a) {
            ContactId contactId0 = conversationId0.c();
            flit0.u.d(accountContext0, contactId0).g();
            return;
        }
        flit0.h(accountContext0, conversationId0).g();
    }
}

