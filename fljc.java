import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;

public final class fljc implements flby {
    public static final ggeo a;
    public static final ggeo b;
    public final Context c;
    public final flky d;
    public final flsl e;
    public final gmcg f;
    public final flwi g;
    public final flna h;
    public final fier i;

    static {
        Integer integer0 = (int)10;
        Integer integer1 = (int)30;
        Integer integer2 = (int)40;
        Integer integer3 = (int)20;
        fljc.a = ggeo.o(integer0, Integer.valueOf(0x85), integer1, Integer.valueOf(0x86), integer2, Integer.valueOf(0x87), integer3, Integer.valueOf(0x88));
        fljc.b = ggeo.o(integer0, Integer.valueOf(0x89), integer1, Integer.valueOf(0x8A), integer2, Integer.valueOf(0x8B), integer3, Integer.valueOf(140));
    }

    public fljc(Context context0, flwi flwi0, flna flna0, flky flky0, fier fier0) {
        this.c = context0;
        this.g = flwi0;
        this.h = flna0;
        this.d = flky0;
        this.i = fier0;
        this.f = flbs.b().a;
        this.e = flsl.a(context0);
    }

    @Override  // flby
    public final gmcd a(AccountContext accountContext0, ConversationId conversationId0, String s, gfsi gfsi0, MessageReceivedNotification messageReceivedNotification0) {
        return gmbu.m(new fliw(this, accountContext0, conversationId0, s, gfsi0, messageReceivedNotification0), this.f);
    }

    @Override  // flby
    public final gmcd b(AccountContext accountContext0, String s, String s1, gfsi gfsi0, long v) {
        return gmbu.m(new fliz(this, accountContext0, s, s1, gfsi0, v), this.f);
    }

    @Override  // flby
    public final void c(AccountContext accountContext0, gged_interceptors gged0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(0xD0);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(gged0.toString());
        fmaj fmaj0 = fmai0.a();
        this.e.b(fmaj0);
        gmbu.t(gmbu.l(new flix(this, accountContext0, gged0), this.f), new fljb(this, accountContext0, gged0), this.f);
    }

    public final fmou d(AccountContext accountContext0) {
        return this.d.b(accountContext0);
    }

    public final void e(int v, gfsx gfsx0, gfsx gfsx1, int v1, gfsx gfsx2) {
        fmai fmai0 = fmaj.a();
        fmai0.g(v);
        fmai0.f(v1);
        if(gfsx0.i()) {
            fmai0.o(((AccountContext)gfsx0.d()).d().toStringUtf8());
        }
        if(gfsx1.i()) {
            MessageReceivedNotification messageReceivedNotification0 = (MessageReceivedNotification)gfsx1.d();
            fmai0.n(messageReceivedNotification0.d().a());
            fmai0.p(messageReceivedNotification0.i());
            fmai0.d(messageReceivedNotification0.d());
        }
        else if(gfsx2.i()) {
            fmai0.p(((String)gfsx2.d()));
        }
        fmaj fmaj0 = fmai0.a();
        this.e.b(fmaj0);
    }
}

