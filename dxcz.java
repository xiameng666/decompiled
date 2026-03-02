import android.accounts.Account;
import com.google.android.gms.common.Feature;
import java.util.concurrent.TimeUnit;

public final class dxcz {
    public static final long a;
    public static final long b;
    public final Account c;
    public final clht d;
    public final azts e;

    static {
        dxcz.a = TimeUnit.SECONDS.toMillis(30L);
        dxcz.b = TimeUnit.SECONDS.toMillis(60L);
    }

    public dxcz(Account account0, azts azts0, clht clht0) {
        this.c = account0;
        this.e = azts0;
        this.d = clht0;
    }

    public final void a() {
        azzc azzc0 = new azzc();
        azzc0.a = new doqa(this.e, this.c);
        azzc0.c = new Feature[]{dlde.a};
        azzc0.b = false;
        azzc0.d = 7219;
        azzd azzd0 = azzc0.a();
        this.e.iG(azzd0);
        this.d.removeCallbacksAndMessages(null);
    }

    public final void b(String s) {
        this.d.removeCallbacksAndMessages(null);
        new dxcy(this, s).run();
    }

    public final void c() {
        this.d.removeCallbacksAndMessages(null);
    }
}

