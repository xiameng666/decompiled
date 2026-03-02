import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.UUID;

public final class flgf implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final Map d;
    public final String e;

    public flgf(flit flit0, AccountContext accountContext0, ConversationId conversationId0, Map map0, String s) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = map0;
        this.e = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "send callback intent";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        hnry hnry0 = flwi.d(this.c);
        UUID uUID0 = UUID.randomUUID();
        flya flya0 = new flya(this.a.r.b, this.b, this.c, (((fmev)object0) == null ? ByteString.b : ((fmev)object0).n), this.d, hnry0, this.e);
        fmai fmai0 = fmaj.a();
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(flya0.a);
        fmai0.d(this.c);
        fmai0.g(18);
        fmaj fmaj0 = fmai0.a();
        this.a.r.c.b(fmaj0);
        gmcd gmcd0 = this.a.r.a.d.d();
        gmcd gmcd1 = this.a.r.a.b(uUID0, flya0, gmcd0, this.b, flqw0, true);
        gmbu.t(gmcd1, new flwg(this.a.r, fmai0), gmap.a);
        return gmcd1;
    }
}

