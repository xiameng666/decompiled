import android.accounts.Account;
import android.content.Intent;

public final class dpdr extends ibsl implements ibtw {
    int a;
    final dpds b;
    final Intent c;
    final Account d;

    public dpdr(dpds dpds0, Intent intent0, Account account0, ibrl ibrl0) {
        this.b = dpds0;
        this.c = intent0;
        this.d = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dpdr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dpdr(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.a(this.c, this.d, this);
        return object2 == object1 ? object1 : object2;
    }
}

