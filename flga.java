import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flga implements fmoz {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final fltq d;

    public flga(flit flit0, AccountContext accountContext0, ConversationId conversationId0, fltq fltq0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = fltq0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        if(!((gfsx)object0).i()) {
            flbj.c("LiMsgController", "Profile changes received for non-existent conversation.");
            return;
        }
        fltq fltq0 = this.d;
        fmev fmev0 = (fmev)((gfsx)object0).d();
        gfsx gfsx0 = fltq0.k;
        if(gfsx0.i()) {
            long v = (long)(((Long)gfsx0.d()));
            if(fmev0.m > v) {
                flbj.c("LiMsgController", "Profile changes received that were older than current conversation.");
                return;
            }
        }
        flbj.a("LiMsgController", "Profile changes: " + fltq0 + " for conversation: " + this.c);
        flib flib0 = new flib(this.a, this.b, fmev0, fltq0);
        this.a.b.d(flib0);
    }
}

