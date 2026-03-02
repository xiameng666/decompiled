import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import j..util.DesugarCollections;
import java.util.List;

public final class fxuh {
    public final fxtr a;
    private final azql b;
    private final List c;

    private fxuh(azql azql0, fxtr fxtr0, List list0) {
        this.b = azql0;
        this.a = fxtr0;
        this.c = DesugarCollections.unmodifiableList(list0);
    }

    public final int a(AccountConfig accountConfig0, String s) {
        int v = this.b(accountConfig0, s);
        if(v != 0) {
            return v;
        }
        return accountConfig0.f() ? 0 : 7;
    }

    public final int b(AccountConfig accountConfig0, String s) {
        if(!accountConfig0.d) {
            return 3;
        }
        if(s == null) {
            return 4;
        }
        if(!this.c.contains(s)) {
            return 5;
        }
        if(!this.b.g(s)) {
            return 5;
        }
        if(s.equals("com.google.android.gms")) {
            fxtr fxtr0 = this.a;
            if(!fxtr0.d().b.a) {
                return 14;
            }
            if(!fxtr0.d().b.c) {
                return 13;
            }
        }
        if(accountConfig0.g()) {
            return accountConfig0.s == 2 ? 10 : 0;
        }
        return 7;
    }

    public static fxuh c(Context context0) {
        fxva.g(context0);
        fxtr fxtr0 = fxtr.b(context0);
        List list0 = fxva.d(hzek.a.i().V());
        return new fxuh(azql.c(context0), fxtr0, list0);
    }
}

