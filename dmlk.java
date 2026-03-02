import android.accounts.Account;
import android.content.Context;

final class dmlk extends ibsl implements ibtw {
    final Context a;
    final Account b;

    public dmlk(Context context0, Account account0, ibrl ibrl0) {
        this.a = context0;
        this.b = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmlk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmlk(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return dlmj.b(this.a, this.b.name);
    }
}

