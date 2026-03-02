import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.IOException;

public final class fmhz implements flws {
    private final fmid a;

    public fmhz(fmid fmid0) {
        this.a = fmid0;
    }

    @Override  // flws
    public final flwr a() {
        return new fmjg();
    }

    @Override  // flws
    public final gmcd b(AccountContext accountContext0, fmga fmga0) {
        gfsx gfsx0 = fmia.a(fmga0);
        if(!gfsx0.i()) {
            flbj.f("PhotosMsgController", "Attempted to upload a non-photo message");
            return gmbu.h(new IOException("Cannot upload non-photo message"));
        }
        fmjo fmjo0 = (fmjo)gfsx0.d();
        if(fmjo0.b == null) {
            flbj.f("PhotosMsgController", "Attempted to upload an image without a local copy");
            return gmbu.h(new IOException("Missing local URI for upload"));
        }
        if(fmjo0.a != null) {
            flbj.f("PhotosMsgController", "Attempted to upload an image twice");
            return gmbu.i(fmga0);
        }
        fmim fmim0 = new fmim(((fmiv)this.a), fmjo0, fmga0, fmga0.c, accountContext0);
        return ((fmiv)this.a).h.e(fmim0);
    }

    @Override  // flws
    public final String c() {
        return "photos";
    }

    @Override  // flws
    public final void d(AccountContext accountContext0, fmga fmga0, flsl flsl0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(27);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        flsl0.b(fmai0.a());
    }

    @Override  // flws
    public final void e(AccountContext accountContext0, fmga fmga0, flsl flsl0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(26);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        flsl0.b(fmai0.a());
    }

    @Override  // flws
    public final void f(AccountContext accountContext0) {
        fmiv fmiv0 = (fmiv)this.a;
        fmiq fmiq0 = new fmiq(fmiv0, accountContext0);
        fmiv0.g.e(fmiq0);
    }

    @Override  // flws
    public final void g(ConversationId conversationId0) {
        fmiv fmiv0 = (fmiv)this.a;
        fmig fmig0 = new fmig(fmiv0, conversationId0);
        gmcd gmcd0 = fmiv0.g.e(fmig0);
        fmih fmih0 = new fmih(fmiv0, conversationId0);
        gmcd gmcd1 = fmiv0.g.e(fmih0);
        gmbu.b(new gmcd[]{gmcd0, gmcd1}).a(new fmii(gmcd0, gmcd1), fmiv0.g);
    }
}

