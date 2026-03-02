import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flvz {
    public final flvd a;

    public flvz(flvd flvd0) {
        this.a = flvd0;
    }

    public final gmcd a(AccountContext accountContext0, ConversationId conversationId0, flqw flqw0, boolean z) {
        UUID uUID0 = UUID.randomUUID();
        flxw flxw0 = new flxw(accountContext0, conversationId0, z);
        gmcd gmcd0 = this.a.d.b();
        return this.a.b(uUID0, flxw0, gmcd0, accountContext0, flqw0, true);
    }
}

