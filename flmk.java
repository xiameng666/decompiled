import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flmk implements gfsi {
    public final flmu a;
    public final ConversationId b;

    public flmk(flmu flmu0, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = conversationId0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gged_interceptors gged0 = flon.b(this.b, ((Cursor)object0));
        gged_interceptors gged1 = flof.d(gged0);
        int v = ((ggna)gged1).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmaj fmaj0 = (fmaj)gged1.get(v1);
            this.a.d.b(fmaj0);
        }
        return flof.e(gged0);
    }
}

