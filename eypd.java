import android.accounts.Account;
import java.util.List;

final class eypd extends ibsl implements ibtw {
    int a;
    final eypi b;
    final Account c;

    public eypd(eypi eypi0, Account account0, ibrl ibrl0) {
        this.b = eypi0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eypd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eypd(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.d.a(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        ((ggtj)this.b.e.h()).B("Notified device list: %s", ((List)object0));
        return ibom.a;
    }
}

