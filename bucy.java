import com.google.android.gms.googleone.escalation.account.service.EscalationAccountsChangedIntentOperation;
import java.util.List;

public final class bucy extends ibsl implements ibtw {
    int a;
    final List b;
    final EscalationAccountsChangedIntentOperation c;

    public bucy(List list0, EscalationAccountsChangedIntentOperation escalationAccountsChangedIntentOperation0, ibrl ibrl0) {
        this.b = list0;
        this.c = escalationAccountsChangedIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bucy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bucy(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bufn bufn0 = this.c.a();
            ibuq.c(this.b);
            this.a = 1;
            bueg bueg0 = new bueg(((buer)bufn0.a), this.b);
            Object object2 = oqj.c(((buer)bufn0.a).a, bueg0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

