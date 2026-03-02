import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;

public final class flgb implements fmoz {
    public final flit a;
    public final gmcu b;
    public final AccountContext c;
    public final ConversationId d;

    public flgb(flit flit0, gmcu gmcu0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = flit0;
        this.b = gmcu0;
        this.c = accountContext0;
        this.d = conversationId0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        boolean z = ((gfsx)object0).i();
        gmcu gmcu0 = this.b;
        if(z) {
            flba.a();
            if(System.currentTimeMillis() <= ((fmev)((gfsx)object0).d()).f) {
                gmcu0.q(((fmev)((gfsx)object0).d()));
                return;
            }
        }
        fmeu fmeu0 = fmev.a();
        fmeu0.g(this.d);
        fmeu0.i(-1L);
        fmeu0.b(new HashMap());
        fmeu0.c(this.d.e() == ConversationId.IdType.a);
        gmcu0.t(this.a.v(this.c, fmeu0.a(), true));
    }
}

