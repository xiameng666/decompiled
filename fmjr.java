import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmjr implements flws {
    private final Context a;

    public fmjr(Context context0) {
        this.a = context0;
    }

    @Override  // flws
    public final flwr a() {
        return new fmke(this.a);
    }

    @Override  // flws
    public final gmcd b(AccountContext accountContext0, fmga fmga0) {
        return gmbu.i(fmga0);
    }

    @Override  // flws
    public final String c() {
        return "rich_card";
    }

    @Override  // flws
    public final void d(AccountContext accountContext0, fmga fmga0, flsl flsl0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(36);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        flsl0.b(fmai0.a());
    }

    @Override  // flws
    public final void e(AccountContext accountContext0, fmga fmga0, flsl flsl0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(35);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        flsl0.b(fmai0.a());
    }

    @Override  // flws
    public final void f(AccountContext accountContext0) {
        gmbu.i(Boolean.valueOf(true));
    }

    @Override  // flws
    public final void g(ConversationId conversationId0) {
        gmbu.i(Boolean.valueOf(true));
    }
}

