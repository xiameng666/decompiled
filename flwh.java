import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;

public final class flwh implements gmbg {
    final AccountContext a;
    final flzh b;
    final ConversationId c;
    final flwi d;

    public flwh(flwi flwi0, AccountContext accountContext0, flzh flzh0, ConversationId conversationId0) {
        this.a = accountContext0;
        this.b = flzh0;
        this.c = conversationId0;
        Objects.requireNonNull(flwi0);
        this.d = flwi0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(20);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.a);
        fmai0.d(this.c);
        fmaj fmaj0 = fmai0.a();
        this.d.c.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(19);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(this.b.a);
        fmai0.d(this.c);
        fmaj fmaj0 = fmai0.a();
        this.d.c.b(fmaj0);
    }
}

