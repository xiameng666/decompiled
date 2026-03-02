import android.accounts.Account;
import com.google.android.gms.common.Feature;

public final class budd {
    private final buct a;
    private final azts b;

    public budd(buct buct0, azts azts0) {
        ibuq.f(buct0, "escalationAccountManager");
        ibuq.f(azts0, "selectedAccountManagerClient");
        super();
        this.a = buct0;
        this.b = azts0;
    }

    public final Object a(Account account0, ibrl ibrl0) {
        budb budb0;
        if((ibrl0 instanceof budb)) {
            budb0 = (budb)ibrl0;
            int v = budb0.d;
            if((v & 0x80000000) == 0) {
                budb0 = new budb(this, ibrl0);
            }
            else {
                budb0.d = v - 0x80000000;
            }
        }
        else {
            budb0 = new budb(this, ibrl0);
        }
        Object object0 = budb0.b;
        Object object1 = ibrx.a;
        switch(budb0.d) {
            case 0: {
                ibnx.b(object0);
                budb0.a = account0;
                budb0.d = 1;
                object0 = this.a.a(account0, bucp.b, budb0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                account0 = budb0.a;
                ibnx.b(object0);
            label_21:
                if(((Boolean)object0).booleanValue()) {
                    return new budk("Dasher account");
                }
                budb0.a = account0;
                budb0.d = 2;
                object0 = this.a.a(account0, bucp.c, budb0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_30;
            }
            case 2: {
                account0 = budb0.a;
                ibnx.b(object0);
            label_30:
                if(((Boolean)object0).booleanValue()) {
                    return new budk("Griffin account");
                }
                budb0.a = account0;
                budb0.d = 3;
                object0 = this.a.a(account0, bucp.d, budb0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_39;
            }
            case 3: {
                account0 = budb0.a;
                ibnx.b(object0);
            label_39:
                if(((Boolean)object0).booleanValue()) {
                    return new budk("Unicorn account");
                }
                budb0.a = null;
                budb0.d = 4;
                object0 = this.a.a(account0, bucp.a, budb0);
                if(object0 == object1) {
                    return object1;
                }
                return ((Boolean)object0).booleanValue() ? budj.a : budl.a;
            }
            case 4: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        return ((Boolean)object0).booleanValue() ? budj.a : budl.a;
    }

    public final Object b(ibrl ibrl0) {
        budc budc0;
        if((ibrl0 instanceof budc)) {
            budc0 = (budc)ibrl0;
            int v = budc0.d;
            if((v & 0x80000000) == 0) {
                budc0 = new budc(this, ibrl0);
            }
            else {
                budc0.d = v - 0x80000000;
            }
        }
        else {
            budc0 = new budc(this, ibrl0);
        }
        Object object0 = budc0.b;
        Object object1 = ibrx.a;
        switch(budc0.d) {
            case 0: {
                ibnx.b(object0);
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{buuh.a};
                azzc0.a = new buwx();
                azzc0.d = 37801;
                azzd azzd0 = azzc0.a();
                evql evql0 = this.b.iG(azzd0);
                budc0.d = 1;
                object0 = ictn.b(evql0, budc0);
                if(object0 != object1) {
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_25:
                if(((String)object0) == null) {
                    return null;
                }
                Account account0 = new Account(((String)object0), "com.google");
                budc0.a = account0;
                budc0.d = 2;
                object0 = this.a(account0, budc0);
                if(object0 != object1) {
                    return (object0 instanceof budj) ? account0 : null;
                }
                return object1;
            }
            case 2: {
                Object object2 = budc0.a;
                ibnx.b(object0);
                return (object0 instanceof budj) ? object2 : null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

