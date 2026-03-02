import android.accounts.Account;
import com.google.android.gms.multidevice.service.AccountChangeIntentOperation;
import java.util.Iterator;
import java.util.List;

public final class ctes extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final List d;
    final AccountChangeIntentOperation e;

    public ctes(List list0, AccountChangeIntentOperation accountChangeIntentOperation0, ibrl ibrl0) {
        this.d = list0;
        this.e = accountChangeIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctes)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctes(this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object6;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                object3 = this.d.iterator();
                goto label_25;
            }
            case 1: {
                Object object4 = this.b;
                Object object5 = this.a;
                ibnx.b(object0);
                object6 = object4;
                object2 = object5;
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_23;
            }
        }
        while(true) {
            ibnf ibnf0 = this.e.d;
            if(ibnf0 == null) {
                ibuq.j("settingsManager");
                ibnf0 = null;
            }
            csxk csxk0 = (csxk)ibnf0.get();
            ibuq.c(object6);
            this.a = object2;
            this.b = null;
            this.c = 2;
            if(csxk0.a(((Account)object6), this) == object1) {
                break;
            }
        label_23:
            object3 = object2;
            ((ggtj)AccountChangeIntentOperation.a.h()).x("Finished removing account");
        label_25:
            if(((Iterator)object3).hasNext()) {
                Object object7 = ((Iterator)object3).next();
                cumf.a(AccountChangeIntentOperation.a).B("Removal of account: %s", ((Account)object7));
                ibnf ibnf1 = this.e.c;
                if(ibnf1 == null) {
                    ibuq.j("cache");
                    ibnf1 = null;
                }
                csus csus0 = (csus)ibnf1.get();
                ibuq.c(((Account)object7));
                this.a = object3;
                this.b = (Account)object7;
                this.c = 1;
                if(csus0.e(((Account)object7), this) == object1) {
                    break;
                }
                object2 = object3;
                object6 = (Account)object7;
                continue;
            }
            return ibom.a;
        }
        return object1;
    }
}

