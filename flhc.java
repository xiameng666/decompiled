import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.UUID;

public final class flhc implements glzn {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final String d;
    public final Boolean e;
    public final boolean f;

    public flhc(flit flit0, AccountContext accountContext0, ConversationId conversationId0, String s, Boolean boolean0, boolean z) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = s;
        this.e = boolean0;
        this.f = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = this.d;
        ByteString hfsf0 = ((fmev)object0) == null ? ByteString.b : ((fmev)object0).n;
        boolean z = this.e.booleanValue();
        flqv flqv0 = flqw.a();
        flqv0.a = "send conversation opened intent";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        ArrayList arrayList0 = new ArrayList();
        try {
            hntq hntq0 = flwi.e(s);
            if((hntq0.b & 2) != 0) {
                arrayList0 = (hntq0.e == null ? hnru.a : hntq0.e).b;
            }
        }
        catch(hfur hfur0) {
            flbj.d("TyMsgClient", "Unable to parse intent args", hfur0);
        }
        hnry hnry0 = flwi.d(this.c);
        UUID uUID0 = UUID.randomUUID();
        flyc flyc0 = new flyc(this.a.r.b, this.b, this.c, hfsf0, s, z, this.f, hnry0, arrayList0);
        fmai fmai0 = fmaj.a();
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(flyc0.a);
        fmai0.d(this.c);
        fmai0.h(gged_interceptors.i(arrayList0));
        fmai0.g(18);
        fmaj fmaj0 = fmai0.a();
        this.a.r.c.b(fmaj0);
        gmcd gmcd0 = this.a.r.a.d.d();
        gmcd gmcd1 = this.a.r.a.b(uUID0, flyc0, gmcd0, this.b, flqw0, true);
        gmbu.t(gmcd1, new flwf(this.a.r, fmai0), gmap.a);
        return gmcd1;
    }
}

