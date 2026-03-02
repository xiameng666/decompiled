import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flld implements Runnable {
    public final flmu a;
    public final fmga b;
    public final boolean c;
    public final ContentValues d;

    public flld(flmu flmu0, fmga fmga0, boolean z, ContentValues contentValues0) {
        this.a = flmu0;
        this.b = fmga0;
        this.c = z;
        this.d = contentValues0;
    }

    @Override
    public final void run() {
        int v;
        fmft fmft0;
        flmu flmu0;
        fmga fmga0 = this.b;
        gfsx gfsx0 = this.c ? gfsx.m(Long.valueOf(fmga0.d)) : gfqx.a;
        ContentValues contentValues0 = this.d;
        flmu0 = this.a;
        contentValues0.put("conversation_row_id", Long.valueOf(flmu0.i(fmga0.c, gfsx0)));
        contentValues0.put("sender_contact_row_id", Long.valueOf(flmu0.g(fmga0.b)));
        Uri uri0 = flmu0.l("messages");
        try(Cursor cursor0 = flmu0.e.h(uri0, new String[]{"message_status"}, "message_id = ?", new String[]{fmga0.a}, null, null)) {
            fmft0 = null;
            v = 0;
            if(cursor0.moveToFirst()) {
                fmft0 = fmft.a(cursor0.getInt(0));
            }
        }
        Uri uri1 = flmu0.l("messages");
        if(flmu0.e.c(uri1, contentValues0, 5) < 0L) {
            throw new SQLiteException("Failed to save message.");
        }
        flmu0.P(fmga0.a);
        ConversationId conversationId0 = fmga0.c;
        flmu0.J(conversationId0);
        int v1 = 1;
        if(fmft0 != null && !fmft0.equals(fmga0.g)) {
            v = 1;
        }
        gged_interceptors gged0 = flmu0.c;
        fmft fmft1 = fmga0.g;
        if(gged0.contains(fmft1)) {
            v1 = v;
        label_39:
            flmu0.O(conversationId0);
            if(v1 != 0) {
                flmu0.Q(fmft0);
                flmu.ap();
            }
        }
        else if(v != 0) {
            if(gged0.contains(fmft0)) {
                goto label_39;
            }
            else {
                flmu0.Q(fmft0);
                flmu.ap();
            }
        }
        flmu0.Q(fmft1);
    }
}

