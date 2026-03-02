import android.accounts.Account;
import com.google.android.gms.multidevice.service.GcmChimeraIntentOperation;

public final class cteu extends ibsl implements ibtw {
    int a;
    final GcmChimeraIntentOperation b;
    final Account c;

    public cteu(GcmChimeraIntentOperation gcmChimeraIntentOperation0, Account account0, ibrl ibrl0) {
        this.b = gcmChimeraIntentOperation0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cteu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cteu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibnf ibnf0 = this.b.c;
            if(ibnf0 == null) {
                ibuq.j("accountDeviceGroupsRepository");
                ibnf0 = null;
            }
            cstg cstg0 = (cstg)ibnf0.get();
            this.a = 1;
            if(cstg0.c(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

