import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;

public final class flgd implements gfsi {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final gftc d;
    public final gftc e;

    public flgd(flit flit0, AccountContext accountContext0, ConversationId conversationId0, gftc gftc0, gftc gftc1) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = gftc0;
        this.e = gftc1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z;
        Object object1;
        if(((gfsx)object0).i()) {
            fmev fmev0 = (fmev)((gfsx)object0).d();
            fmev fmev1 = (fmev)((gfsx)object0).d();
            z = this.d.a(fmev1);
            object1 = fmev0;
        }
        else {
            fmeu fmeu0 = fmev.a();
            fmeu0.g(this.c);
            fmeu0.i(-1L);
            fmeu0.b(new HashMap());
            fmeu0.c(this.c.e() == ConversationId.IdType.a);
            object1 = fmeu0.a();
            z = false;
        }
        AccountContext accountContext0 = this.b;
        flit flit0 = this.a;
        boolean z1 = this.e.a(object1);
        gmcd gmcd0 = gmbu.i(object1);
        if(z) {
            gmcd0 = flit0.v(accountContext0, ((fmev)object1), false);
        }
        else if(object1.e && !object1.d.i()) {
            gmcd0 = flit0.o(accountContext0, ((fmev)object1));
        }
        if(z1) {
            gmbu.b(new gmcd[]{gmcd0}).b(new flid(), flit0.b);
        }
        return object1;
    }
}

