import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flhz implements glzm {
    public final flit a;
    public final AccountContext b;
    public final fmev c;
    public final flqw d;

    public flhz(flit flit0, AccountContext accountContext0, fmev fmev0, flqw flqw0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmev0;
        this.d = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        fmev fmev0 = this.c;
        ConversationId conversationId0 = fmev0.a;
        if(conversationId0.e() != ConversationId.IdType.b) {
            return gmbu.i(new flkj(1, gfqx.a));
        }
        UUID uUID0 = UUID.randomUUID();
        flyk flyk0 = new flyk(this.a.r.b, this.b, conversationId0, fmev0.n);
        gmcd gmcd0 = this.a.r.a.d.d();
        return this.a.r.a.b(uUID0, flyk0, gmcd0, this.b, this.d, true);
    }
}

