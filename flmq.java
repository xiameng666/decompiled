import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;

public final class flmq implements Runnable {
    public final flmu a;
    public final ConversationId b;
    public final List c;

    public flmq(flmu flmu0, ConversationId conversationId0, List list0) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = list0;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.b;
        long v = flmu0.d(conversationId0);
        if(v == -1L) {
            flbj.c("SQLiteMessagingStore", "Could not find conversation with the given id.");
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.c) {
            long v1 = flmu0.c(((ContactId)object0));
            if(v1 != -1L) {
                arrayList0.add(Long.valueOf(v1));
            }
        }
        flmg flmg0 = new flmg(flmu0, arrayList0, v, conversationId0);
        flng.b(flmu0.e, flmg0);
    }
}

