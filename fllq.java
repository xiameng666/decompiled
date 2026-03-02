import android.database.Cursor;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

public final class fllq implements Callable {
    public final flmu a;
    public final ConversationId b;
    public final fmft c;
    public final long d;

    public fllq(flmu flmu0, ConversationId conversationId0, fmft fmft0, long v) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = fmft0;
        this.d = v;
    }

    @Override
    public final Object call() {
        String s = Long.toString(this.a.d(this.b));
        ggdy ggdy0 = new ggdy();
        Uri uri0 = this.a.l("messages");
        try(Cursor cursor0 = this.a.e.h(uri0, new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us > ?", new String[]{s, Integer.toString(this.c.o), Long.toString(this.d)}, null, null)) {
            if(cursor0.moveToFirst()) {
                do {
                    ggdy0.i(cursor0.getString(0));
                }
                while(cursor0.moveToNext());
            }
            return ggdy0.h();
        }
    }
}

