import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.Map;

public final class flfh implements glzn {
    public final flfv a;
    public final ConversationId b;
    public final Map c;
    public final flqw d;

    public flfh(flfv flfv0, ConversationId conversationId0, Map map0, flqw flqw0) {
        this.a = flfv0;
        this.b = conversationId0;
        this.c = map0;
        this.d = flqw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ByteString hfsf0 = ((gfsx)object0).i() ? ((fmev)((gfsx)object0).d()).n : ByteString.b;
        gged_interceptors gged0 = gged_interceptors.i(((Collection)this.c.get(this.b)));
        return this.a.t.b(this.a.b, this.b, hfsf0, gged0, this.d);
    }
}

