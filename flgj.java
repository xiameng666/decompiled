import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flgj implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final gfsx c;

    public flgj(flit flit0, AccountContext accountContext0, gfsx gfsx0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = gfsx0;
    }

    @Override
    public final void run() {
        flit flit0 = this.a;
        AccountContext accountContext0 = this.b;
        fmou fmou0 = flit0.d(accountContext0);
        gfsx gfsx0 = this.c;
        boolean z = fmou0.ag(((fmev)gfsx0.d()).a, ((fmev)gfsx0.d()).n);
        flbj.a("LiMsgController", "saveConversationContext: " + z);
        if(z) {
            synchronized(flit0) {
                if(flit0.o != null) {
                    Pair pair0 = Pair.create(accountContext0, ((fmev)gfsx0.d()).a);
                    flit0.o.put(pair0, new fmpf(gfsx0.d()));
                }
            }
        }
    }
}

