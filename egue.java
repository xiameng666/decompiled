import android.accounts.Account;
import j..util.Objects;

public final class egue implements lqj {
    public final eguv a;

    public egue(eguv eguv0) {
        this.a = eguv0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        eguu eguu0 = this.a.n;
        if(Objects.equals(((Account)object0), eguu0.a)) {
            return;
        }
        eguu0.b(((Account)object0));
    }
}

