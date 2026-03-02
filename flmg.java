import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Iterator;
import java.util.List;

public final class flmg implements Runnable {
    public final flmu a;
    public final List b;
    public final long c;
    public final ConversationId d;

    public flmg(flmu flmu0, List list0, long v, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = list0;
        this.c = v;
        this.d = conversationId0;
    }

    @Override
    public final void run() {
        flmu flmu0;
        Iterator iterator0 = this.b.iterator();
        while(true) {
            flmu0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            long v = this.c;
            Object object0 = iterator0.next();
            long v1 = (long)(((Long)object0));
            Uri uri0 = flmu0.l("participants");
            if(((long)flmu0.e.a(uri0, "conversation_row_id =? AND contact_row_id =?", new String[]{Long.toString(v), Long.toString(v1)})) < 0L) {
                flbj.c("SQLiteMessagingStore", a.J(v, v1, "Failed to kick participant,  Contact Row ID: ", " from Conversation Row ID: "));
            }
        }
        flmu0.N(this.d);
    }
}

