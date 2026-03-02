import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;

final class flip implements gmbg {
    final AccountContext a;
    final ConversationId b;
    final flit c;

    public flip(flit flit0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = accountContext0;
        this.b = conversationId0;
        Objects.requireNonNull(flit0);
        this.c = flit0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(0xCF);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.d(this.b);
        fmaj fmaj0 = fmai0.a();
        this.c.e.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(206);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.d(this.b);
        fmaj fmaj0 = fmai0.a();
        this.c.e.b(fmaj0);
    }
}

