import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flgh implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final fmbc d;
    public final String e;
    public final gfsx f;
    public final gfsx g;

    public flgh(flit flit0, AccountContext accountContext0, ConversationId conversationId0, fmbc fmbc0, String s, gfsx gfsx0, gfsx gfsx1) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = fmbc0;
        this.e = s;
        this.f = gfsx0;
        this.g = gfsx1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "send button or chip clicked event";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        hnry hnry0 = flxa.c(this.d);
        flzh flzh0 = new flzh(this.a.r.b, this.b, this.c, (((fmev)object0) == null ? ByteString.b : ((fmev)object0).n), hnry0, this.f, this.g, this.e);
        fmai fmai0 = fmaj.a();
        fmai0.g(18);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(flzh0.a);
        fmai0.d(this.c);
        fmaj fmaj0 = fmai0.a();
        this.a.r.c.b(fmaj0);
        UUID uUID0 = UUID.randomUUID();
        gmcd gmcd0 = this.a.r.a.d.d();
        gmcd gmcd1 = this.a.r.a.b(uUID0, flzh0, gmcd0, this.b, flqw0, true);
        gmbu.t(gmcd1, new flwh(this.a.r, this.b, flzh0, this.c), gmap.a);
        return gmcd1;
    }
}

