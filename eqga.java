import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import j..util.Objects;
import java.util.List;

final class eqga implements epyk {
    final eqgd a;

    public eqga(eqgd eqgd0) {
        Objects.requireNonNull(eqgd0);
        this.a = eqgd0;
        super();
    }

    @Override  // epyk
    public final void e(List list0) {
        eqgd.a.h("DirectTransfer completed! Transferred %d accounts", new Object[]{list0.size()});
        this.a.d.b(5);
    }

    @Override  // epyk
    public final void f(int v, String s) {
        eqgd.a.f("DirectTransfer onError: %d (%s)", new Object[]{v, s});
        switch(v) {
            case 10562: {
                this.a.d.a(-7);
                return;
            }
            case 10598: {
                this.a.d.a(-6);
                return;
            }
            default: {
                this.a.d.a(-5);
            }
        }
    }

    @Override  // epyk
    public final void g(PendingIntent pendingIntent0) {
        try {
            eqgd.a.d("onShowUi", new Object[0]);
            pendingIntent0.send(this.a.b, 0, null);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            eqgd.a.g("onShowUi failed", pendingIntent$CanceledException0, new Object[0]);
        }
    }
}

