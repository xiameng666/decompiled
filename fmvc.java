import android.support.v7.widget.Toolbar;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.conversationheader.ConversationHeaderView;
import j..util.Objects;
import java.util.UUID;

public final class fmvc {
    public fmqs a;
    public final fmpa b;
    public final fmpa c;
    public final fmoz d;
    public final fmpe e;
    public fmuy f;
    public UUID g;
    public final ConversationHeaderView h;
    public fmsv i;
    public fmsw j;

    public fmvc(ConversationId conversationId0, gfsx gfsx0, AccountContext accountContext0, flit flit0, ConversationHeaderView conversationHeaderView0) {
        fmvd fmvd0;
        this.d = new fmuz(this);
        this.i = null;
        this.j = null;
        this.f = new fmva();
        this.h = conversationHeaderView0;
        Toolbar toolbar0 = conversationHeaderView0.a;
        if(iaea.l()) {
            Objects.requireNonNull(this);
            fmvd0 = new fmvd(this);
        }
        else {
            Objects.requireNonNull(this);
            fmvd0 = new fmve(this);
        }
        toolbar0.x(fmvd0);
        Objects.requireNonNull(this);
        toolbar0.s = new fmvf();
        fmpa fmpa0 = flit0.h(accountContext0, conversationId0);
        this.b = fmpa0;
        this.c = gfsx0.i() ? fmot.d(((fmpa)gfsx0.d()), new fmvb()) : flit0.d(accountContext0).aj(conversationId0);
        this.e = new fmpe(new fmpa[]{fmpa0, this.c});
    }
}

