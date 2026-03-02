import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

public final class fldt {
    public static final fmpk a;
    public final gmcg b;
    public final flnb c;
    final Set d;
    public final flvz e;
    private final flky f;
    private final flkh g;

    static {
        fldt.a = new fmpk();
    }

    public fldt(flky flky0, flvz flvz0, flnb flnb0, flkh flkh0) {
        this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f = flky0;
        this.e = flvz0;
        this.b = flbs.b().a;
        this.c = flnb0;
        this.g = flkh0;
    }

    public final fmou a(AccountContext accountContext0) {
        return this.f.b(accountContext0);
    }

    public final fmpa b(AccountContext accountContext0, ConversationId conversationId0) {
        return this.c(accountContext0, conversationId0, gftj.b);
    }

    public final fmpa c(AccountContext accountContext0, ConversationId conversationId0, gftc gftc0) {
        return fmot.d(this.a(accountContext0).n(fmpk.a(conversationId0)), new fldh(this, gftc0, accountContext0));
    }

    public final gmcd d(AccountContext accountContext0, ConversationId conversationId0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "block conversation";
        flqv0.b(flra.c);
        gmcd gmcd0 = gmbu.n(new fldl(this, accountContext0, conversationId0, flqv0.a()), this.b);
        this.g.d(conversationId0);
        return this.i(gmcd0, accountContext0, conversationId0);
    }

    public final gmcd e(AccountContext accountContext0, ConversationId conversationId0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "block conversation and mark spam";
        flqv0.b(flra.c);
        gmcd gmcd0 = gmbu.n(new fldj(this, accountContext0, conversationId0, flqv0.a()), this.b);
        this.g.d(conversationId0);
        return this.i(gmcd0, accountContext0, conversationId0);
    }

    public final gmcd f(AccountContext accountContext0, ConversationId conversationId0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "unblock conversation";
        flqv0.b(flra.c);
        gmcd gmcd0 = glzd.f(gmbu.n(new fldp(this, accountContext0, conversationId0, flqv0.a()), this.b), new fldq(this, accountContext0, conversationId0), gmap.a);
        return gmbu.b(new gmcd[]{gmcd0}).a(new fldr(gmcd0), gmap.a);
    }

    public final void g(AccountContext accountContext0) {
        if(!this.d.add(accountContext0)) {
            return;
        }
        flde flde0 = new flde(this, glzd.f(this.h(accountContext0, null), new fldd(this, accountContext0), gmap.a), accountContext0);
        this.b.d(flde0);
    }

    public final gmcd h(AccountContext accountContext0, String s) {
        flqv flqv0 = flqw.a();
        flqv0.a = "fetch blocked conversation";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        return glzd.f(gmbu.n(new fldi(this, accountContext0, s, ((int)iadc.a.c().a()), flqw0), this.b), new flds(this, accountContext0), this.b);
    }

    private final gmcd i(gmcd gmcd0, AccountContext accountContext0, ConversationId conversationId0) {
        gmcd gmcd1 = glzd.f(gmcd0, new fldn(this, accountContext0, conversationId0), gmap.a);
        return gmbu.b(new gmcd[]{gmcd1}).a(new fldo(gmcd1), gmap.a);
    }
}

