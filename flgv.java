import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.TimeUnit;

public final class flgv implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final fmga c;
    public final boolean d;

    public flgv(flit flit0, AccountContext accountContext0, fmga fmga0, boolean z) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmga0;
        this.d = z;
    }

    @Override
    public final void run() {
        fier fier0 = this.a.s;
        Context context0 = fier0.a;
        fijc fijc0 = fijc.b(context0);
        fmga fmga0 = this.c;
        String s = fmga0.a;
        ConversationId conversationId0 = fmga0.c;
        fijc0.k(1709, s, conversationId0);
        if(this.d) {
            return;
        }
        fijc.b(context0).k(2085, s, conversationId0);
        flby flby0 = fieh.a(context0).c();
        fiid.a(context0);
        fiep fiep0 = new fiep(fier0);
        long v = TimeUnit.MICROSECONDS.toMillis(fmga0.d);
        fieq fieq0 = new fieq(fier0, fmga0, this.b);
        gmbu.t(flby0.b(this.b, conversationId0.toString(), s, fiep0, v), fieq0, gmap.a);
    }
}

