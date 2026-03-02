import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flgo implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;

    public flgo(flit flit0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override
    public final void run() {
        fmai fmai0 = fmaj.a();
        fmai0.g(10017);
        fmai0.n(this.b.c().f());
        fmai0.d(this.c);
        fmaj fmaj0 = fmai0.a();
        this.a.e.b(fmaj0);
        this.a.d(this.b).B(this.c);
        fmai fmai1 = fmaj.a();
        fmai1.g(10018);
        fmai1.n(this.b.c().f());
        fmai1.d(this.c);
        fmaj fmaj1 = fmai1.a();
        this.a.e.b(fmaj1);
        fmai fmai2 = fmaj.a();
        fmai2.g(10019);
        fmai2.n(this.b.c().f());
        fmai2.d(this.c);
        fmaj fmaj2 = fmai2.a();
        this.a.e.b(fmaj2);
    }
}

