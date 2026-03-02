import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

final class flfs extends TimerTask {
    final ConversationId a;
    final ContactId b;
    final flfv c;

    public flfs(flfv flfv0, ConversationId conversationId0, ContactId contactId0) {
        this.a = conversationId0;
        this.b = contactId0;
        Objects.requireNonNull(flfv0);
        this.c = flfv0;
        super();
    }

    @Override
    public final void run() {
        flfv flfv0 = this.c;
        synchronized(flfv0.q) {
            ConversationId conversationId0 = this.a;
            ContactId contactId0 = this.b;
            flba.a();
            if(!flfv0.r.containsKey(conversationId0) || !((Map)flfv0.r.get(conversationId0)).containsKey(contactId0) || System.currentTimeMillis() >= ((long)(((Long)((Map)flfv0.r.get(conversationId0)).get(contactId0))))) {
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                flba.a();
                flfv0.u.f(conversationId0, contactId0, timeUnit0.toMicros(System.currentTimeMillis() - flfv.a));
                flfv0.j(conversationId0, contactId0);
            }
        }
    }
}

