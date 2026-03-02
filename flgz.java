import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.TimeUnit;

public final class flgz implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;

    public flgz(flit flit0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override
    public final void run() {
        flit flit0 = this.a;
        AccountContext accountContext0 = this.b;
        fmou fmou0 = flit0.d(accountContext0);
        ConversationId conversationId0 = this.c;
        fmft fmft0 = fmft.c;
        gged_interceptors gged0 = fmou0.w(conversationId0, fmft.b, fmft0);
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            fmai fmai0 = fmaj.a();
            fmai0.g(4);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            fmai0.p(s);
            fmai0.d(conversationId0);
            fmaj fmaj0 = fmai0.a();
            flit0.e.b(fmaj0);
        }
        flqv flqv0 = flqw.a();
        flqv0.a = "message receipt";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        fmou fmou1 = flit0.d(accountContext0);
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        flba.a();
        gged_interceptors gged1 = fmou1.v(conversationId0, fmft0, timeUnit0.toMicros(System.currentTimeMillis() - iado.b()));
        if(gged1.isEmpty()) {
            return;
        }
        gmbu.d(new gmcd[]{glzd.g(flit0.p(accountContext0, conversationId0), new flin(flit0, accountContext0, conversationId0, gged1, flqw0), flit0.b)}).c(new flio(flit0, accountContext0, conversationId0, gged1), gmap.a);
    }
}

