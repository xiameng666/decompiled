import android.database.sqlite.SQLiteException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fllg implements Runnable {
    public final flmu a;
    public final ConversationId b;

    public fllg(flmu flmu0, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = conversationId0;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.b;
        long v = flmu0.d(conversationId0);
        if(Long.compare(v, -1L) == 0) {
            flbj.c("SQLiteMessagingStore", "Attempting to delete a non-existent conversation: " + conversationId0);
            return;
        }
        flnc flnc0 = flmu0.e;
        if(flnc0.a(flmu0.l("conversations"), "id = ?", new String[]{String.valueOf(v)}) < 0) {
            throw new SQLiteException("Failed to delete conversation.");
        }
        if(iadc.a.c().d()) {
            flng.b(flnc0, new fllm(flmu0, conversationId0));
        }
        flbj.a("SQLiteMessagingStore", "Sending conversation deleted event");
        flbj.a("SQLiteMessagingStore", "Conversation deleted event is not sent");
        flmu0.L();
    }
}

