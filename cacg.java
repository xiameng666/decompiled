import android.accounts.Account;
import java.util.concurrent.TimeUnit;

final class cacg extends ibsl implements ibtw {
    final cacp a;
    final Account b;

    public cacg(cacp cacp0, Account account0, ibrl ibrl0) {
        this.a = cacp0;
        this.b = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cacg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cacg(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a.b.w(this.b, this.a.c, true).getResult(3000L, TimeUnit.MILLISECONDS);
    }
}

