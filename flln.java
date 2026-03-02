import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flln implements Runnable {
    public final flmu a;
    public final ConversationId b;
    public final fmel[] c;

    public flln(flmu flmu0, ConversationId conversationId0, fmel[] arr_fmel) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = arr_fmel;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.b;
        long v = flmu0.i(conversationId0, gfqx.a);
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        while(true) {
            fmel[] arr_fmel = this.c;
            if(v1 >= arr_fmel.length) {
                break;
            }
            fmel fmel0 = arr_fmel[v1];
            fmga fmga0 = fmel0.a;
            long v4 = fmga0.d;
            if(v3 < v4) {
                v3 = v4;
            }
            ContentValues contentValues0 = flmu.k(fmga0);
            contentValues0.put("needs_delivery_receipt", ((Boolean)fmel0.b.f(Boolean.valueOf(false))));
            contentValues0.put("conversation_row_id", Long.valueOf(v));
            contentValues0.put("sender_contact_row_id", Long.valueOf(flmu0.g(fmga0.b)));
            Uri uri0 = flmu0.l("messages");
            if(flmu0.e.c(uri0, contentValues0, 5) < 0L) {
                throw new SQLiteException("Failed to save message.");
            }
            flmu0.P(fmga0.a);
            flmu0.M(fmga0.c);
            v2 |= flmu0.c.contains(fmga0.g);
            gfsx gfsx0 = fmel0.c;
            if(gfsx0.i()) {
                flbj.a("SQLiteMessagingStore", "Saving suggestion list for cloud message");
                flmu0.m(((fmhr)gfsx0.d()));
            }
            ++v1;
            continue;
        }
        flmu.an();
        if(v2 != 0) {
            flmu0.O(conversationId0);
        }
        flmu0.i(conversationId0, gfsx.m(Long.valueOf(v3)));
    }
}

