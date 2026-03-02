import android.accounts.Account;
import android.content.Context;
import android.os.UserHandle;

public final class aspd {
    public final Context a;
    public final icnj b;
    private final aqga c;
    private final icck d;
    private final ibnn e;
    private final atof f;
    private final icnl g;

    static {
        bboh.b("EnableHealthDataBackupsUseCase", bbcu.dF);
    }

    public aspd(aqga aqga0, atof atof0, Context context0, icck icck0) {
        ibuq.f(aqga0, "g1BackupClient");
        ibuq.f(icck0, "coroutineScope");
        super();
        this.c = aqga0;
        this.f = atof0;
        this.a = context0;
        this.d = icck0;
        this.e = new ibnz(new asov(this));
        icnl icnl0 = icnm.a(aqqe.a);
        this.g = icnl0;
        this.b = iclp.b(new icns(icnl0, new aspa(this, null)), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(ibrl ibrl0) {
        Boolean boolean1;
        aspb aspb0;
        if((ibrl0 instanceof aspb)) {
            aspb0 = (aspb)ibrl0;
            int v = aspb0.c;
            if((v & 0x80000000) == 0) {
                aspb0 = new aspb(this, ibrl0);
            }
            else {
                aspb0.c = v - 0x80000000;
            }
        }
        else {
            aspb0 = new aspb(this, ibrl0);
        }
        Object object0 = aspb0.a;
        Object object1 = ibrx.a;
        switch(aspb0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.c.e();
                aspb0.c = 1;
                object0 = ictn.b(evql0, aspb0);
                if(object0 != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                evql evql1 = this.f.a();
                aspb0.d = (Boolean)object0;
                aspb0.c = 2;
                Object object2 = ictn.b(evql1, aspb0);
                if(object2 != object1) {
                    Boolean boolean0 = (Boolean)object0;
                    object0 = object2;
                    boolean1 = boolean0;
                    break;
                }
                return object1;
            }
            case 2: {
                boolean1 = aspb0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return boolean1.booleanValue() && ((Account)object0) != null ? new asoy(((Account)object0)) : new asox(((Account)object0));
    }

    public final Object b(ibrl ibrl0) {
        Object object2;
        boolean z1;
        icnl icnl0;
        aspc aspc0;
        if((ibrl0 instanceof aspc)) {
            aspc0 = (aspc)ibrl0;
            int v = aspc0.e;
            if((v & 0x80000000) == 0) {
                aspc0 = new aspc(this, ibrl0);
            }
            else {
                aspc0.e = v - 0x80000000;
            }
        }
        else {
            aspc0 = new aspc(this, ibrl0);
        }
        Object object0 = aspc0.c;
        Object object1 = ibrx.a;
        switch(aspc0.e) {
            case 0: {
                ibnx.b(object0);
                boolean z = ((aqjk)this.e.a()).j(UserHandle.of(UserHandle.myUserId()));
                icnl0 = this.g;
                z1 = z;
                goto label_25;
            }
            case 1: {
                z1 = aspc0.a;
                object2 = aspc0.b;
                icnl0 = aspc0.f;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            for(aqqf aqqf0 = new aqqf(object0); true; aqqf0 = new aqqd(new asow())) {
                if(icnl0.h(object2, aqqf0)) {
                    return ibom.a;
                }
            label_25:
                object2 = icnl0.b();
                aqqh aqqh0 = (aqqh)object2;
                if(z1) {
                    break;
                }
            }
            aspc0.f = icnl0;
            aspc0.b = object2;
            aspc0.a = true;
            aspc0.e = 1;
            object0 = this.a(aspc0);
        }
        while(object0 != object1);
        return object1;
    }
}

