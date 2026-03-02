import android.accounts.Account;
import com.google.android.gms.common.Feature;

public final class egud implements lqj {
    public final eguv a;

    public egud(eguv eguv0) {
        this.a = eguv0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Account)object0) == null) {
            return;
        }
        String s = ((Account)object0).name;
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{ejxq.f};
        azzc0.a = new ejxy(this.a.y.a, s);
        azzc0.d = 20410;
        azzd azzd0 = azzc0.a();
        this.a.y.a.iG(azzd0).b(new eguh(this.a, ((Account)object0)));
    }
}

