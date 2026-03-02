import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flkd implements fmoz {
    public final flkh a;
    public final AccountContext b;
    public final ConversationId c;
    public final boolean d;
    public final long e;
    public final int f;

    public flkd(flkh flkh0, AccountContext accountContext0, ConversationId conversationId0, boolean z, long v, int v1) {
        this.a = flkh0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        if(((gfsx)object0).i()) {
            flka flka0 = new flka(this.a, this.b, this.c, this.d, this.e, this.f);
            this.a.b.d(flka0);
        }
    }
}

