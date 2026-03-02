import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import org.json.JSONObject;

public final class fllm implements Runnable {
    public final flmu a;
    public final ConversationId b;

    public fllm(flmu flmu0, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = conversationId0;
    }

    @Override
    public final void run() {
        ConversationId conversationId0 = this.b;
        gfsx gfsx0 = conversationId0.g();
        if(!gfsx0.i()) {
            flbj.c("SQLiteMessagingStore", "Failed converting conversationId to json: " + conversationId0);
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("conversation_id_string", ((JSONObject)gfsx0.d()).toString());
        flba.a();
        contentValues0.put("local_delete_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        Uri uri0 = this.a.l("deleted_conversations");
        if(this.a.e.c(uri0, contentValues0, 0) != -1L) {
            return;
        }
        throw new SQLiteException("Failed to insert ConversationDeletionsTable.");
    }
}

