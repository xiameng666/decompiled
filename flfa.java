import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;
import java.util.Map;

public final class flfa implements Runnable {
    public final flfv a;
    public final ConversationId b;
    public final Map c;
    public final flqw d;

    public flfa(flfv flfv0, ConversationId conversationId0, Map map0, flqw flqw0) {
        this.a = flfv0;
        this.b = conversationId0;
        this.c = map0;
        this.d = flqw0;
    }

    @Override
    public final void run() {
        this.a.d.p(this.b);
        gmcu gmcu0 = new gmcu();
        fmpa fmpa0 = this.a.d.p(this.b);
        Objects.requireNonNull(gmcu0);
        fmpa0.k(new flff(gmcu0));
        gmbu.d(new gmcd[]{glzd.g(gmcu0, new flfh(this.a, this.b, this.c, this.d), this.a.e)}).a(new flfi(this.a, this.c, this.b), this.a.e);
    }
}

