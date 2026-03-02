import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public final class aqzk {
    protected final aqsh a;
    public final ConcurrentHashMap b;
    private final ExecutorService c;
    private final Context d;

    public aqzk(ExecutorService executorService0, Context context0) {
        aqsh aqsh0 = new aqsh(context0);
        super();
        this.b = new ConcurrentHashMap();
        gftb.check(executorService0);
        this.c = executorService0;
        this.a = aqsh0;
        this.d = context0;
    }

    public final Drawable a(Bitmap bitmap0) {
        Drawable drawable0 = new jxy(this.d.getResources(), bitmap0);
        ((jxz)drawable0).c();
        return drawable0;
    }

    public final gfsx b(String s) {
        return gfsx.l(((Bitmap)this.b.get(s)));
    }

    public final void c(Account account0, Runnable runnable0) {
        if(this.b.containsKey(account0.name)) {
            return;
        }
        aqzj aqzj0 = new aqzj(this, account0, runnable0);
        this.c.execute(aqzj0);
    }
}

