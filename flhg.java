import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class flhg implements gfsi {
    public final flit a;
    public final String b;
    public final ConversationId c;
    public final AccountContext d;

    public flhg(flit flit0, String s, ConversationId conversationId0, AccountContext accountContext0) {
        this.a = flit0;
        this.b = s;
        this.c = conversationId0;
        this.d = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmfm fmfm0 = fmga.a();
        fmfm0.j("messageID");
        fmfm0.f = 2;
        fmfm0.k(fmft.h);
        fmfm0.e(this.c);
        fmfm0.a = this.c.a();
        fmfm0.s("intent: " + this.b + ", isEmptyDeviceConversation: " + ((Boolean)object0).toString() + ", enableLighterIntentWelcomeMessage: false");
        fmfm0.f("");
        fmfm0.n("");
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        flba.a();
        fmfm0.m(timeUnit0.toMicros(System.currentTimeMillis()));
        fmfm0.l(new HashMap());
        fmfm0.c(0xC0);
        fmfm0.p();
        fmfm0.h(fmfz.a.g);
        fmga fmga0 = fmfm0.a();
        this.a.d(this.d).V(fmga0);
        return null;
    }
}

