import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;

public final class flka implements Runnable {
    public final flkh a;
    public final AccountContext b;
    public final ConversationId c;
    public final boolean d;
    public final long e;
    public final int f;

    public flka(flkh flkh0, AccountContext accountContext0, ConversationId conversationId0, boolean z, long v, int v1) {
        this.a = flkh0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    @Override
    public final void run() {
        flkh flkh0 = this.a;
        ConversationId conversationId0 = this.c;
        synchronized(flkh0) {
            flba.a();
            flkh0.d.put(conversationId0, Long.valueOf(System.currentTimeMillis()));
        }
        flqv flqv0 = flqw.a();
        flqv0.a = "send typing indicator";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        gmcu gmcu0 = new gmcu();
        fmpa fmpa0 = flkh0.a.b(this.b).p(conversationId0);
        Objects.requireNonNull(gmcu0);
        fmpa0.k(new flkb(gmcu0));
        glzd.g(gmcu0, new flkf(flkh0, this.b, conversationId0, this.d, this.e, flqw0, this.f), flkh0.b);
    }
}

