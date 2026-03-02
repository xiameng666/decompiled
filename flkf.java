import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flkf implements glzn {
    public final flkh a;
    public final AccountContext b;
    public final ConversationId c;
    public final boolean d;
    public final long e;
    public final flqw f;
    public final int g;

    public flkf(flkh flkh0, AccountContext accountContext0, ConversationId conversationId0, boolean z, long v, flqw flqw0, int v1) {
        this.a = flkh0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = z;
        this.e = v;
        this.f = flqw0;
        this.g = v1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ByteString hfsf0 = ((gfsx)object0).i() ? ((fmev)((gfsx)object0).d()).n : ByteString.b;
        hnry hnry0 = flwi.d(this.c);
        flzn flzn0 = new flzn(this.a.f.b, this.b, this.c, hfsf0, this.d, this.e, hnry0);
        fmai fmai0 = fmaj.a();
        fmai0.g(18);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(flzn0.a);
        fmai0.d(this.c);
        fmaj fmaj0 = fmai0.a();
        this.a.f.c.b(fmaj0);
        fmai fmai1 = fmaj.a();
        fmai1.g(46);
        fmai1.f(this.g);
        fmai1.n(this.b.c().f());
        fmai1.o(this.b.d().toStringUtf8());
        fmai1.p(flzn0.a);
        fmai1.d(this.c);
        fmaj fmaj1 = fmai1.a();
        this.a.f.c.b(fmaj1);
        UUID uUID0 = UUID.randomUUID();
        gmcd gmcd0 = this.a.f.a.d.d();
        gmcd gmcd1 = this.a.f.a.b(uUID0, flzn0, gmcd0, this.b, this.f, true);
        gmbu.t(gmcd1, new flwe(this.a.f, this.b, flzn0, this.c), gmap.a);
        return gmcd1;
    }
}

