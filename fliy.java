import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.Arrays;
import java.util.List;

public final class fliy implements glzn {
    public final fljc a;
    public final AccountContext b;
    public final Notification c;
    public final flqw d;

    public fliy(fljc fljc0, AccountContext accountContext0, Notification notification0, flqw flqw0) {
        this.a = fljc0;
        this.b = accountContext0;
        this.c = notification0;
        this.d = flqw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ConversationId conversationId0 = this.c.e().d();
        ByteString hfsf0 = ((gfsx)object0).i() ? ((fmev)((gfsx)object0).d()).n : ByteString.b;
        List list0 = Arrays.asList(new String[]{this.c.e().i()});
        return this.a.g.b(this.b, conversationId0, hfsf0, list0, this.d);
    }
}

