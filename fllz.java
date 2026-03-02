import android.content.ContentValues;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Iterator;
import java.util.List;

public final class fllz implements Runnable {
    public final flmu a;
    public final List b;
    public final long c;
    public final ConversationId d;

    public fllz(flmu flmu0, List list0, long v, ConversationId conversationId0) {
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
            Object object0 = iterator0.next();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("conversation_row_id", Long.valueOf(this.c));
            contentValues0.put("contact_row_id", ((Long)object0));
            Uri uri0 = flmu0.l("participants");
            flmu0.e.c(uri0, contentValues0, 5);
        }
        flmu0.N(this.d);
    }
}

