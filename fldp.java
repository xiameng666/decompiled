import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class fldp implements glzm {
    public final fldt a;
    public final AccountContext b;
    public final ConversationId c;
    public final flqw d;

    public fldp(fldt fldt0, AccountContext accountContext0, ConversationId conversationId0, flqw flqw0) {
        this.a = fldt0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        UUID uUID0 = UUID.randomUUID();
        flzq flzq0 = new flzq(this.b, this.c);
        gmcd gmcd0 = this.a.e.a.d.b();
        return this.a.e.a.b(uUID0, flzq0, gmcd0, this.b, this.d, true);
    }
}

