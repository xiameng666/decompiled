import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

public final class fllt implements Callable {
    public final flmu a;
    public final fmft b;
    public final ConversationId c;
    public final fmft d;

    public fllt(flmu flmu0, fmft fmft0, ConversationId conversationId0, fmft fmft1) {
        this.a = flmu0;
        this.b = fmft0;
        this.c = conversationId0;
        this.d = fmft1;
    }

    @Override
    public final Object call() {
        ContentValues contentValues0 = new ContentValues();
        fmft fmft0 = this.b;
        contentValues0.put("message_status", Integer.valueOf(fmft0.o));
        flmu flmu0 = this.a;
        ConversationId conversationId0 = this.c;
        String s = Long.toString(flmu0.d(conversationId0));
        fmft fmft1 = this.d;
        String[] arr_s = {s, Integer.toString(fmft1.o)};
        ggdy ggdy0 = new ggdy();
        Uri uri0 = flmu0.l("messages");
        flnc flnc0 = flmu0.e;
        try(Cursor cursor0 = flnc0.h(uri0, new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ?", arr_s, null, null)) {
            if(cursor0.moveToFirst()) {
                flnc0.b(flmu0.l("messages"), contentValues0, "conversation_row_id = ? AND message_status = ?", arr_s);
                do {
                    String s1 = cursor0.getString(0);
                    ggdy0.i(s1);
                    flmu0.P(s1);
                    flmu.ap();
                }
                while(cursor0.moveToNext());
                flmu0.Z(conversationId0);
                if(flmu0.c.contains(fmft0) || flmu0.c.contains(fmft1)) {
                    flmu0.O(conversationId0);
                }
                flmu0.J(conversationId0);
                flmu0.Q(fmft1);
                flmu0.Q(fmft0);
            }
            return ggdy0.h();
        }
    }
}

