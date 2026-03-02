import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmsg {
    public final fmse a;
    public fmsd b;
    private static final fmsd c;
    private final AccountContext d;
    private final ConversationId e;
    private final flkh f;

    static {
        fmsg.c = new fmsf();
    }

    public fmsg(AccountContext accountContext0, ConversationId conversationId0, flkh flkh0, fmse fmse0) {
        this.b = fmsg.c;
        this.d = accountContext0;
        this.e = conversationId0;
        this.f = flkh0;
        this.a = fmse0;
        fmse0.aL(this);
    }

    public final void a(boolean z) {
        if(!z) {
            this.f.g(this.d, this.e, 1);
        }
    }
}

