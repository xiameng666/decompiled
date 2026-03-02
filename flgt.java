import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flgt implements glzm {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;

    public flgt(flit flit0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override  // glzm
    public final gmcd a() {
        long v = this.a.d.b(this.b).e(this.c);
        flqv flqv0 = flqw.a();
        flqv0.a = "delete conversations";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        flyf flyf0 = new flyf(gged_interceptors.l(this.c), v, this.b);
        UUID uUID0 = UUID.randomUUID();
        gmcd gmcd0 = this.a.r.a.d.c();
        return this.a.r.a.b(uUID0, flyf0, gmcd0, this.b, flqw0, true);
    }
}

