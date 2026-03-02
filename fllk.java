import android.content.ContentValues;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Set;

public final class fllk implements Runnable {
    public final flmu a;
    public final gged_interceptors b;
    public final ggeo c;
    public final Set d;

    public fllk(flmu flmu0, gged_interceptors gged0, ggeo ggeo0, Set set0) {
        this.a = flmu0;
        this.b = gged0;
        this.c = ggeo0;
        this.d = set0;
    }

    @Override
    public final void run() {
        flmu flmu0;
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.b;
            Set set0 = this.d;
            flmu0 = this.a;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            fmga fmga0 = (fmga)gged0.get(v);
            Uri uri0 = flmu0.l("messages");
            ContentValues contentValues0 = (ContentValues)this.c.get(fmga0.a);
            flmu0.e.b(uri0, contentValues0, "message_id = ?", new String[]{fmga0.a});
            flmu0.P(fmga0.a);
            set0.add(fmga0.c);
        }
        for(Object object0: set0) {
            flmu0.J(((ConversationId)object0));
        }
    }
}

