import android.content.ContentValues;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

public final class flll implements Callable {
    public final flmu a;
    public final ConversationId b;
    public final ByteString c;

    public flll(flmu flmu0, ConversationId conversationId0, ByteString hfsf0) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = hfsf0;
    }

    @Override
    public final Object call() {
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.b;
        long v = flmu0.d(conversationId0);
        if(Long.compare(v, -1L) == 0) {
            flbj.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation does not exist: " + conversationId0);
            v = flmu0.i(conversationId0, gfqx.a);
            if(v == -1L) {
                flbj.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation could not be created: " + conversationId0);
                v = -1L;
            }
        }
        boolean z = false;
        if(Long.compare(v, -1L) != 0) {
            gfsx gfsx0 = flmu0.r(v);
            if(gfsx0.i()) {
                fmeu fmeu0 = new fmeu(((fmev)gfsx0.d()));
                fmeu0.e(this.c);
                fmev fmev0 = fmeu0.a();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("conversation_properties", floc.e(fmev0));
                Uri uri0 = flmu0.l("conversations");
                if(flmu0.e.b(uri0, contentValues0, "id = ?", new String[]{String.valueOf(v)}) < 0) {
                    flbj.c("SQLiteMessagingStore", "Failed to update conversation.");
                    return Boolean.valueOf(false);
                }
                flmu0.Y(v);
                flmu.ao();
                flmu0.K(fmev0.a);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

