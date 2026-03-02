import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

public final class flgl implements Runnable {
    public final flit a;
    public final gfsx b;

    public flgl(flit flit0, gfsx gfsx0) {
        this.a = flit0;
        this.b = gfsx0;
    }

    @Override
    public final void run() {
        synchronized(this.a) {
            ConversationId conversationId0 = ((fmev)this.b.d()).a;
            Map map0 = ((fmev)this.b.d()).i;
            this.a.p.put(conversationId0, map0);
        }
    }
}

