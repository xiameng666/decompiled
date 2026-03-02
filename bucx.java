import com.google.android.gms.googleone.escalation.account.service.EscalationAccountsChangedIntentOperation;
import java.util.Map;

public final class bucx extends ibsl implements ibtw {
    int a;
    final Map b;
    final EscalationAccountsChangedIntentOperation c;

    public bucx(Map map0, EscalationAccountsChangedIntentOperation escalationAccountsChangedIntentOperation0, ibrl ibrl0) {
        this.b = map0;
        this.c = escalationAccountsChangedIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bucx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bucx(this.b, this.c, ibrl0);
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
            buem buem0 = new buem(((buer)bufn0.a), this.b);
            Object object2 = oqj.c(((buer)bufn0.a).a, buem0, this);
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

